package UsingActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingMouseActions {
	@Test
	public void mouseActions() throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //navigate to an application
		 driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(3000);
		 
		 //scroll the webpage
		 Actions act=new Actions(driver);
		 act.scrollByAmount(100, 1000).perform();
		 Thread.sleep(3000);
		 //scroll the webpage until the ele is visible
		 WebElement footer = driver.findElement(By.xpath("//p[text()='Mobile Web UI Testing: Practical Examples']"));
		 act.scrollToElement(footer).perform();
		 Thread.sleep(4000);
		 //close the browser
		 driver.quit();
	}
}
