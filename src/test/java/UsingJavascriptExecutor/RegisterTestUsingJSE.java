package UsingJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTestUsingJSE {
	@Test
	public void reisterJSE() throws InterruptedException {
	
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]","https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		//fetch the title
		System.out.println(js.executeScript("return document.title"));
		
		//fetch the url
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(3000);
		
		//identify name TF and pass the text
		WebElement nameTF = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value=arguments[1]", nameTF,"salaar");
		Thread.sleep(3000);
		
		//identify register button and click on it
		WebElement regbtn = driver.findElement(By.xpath("//button[text()='Register']"));
		js.executeScript("arguments[0].click", regbtn);
		Thread.sleep(3000);
		
		//refresh the webpage 
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
	}
}
