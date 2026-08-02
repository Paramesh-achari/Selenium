package UsingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;

public class HandlingMouserHover_ClickAndHold {
	@Test
	public void hoverAndHold() throws InterruptedException {
		WebdriverUtilities wutil=new WebdriverUtilities();
		//launch the browser
		wutil.launchTheBrowser();
		//maximize the window
		wutil.maximizeTheWindow();
		//implicit wait
		wutil.waitForAnElement(10);
		//navigate to an application
		 wutil.navigateToAnApp("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		 Thread.sleep(3000);
		 //identify the icon and mouse hover on it
		 WebElement icon = wutil.driver.findElement(By.xpath("//img[contains(@src,'hint')]"));
		 Actions act=new Actions(wutil.driver);
		 act.moveToElement(icon).perform();
		 Thread.sleep(3000);
		 //navigate to click and hold page
		 wutil.navigate_StringUrl("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		 Thread.sleep(3000);
		 
		 //identify the circle and click and hold
		 WebElement circle = wutil.driver.findElement(By.id("circle"));
		 act.clickAndHold(circle).perform();
		 Thread.sleep(3000);
		 act.release(circle).perform();
		 Thread.sleep(3000);
		 
		 //close the browser
		 wutil.closeAllWindows();
	}
}
