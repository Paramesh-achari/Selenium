package UsingActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingKeyBoardActions {
	@Test
	public void keyboardActions() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to the application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		// close the pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		// identify the search element and perform actions 
		WebElement srch = driver.findElement(By.name("q"));

		Actions act = new Actions(driver);
		act.moveToElement(srch).keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).keyDown(Keys.ENTER).perform();
		Thread.sleep(3000);
		// close the browser
		driver.quit();
	}
}
