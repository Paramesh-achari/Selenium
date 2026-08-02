package UsingJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandingDisabledElemets {
	@Test
	public void disabledElements() throws InterruptedException {
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to the application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		//identify disabled tab and click on it
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(3000);
		
		//identify disabled TF and pass the text 
		WebElement disbaledTF = driver.findElement(By.id("name"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("arguments[0].removeAttribute('disabled')",disbaledTF);--->2nd way
		 disbaledTF.sendkeys("salaar");
		 */
		js.executeScript("arguments[0].value=arguments[1]",disbaledTF,"salaar");//-->1st way(optimized way)
		Thread.sleep(3000);
		
		//identify the button tab and click on it
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(3000);
		
		//identify the disabled link and click on it
		driver.findElement(By.linkText("Disabled")).click();
		
		//identify the disabled btn and click on it
		WebElement disabledbtn = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].removeAttribute('disabled')", disabledbtn);
		disabledbtn.click();
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
}
