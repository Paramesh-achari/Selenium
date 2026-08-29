package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;

public class HandlingAlertPopups {
	@Test
	public void alertPopups() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		// identify the alert button and click on it
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);

		// handle the alert popup and click on ok button
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		// al.accept();
		al.dismiss();//

		// fetch the result
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		Thread.sleep(2000);

		// close the browser
		driver.quit();
	}

	@Test
	public void confirmationPopup() throws InterruptedException {
		WebdriverUtilities wutil = new WebdriverUtilities();

		// launch the browser
		wutil.launchTheBrowser();

		// maximize the window
		wutil.maximizeTheWindow();

		// implicit wait
		wutil.waitForAnElement(10);

		// navigate to an application
		wutil.navigateToAnApp("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		// identify the confirmation button and click on it
		wutil.driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);

		// handle confirmation popup and click on ok button
		Alert confirm = wutil.driver.switchTo().alert();
		System.out.println(confirm.getText());
		// confirm.accept();//clicks on ok button in popup
		confirm.dismiss();// clicks on cancel button in popup

		// fetch the result
		String result = wutil.driver.findElement(By.id("result")).getText();
		System.out.println(result);
		Thread.sleep(2000);

		// close the browser
		wutil.closeAllWindows();
	}

	@Test
	public void promptPopup() throws InterruptedException {
		WebdriverUtilities wutil = new WebdriverUtilities();

		// launch the browser
		wutil.launchTheBrowser();

		// maximize the window
		wutil.maximizeTheWindow();

		// implicit wait
		wutil.waitForAnElement(10);

		// navigate to an application
		wutil.navigateToAnApp("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		// identify the prompt alert button and click on it
		wutil.driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);

		// handle the alert and click on it
		Alert prompt = wutil.driver.switchTo().alert();
		System.out.println(prompt.getText());
		prompt.sendKeys("Salaar");
		prompt.accept();
		Thread.sleep(2000);

		// fetch the result
		String result = wutil.driver.findElement(By.id("result")).getText();
		System.out.println(result);
		Thread.sleep(2000);

		// close the browser
		wutil.closeAllWindows();
	}

}
