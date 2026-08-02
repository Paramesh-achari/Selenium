package UsingRelativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingNearMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to an application
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(5000);
		//identify the password field
		WebElement bt1 = driver.findElement(By.tagName("button"));
		Thread.sleep(2000);
		//identify the near elements by using near method
		WebElement bt2 = driver.findElement(RelativeLocator.with(By.id("btn_two")).near(bt1));
		bt1.click();
		Thread.sleep(3000);
		bt2.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
