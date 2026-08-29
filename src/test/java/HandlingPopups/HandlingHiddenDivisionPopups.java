package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandlingHiddenDivisionPopups {
	@Test
	public void hiddenPopups() throws InterruptedException {

		// disable notifications popup
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");// it disable the notifications
		opt.addArguments("--disable-geolocation");// its disable the location

		// launch the browser
		WebDriver driver = new ChromeDriver(opt);

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);

		// close the popup
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		
		//identify the qr close icon and click on it
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		

		// identify from and click on it
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(2000);
		
		//identify the TF and pass kurn
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("kurn");
		Thread.sleep(2000);
		
		//identify the auto suggestion and click on it
		driver.findElement(By.xpath("//p[text()='Kurnool Airport']")).click();
		Thread.sleep(2000);
		
		//identify the to and click on it
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		Thread.sleep(2000);
		
		//identify the TF and pass hyd
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("hyd");
		Thread.sleep(2000);
		
		//identify the RGA auto suggestion and click on it 
		driver.findElement(By.xpath("//p[contains(text(),'Rajiv Gandhi')]")).click();
		Thread.sleep(2000);
		
		//identify the date and click on it
		driver.findElement(By.xpath("//div[contains(text(),'Sep')]/ancestor::div[@class='DayPicker-Month']"
				+ "/descendant::div[contains(@aria-label,'14')]")).click();
		Thread.sleep(2000);
		
		// close the browser
		driver.quit();

	}

}
