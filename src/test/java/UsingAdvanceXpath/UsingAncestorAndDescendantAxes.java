package UsingAdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAncestorAndDescendantAxes {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to an application
	driver.get("https://www.amazon.in/?tag=amazonitt01-21&gad_source=1");
	Thread.sleep(7000);
	//identify search textfield
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys"+Keys.ENTER);
	Thread.sleep(10000);
	//identify the price
	WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Babique')]/ancestor::div[contains(@class,'a-section a-spacing-small')]/descendant::span[@class='a-price-whole']"));
	System.out.println(price.getText());
	Thread.sleep(10000);

	//close the browser
	driver.quit();
	
}
}
