package HandlingDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingSingleSelectDD {
	@Test
	public void singleSelectDD() throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		// identify the dropdown
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByValue("search-alias=videogames-intl-ship");
		Thread.sleep(2000);
		s.selectByVisibleText("Tools & Home Improvement");
		Thread.sleep(2000);
//		s.selectByContainsVisibleText("Bab");
//		Thread.sleep(2000);

		// fetch all the options
		List<WebElement> opt = s.getOptions();
		for (WebElement ele : opt) {
			System.out.println("all options:" + ele.getText());
		}
		// check dropdown whether it is multi select
		if (s.isMultiple()) {
			System.out.println("multi select DD");
		} else {
			System.out.println("single select DD");
		}
		List<WebElement> opts = s.getAllSelectedOptions();
		for (WebElement ele : opts) {
			System.out.println("Selected options:"+ele.getText());
		}
		//fetch first selected option
		WebElement fsopt = s.getFirstSelectedOption();
		System.out.println("fist selected option:"+ fsopt.getText());
		// close the browser
		driver.quit();
	}
}
