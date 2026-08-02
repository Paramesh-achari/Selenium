package UsingScynchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class UsingFluentWait {
	@Test
	public void fluWait() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// navigate to an application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);

		// identify the nameTF
		WebElement nameTF = driver.findElement(By.id("name"));

		// wait for element to be visible using fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		// pass the duration
		wait.withTimeout(Duration.ofSeconds(20));
		// customize the polling period
		wait.pollingEvery(Duration.ofSeconds(1));
		// ignore the exceptions
		wait.ignoring(Exception.class);
		// condition to wait for element to be visible
		wait.until(ExpectedConditions.visibilityOf(nameTF));
		nameTF.sendKeys("salaar");
		
		//wait for title to match 
		String title="DemoApps | Qspiders | Text Box";
		wait.until(ExpectedConditions.titleContains(title));
		
		//close the browser
		driver.quit();

	}
}
