package HandlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingMultipleWindows {
	
	@Test
	public void multipleWindows() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		// close the popup
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(3000);

		// identify the search TF and search the product
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(3000);

		// identify the product and click on it
		driver.findElement(By.xpath("//div[text()='vivo X200T (Stellar Black, 256 GB)']")).click();
		// get the parent window id
			String pwid = driver.getWindowHandle();
		// fetch all child window ids
		Set<String> wids = driver.getWindowHandles();

		for (String str : wids) {
			driver.switchTo().window(str);
			if (driver.getTitle().contains("vivo X200T (256 GB Storage, 12 GB RAM)")) {
				Thread.sleep(2000);
				//identify the toggle and hover the mouse on it
				WebElement toggle = driver.findElement(By.xpath("//a[@title='Browse Flipkart categories']/following-sibling::img"));
				Actions act=new Actions(driver);
				act.moveToElement(toggle).perform();
				Thread.sleep(3000);
			}
			
		}
		
		//switch back to parent window
		driver.switchTo().window(pwid);
		Thread.sleep(3000);
		// close the browser
		driver.quit();
	}
}
