package UsingTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NavigateToTheAppUsingTestng {
	@Test
	public void demoTest() throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to an application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		//validate the webpage
		String actlTitle=driver.getTitle();
		String exptdTitle="DemoApps | Qspiders | Text Box";
		
		if (actlTitle.contains(exptdTitle)) {
			Reporter.log("Test Pass",true);
		}
		else {
			Reporter.log("Test Fail",true);
		}
		Thread.sleep(5000);
		//close the browser
		driver.quit();
	}
}
