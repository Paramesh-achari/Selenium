package UsingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;

public class HandlingDragAndDrop {
@Test
public void dragAndDrop() throws InterruptedException {
	WebdriverUtilities wutil= new WebdriverUtilities();
	//launch the browser
	wutil.launchTheBrowser();
	
	//maximize the window
	wutil.maximizeTheWindow();
	
	//implicit wait
	wutil.waitForAnElement(10);
	
	//navigate to an application
	wutil.navigateToAnApp("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
	Thread.sleep(3000);
	
	//identify the draggable element
	WebElement draggableEle1 = wutil.driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement draggableEle2 = wutil.driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	WebElement draggableEle3 = wutil.driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement draggableEle4 = wutil.driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	
	//identify the dropable location
	WebElement dropableLoc1 = wutil.driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
	WebElement dropableLoc2 = wutil.driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
	
	Actions act=new Actions(wutil.driver);
	act.dragAndDrop(draggableEle1, dropableLoc1).perform();
	act.dragAndDrop(draggableEle2, dropableLoc1).perform();
	act.dragAndDrop(draggableEle3, dropableLoc2).perform();
	act.dragAndDrop(draggableEle4, dropableLoc2).perform();
	Thread.sleep(3000);
	
	//close the the browser
	wutil.closeAllWindows();
	
}
}
