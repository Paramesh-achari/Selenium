package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingHiddenDivisionPopupOnDemoApp {
	@Test
	public void addCostomer() throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//launch the browser
		WebDriver driver=new ChromeDriver(opt);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//identify the popup and click on it
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		
		//identify the hidden division and click on it 
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(2000);
		
		//identify the add customer button and click on it
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		Thread.sleep(2000);
		
		//identify the textfields and fill the details
		driver.findElement(By.xpath("//input[@id='customerName']")).sendKeys("salaar");
		driver.findElement(By.xpath("//input[@id='customerEmail']")).sendKeys("varada@gmail.com");
		Thread.sleep(2000);
		//identify the drop down and select option
		WebElement prod = driver.findElement(By.xpath("//select[@id='prod']"));
		Select s= new Select(prod);
		s.selectByValue("Mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("salaar devaratha raisar");
		Thread.sleep(2000);
		//identify the text area and pass text
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//identify the name ele
		WebElement name = driver.findElement(By.xpath("//td[text()='salaar']"));
		
		if (name.isDisplayed()) {
			System.out.println("test pass");
		}
		else {
			System.err.println("test fail");
		}
		
		//identify the notification section and click on it
		driver.findElement(By.xpath("//section[text()='Notifications']")).click();
		Thread.sleep(2000);
		
		//identify the notification button and click on it
		driver.findElement(By.xpath("//button[@id='browNotButton']")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		
		
	}
}
