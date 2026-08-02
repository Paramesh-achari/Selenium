package UsingAdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGroupByIndex {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to an application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		//identify the name textfield using indexing
		driver.findElement(By.xpath("//input[1]")).sendKeys("selenium");
		Thread.sleep(5000);
		//close the browser
		driver.quit();
		
	}
}
