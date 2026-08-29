package UsingAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {
	@Test
	public void softAssert() throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		//identify the element
		WebElement loc = driver.findElement(By.id("glow-ingress-line2"));
		
		//validate the element
		SoftAssert so=new SoftAssert();
		String actText=loc.getText();
		String expText="India";
//		so.assertEquals(loc.isDisplayed(),true,"loc is not displayed");
		so.assertNotEquals(actText, expText,"validating delivery ele text");
		so.assertFalse(loc.isDisplayed(),"validating whether ele is displayed");
		String s=null;
		so.assertNotNull(s,"validating obj is null");
		
		System.out.println("Amazon validation");
		
		//close the browser
		driver.quit();
		
		so.assertAll();
		
	}
}
