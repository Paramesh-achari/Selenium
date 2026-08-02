package UsingRelativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingToRightOfAnfToLeftOfMethods {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		// identify telugu
		WebElement tel = driver.findElement(By.linkText("తెలుగు"));
		tel.click();
		Thread.sleep(3000);
		// click on left element
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(tel)).click();
		Thread.sleep(3000);
		// close the browser
		driver.quit();

	}
}
