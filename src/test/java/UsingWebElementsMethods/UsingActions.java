package UsingWebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;

public class UsingActions {
	@Test
	public void elementTest() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		// identify the search field and pass text
		WebElement srchfield = driver.findElement(By.name("q"));
		srchfield.sendKeys("clothes");
		Thread.sleep(3000);
		// clear the field
		srchfield.clear();
		Thread.sleep(3000);
		// again enter pass the text in the search field
		srchfield.sendKeys("mobiles");
		Thread.sleep(3000);
		// click the search button by using submit action
		WebElement srchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		srchbtn.submit();
		Thread.sleep(3000);
		// identify the checkbox and check the box by using click action
		WebElement checkbox = driver.findElement(By.cssSelector("input[id='As']"));
		checkbox.click();
		Thread.sleep(3000);
	}

	@Test
	public void getters() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		// identify the element and fetch the details by using getter methods
		WebElement eletronics = driver.findElement(By.partialLinkText("Elec"));
		// fetch the text
		Reporter.log("text:" + eletronics.getText(), true);
		// fetch the attribute name
		Reporter.log("attribute name:" + eletronics.getAttribute("href"), true);
		// fetch the tag name
		Reporter.log("tagname:" + eletronics.getTagName(), true);
		// fetch the css properties
		Reporter.log("Css property:" + eletronics.getCssValue("min-height"), true);
		Reporter.log("Css property:" + eletronics.getCssValue("display"), true);
		// fetch the size
		Reporter.log("size:" + eletronics.getSize(), true);
		// fetch the location
		Reporter.log("location:" + eletronics.getLocation(), true);
		// fetch the xaxis and width
		Reporter.log("x-axis:" + eletronics.getRect().getX(), true);
		Reporter.log("Width:" + eletronics.getRect().getWidth(), true);
		Thread.sleep(3000);

		// close the browser
		driver.quit();

	}

	@Test
	public void validation() throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to an application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		//identify the signupTF
		WebElement signup = driver.findElement(By.id("newsletter-email"));
		Thread.sleep(5000);
		//validate whether the TF is displayed
		if (signup.isDisplayed()) {
			signup.sendKeys("selenium@gmail.com");
			Reporter.log("signupTF is displayed",true);
		}
		else {
			Reporter.log("signupTF is not displayed",true);
		}
		//identify the subscribe button
		WebElement subscribeBtn = driver.findElement(By.id("newsletter-subscribe-button"));
		Thread.sleep(5000);
		//validate whether the subscribe button is is enabled
		if (subscribeBtn.isEnabled()) {
			subscribeBtn.click();
			Thread.sleep(5000);
			Reporter.log("subscribe button is enabled",true);
		}
		else {
			Reporter.log("subscribe button is disabled",true);
		}
		driver.quit();
	}

}
