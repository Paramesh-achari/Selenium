package HandlingAutoSugg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FetchAllSugg {
	@Test
	public void autoSuggestions() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		// identify the search field and pass partial text
		driver.findElement(By.id("APjFqb")).sendKeys("marv");
		//identify the all suggestion list
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='marv']"));
		
		for (WebElement ele : list) {
			System.out.println(ele.getText());
			if (ele.getText().contains("list")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(4000);
		//close the browser
		driver.quit();
	}
}
