package UsingLocators;

import org.openqa.selenium.By;

import Utilites.WebdriverUtilities;

public class UsingClassNameLocator {
public static void main(String[] args) throws InterruptedException {
	WebdriverUtilities wut=new WebdriverUtilities();
	//launch the browser
	wut.launchTheBrowser();
	//maximize the window
	wut.maximizeTheWindow();
	//navigate to an application
	wut.navigateToAnApp("https://demoapps.qspiders.com/ui/button?sublist=0");
	Thread.sleep(5000);
	//identify the button and click on it
	wut.driver.findElement(By.className("active:bg-green-400")).click();
	Thread.sleep(2000);
	//close the browser
	wut.driver.quit();
}
}
