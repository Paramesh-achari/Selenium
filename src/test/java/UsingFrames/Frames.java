package UsingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void switchToFrames() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.zomato.com/india");
		
		//identify login button and click
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//switch to frame using index
//		driver.switchTo().frame(2);--->using index
		
		//switch to frame using element reference
		WebElement frm = driver.findElement(By.xpath("//iframe[@id='auth-login-ui']"));
		driver.switchTo().frame(frm);
		Thread.sleep(2000);
		//identify the phno TF and pass phno in it
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9876541230");
		Thread.sleep(2000);
	
		//identify close icon and click on it 
		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		Thread.sleep(2000);
		
		//switch the control back to main webpage
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//identify add restaurant and  click on it
		driver.findElement(By.linkText("Add restaurant")).click();
	}
}
