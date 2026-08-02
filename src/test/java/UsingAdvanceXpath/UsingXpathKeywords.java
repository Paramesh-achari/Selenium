package UsingAdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathKeywords {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to an application
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	//identify the email TF and pass email
	driver.findElement(By.xpath("//input[@type='tet' or @name='email']")).sendKeys("spidy@gmail.com");
	//identify the password TF and pass password
	driver.findElement(By.xpath("//input[@aria-invalid='false' and @type='password']")).sendKeys("spidy123");
	//identify the login button and click on it
	driver.findElement(By.xpath("")).click();
}
}
