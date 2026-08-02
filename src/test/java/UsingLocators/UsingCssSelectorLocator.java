package UsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorLocator {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to an application
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(7000);
	//identify the textfield and pass the text
	driver.findElement(By.cssSelector("input[id='name']")).sendKeys("selenium");
	//identify the textfield and pass the text
	driver.findElement(By.cssSelector
			("input[placeholder='Enter Your Email']")).sendKeys("selenium@123");
	//identify the password textfield and pass the text
	driver.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]")).sendKeys("sele@123");
	//identify the register button and click on it
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
}
}
