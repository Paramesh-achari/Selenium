package UsingTakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;

public class UsingWebElementScreenshot {
	@Test
	public void webElementScreenshot() throws IOException, InterruptedException {
		WebdriverUtilities wutil = new WebdriverUtilities();
		// launch the browser
		wutil.launchTheBrowser();

		// maximize the window
		wutil.maximizeTheWindow();

		// implicit wait
		wutil.waitForAnElement(10);

		// navigate to an application
		wutil.navigateToAnApp("https://www.amazon.com/");
		Thread.sleep(3000);

		// identify the elements
		WebElement searchTF = wutil.driver.findElement(By.id("twotabsearchtextbox"));
		WebElement logo = wutil.driver.findElement(By.id("nav-logo-sprites"));
		WebElement cooker = wutil.driver.findElement(By.xpath("//span[text()='Kitchen & Dining']/../../.."));

		// Take Screenshot of the identified elements

		// store the file in temp folder
		File srcSearch = searchTF.getScreenshotAs(OutputType.FILE);
		File srcLogo = logo.getScreenshotAs(OutputType.FILE);
		File srcCooker = cooker.getScreenshotAs(OutputType.FILE);
		// create an empty file
		File destSearch = new File("./WebElement_SS/searchTF.png");
		File destLogo = new File("./WebElement_SS/amazonLogo.png");
		File destCooker = new File("./WebElement_SS/cooker.png");

		// copy the Screenshot from src to dest
		FileUtils.copyFile(srcSearch, destSearch);
		FileUtils.copyFile(srcLogo, destLogo);
		FileUtils.copyFile(srcCooker, destCooker);
		// close the browser
		wutil.closeAllWindows();
	}
}
