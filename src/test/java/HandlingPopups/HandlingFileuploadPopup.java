package HandlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;

public class HandlingFileuploadPopup {
	@Test
	public void fileuploadPopup() throws InterruptedException {
		WebdriverUtilities wutil=new WebdriverUtilities();
		//launch the browser
		wutil.launchTheBrowser();
		//maximize the window
		wutil.maximizeTheWindow();
		//implicit wait
		wutil.waitForAnElement(10);
		//navigate to an application
		wutil.navigateToAnApp("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		//identify choose file btn
		wutil.driver.findElement(By.id("file-upload")).sendKeys("D:\\My docs\\Paramesh_Achari_Kammari_Resume.pdf");
		Thread.sleep(2000);
		//identify the upload button and click on it
		wutil.driver.findElement(By.id("file-submit")).submit();
		Thread.sleep(2000);
		//close the browser
		wutil.closeAllWindows();
	}
	@Test
	public void UsingRobotclass() throws InterruptedException, AWTException {
		
		WebdriverUtilities wutil=new WebdriverUtilities();
		//launch the browser
		wutil.launchTheBrowser();
		//maximize the window
		wutil.maximizeTheWindow();
		//implicit wait
		wutil.waitForAnElement(10);
		//navigate to an application
		wutil.navigateToAnApp("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		
		//select the file and copy the path to clipboard
		StringSelection str= new StringSelection("D:\\My docs\\Paramesh_Achari_Kammari_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		//identify the choose file button 
		WebElement chooseFileBtn = wutil.driver.findElement(By.id("file-upload"));
		Actions act= new Actions(wutil.driver);
		act.click(chooseFileBtn).perform();
		Thread.sleep(5000);
		
		//press ctrl+v
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		//identify the upload button and click on it
		wutil.driver.findElement(By.id("file-submit")).submit();
		//close the browser
		wutil.closeAllWindows();
	}
}

