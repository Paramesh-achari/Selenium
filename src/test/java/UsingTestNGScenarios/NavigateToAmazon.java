package UsingTestNGScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigateToAmazon {
	@Parameters("browser")
	@Test(groups = "regression")
	public void amazon(String browser) throws InterruptedException {
		// launch the browser
		WebDriver driver = null; 
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else if (browser.equals("edge"))
			driver=new EdgeDriver();
		else if (browser.equals("firefox"))
			driver=new FirefoxDriver();
		else
			driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		Reporter.log("amazon",true);
		// close the browser
		driver.quit();
	}
}
