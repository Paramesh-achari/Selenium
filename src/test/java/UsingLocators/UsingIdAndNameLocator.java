package UsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdAndNameLocator {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to an application
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	
	//identify the name text field and pass a text into it
	driver.findElement(By.id("name")).sendKeys("Admin224");
	Thread.sleep(2000);
	//identify the email text field and pass a text into it
	driver.findElement(By.id("email")).sendKeys("admin123@gmail.com");
	Thread.sleep(2000);
	//identify the password text field and pass a text into it
	driver.findElement(By.name("password")).sendKeys("Admin@123");
	Thread.sleep(2000);
	//identify the button and click on it
	driver.findElement(By.xpath("//button")).click();
	Thread.sleep(2000);
	//close the browser
	driver.quit();

}
}
