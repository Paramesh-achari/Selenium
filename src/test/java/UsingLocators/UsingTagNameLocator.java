package UsingLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagNameLocator {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to an application
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	//fetch all the links using tagname locator
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for (WebElement ele : links) {
		System.out.println(ele.getText());
		if (ele.getText().contains("Meta")) {
			//Actions act=new Actions(driver);
			//act.ScrollByAmount(0,10000).perform();--->it will scoll the page till bottom
			ele.click();
			break;
		}
	}
	Thread.sleep(2000);
	//close the browser
	driver.quit();
}
}
