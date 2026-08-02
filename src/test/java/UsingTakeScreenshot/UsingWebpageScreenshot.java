package UsingTakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UsingWebpageScreenshot {
	@Test
	public void webpageScreenshot() throws IOException, InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		// TAKE WEBPAGE SCREENSHOT
		// downcast TakesScreenshot interface with webdriver ref variable[CD obj
		// address]
		TakesScreenshot ts = (TakesScreenshot) driver;
		// store the file in temp folder
		File src = ts.getScreenshotAs(OutputType.FILE);
		// create an empty file object
		File dest = new File("./Selenium/flipkart.png");
		// copy the Screenshot
//		FileHandler.copy(src, dest);
		FileUtils.copyFile(src, dest);
		//close the browser
		driver.quit();
	}
}
