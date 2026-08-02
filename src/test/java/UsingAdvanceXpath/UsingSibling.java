package UsingAdvanceXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSibling {

	public static void main(String[] args) {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://www.amazon.com/");

	}
}
