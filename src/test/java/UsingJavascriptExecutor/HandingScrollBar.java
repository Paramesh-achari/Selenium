package UsingJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandingScrollBar {
	@Test
	public void scrollBar() throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		//Scroll the webpage by using javascript executor
		//downcast the JSE 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,1000)");
		Thread.sleep(2000);
		
		//identify the element
		WebElement backtotop = driver.findElement(By.className("navFooterBackToTop"));
		//js.executeScript("arguments[0].scrollIntoView(true)",backtotop);
		
		//fetch element coordinates
		int xaxis = backtotop.getLocation().getX();
		int yaxis = backtotop.getLocation().getY();
		
		//js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(2000);
		
		//scroll to bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//scroll to top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}
}
