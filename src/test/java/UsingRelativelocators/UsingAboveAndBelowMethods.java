package UsingRelativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveAndBelowMethods {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://www.facebook.com/");
		// identify the password text field and pass text into it
		WebElement pwd = driver.findElement(By.name("pass"));
		// identify the username and pass the text
		WebElement untf = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pwd));
		untf.sendKeys("selenium@gmail.com");
		pwd.sendKeys("Sele@1233");
		// identify the login button and click on it
		WebElement lgn=driver.findElement(RelativeLocator.with(By.tagName("span")).below(pwd));
				lgn.click();
		//identify the forgot password and click on it
		driver.findElement(RelativeLocator.with(By.tagName("a")).below(lgn)).click();
		Thread.sleep(5000);
		// close the browser
		driver.quit();

	}
}
