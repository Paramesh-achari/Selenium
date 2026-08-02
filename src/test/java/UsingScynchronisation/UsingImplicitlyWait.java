package UsingScynchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingImplicitlyWait {
	@Test
	public void implcWait() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://www.shoppersstack.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// identify login button and click
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		// close the browser
		driver.quit();
	}

}
