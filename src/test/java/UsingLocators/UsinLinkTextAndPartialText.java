package UsingLocators;

import org.openqa.selenium.By;

import Utilites.WebdriverUtilities;

public class UsinLinkTextAndPartialText {
	public static void main(String[] args) throws InterruptedException {
		WebdriverUtilities utl=new WebdriverUtilities();
		// launch the browser
		utl.launchTheBrowser();
		// maximize the window
		utl.maximizeTheWindow();
		// navigate to an application
		utl.navigateToAnApp("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(8000);
		// identify the men link and click on it
//		utl.driver.findElement(By.linkText("Men")).click();
//		Thread.sleep(3000);
		utl.driver.findElement(By.partialLinkText("El")).click();
		Thread.sleep(3000);
		// close the browser
		utl.driver.quit();

	}
}
