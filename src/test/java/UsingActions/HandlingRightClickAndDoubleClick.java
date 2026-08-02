package UsingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Utilites.WebdriverUtilities;

public class HandlingRightClickAndDoubleClick {
	@Test
	public void rightAndDoubleClick() throws InterruptedException {
		
		WebdriverUtilities wutil=new WebdriverUtilities();
		
		//launch the browser
		wutil.launchTheBrowser();
		//maximize the window
		wutil.maximizeTheWindow();
		//implicit wait
		wutil.waitForAnElement(10);
		//navigate to an application
		wutil.navigateToAnApp("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		//identify the first element and right click on it
		Actions act=new Actions(wutil.driver);
		WebElement ele1 = wutil.driver.findElement(By.xpath("//span[text()='right click me']"));
		//right click 
		act.contextClick(ele1).perform();
		Thread.sleep(2000);
		//click again on the element
		act.click().perform();
		Thread.sleep(2000);
		//identify the second element and double click on it
		WebElement ele2 = wutil.driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(ele2).perform();
		Thread.sleep(2000);
		
		//close the browser
		wutil.closeAllWindows();
	}
}
