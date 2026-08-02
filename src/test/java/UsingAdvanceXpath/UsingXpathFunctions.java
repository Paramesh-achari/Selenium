package UsingAdvanceXpath;

import org.openqa.selenium.By;

import Utilites.WebdriverUtilities;

public class UsingXpathFunctions {
	public static void main(String[] args) throws InterruptedException {
		WebdriverUtilities utl = new WebdriverUtilities();
		// launch the browser
		utl.launchTheBrowser();
		// maximize
		utl.maximizeTheWindow();
		// navigate to an app
		utl.navigateToAnApp("https://www.flipkart.com/");
		Thread.sleep(5000);
		// close the popup
		utl.driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(5000);
		// identify the search text field using starts with
		//// input[starts-with(@title,'S') and not(@readonly)]
		utl.driver.findElement(By.xpath("//input[starts-with(@title,'S') and @name='q']")).sendKeys("mobiles");
		Thread.sleep(5000);
		// identify the search icon using name()
		utl.driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		Thread.sleep(5000);
		//close the browser
		utl.closeAllWindows();

	}
}
