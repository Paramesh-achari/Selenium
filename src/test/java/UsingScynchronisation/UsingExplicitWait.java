package UsingScynchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UsingExplicitWait {
	@Test
	public void expWait() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// navigate to an application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait for title visible
		String title = "DemoApps | Qspiders | Text Box";
		wait.until(ExpectedConditions.titleContains(title));
		// identify the name TF
		WebElement nameTF = driver.findElement(By.id("name"));
		// wait until the element visible
		wait.until(ExpectedConditions.visibilityOf(nameTF));
		nameTF.sendKeys("salaar");
		Thread.sleep(3000);

		// identify the register button
		WebElement regBtn = driver.findElement(By.xpath("//button"));
		// wait until the element is clickable
		wait.until(ExpectedConditions.elementToBeClickable(regBtn));
		regBtn.click();
		// close the browser
		driver.quit();
	}
}
