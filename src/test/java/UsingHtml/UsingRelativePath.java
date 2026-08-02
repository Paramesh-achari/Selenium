package UsingHtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRelativePath {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigate to the webpage
		driver.get("file:///C:/Users/param/OneDrive/Desktop/login.html");
		// validate the webpage by using the title
		String actTitle = driver.getTitle();
		String exptTitle = "LoginPage";
		if (actTitle.equals(exptTitle)) {
			System.out.println("test pass");
		} else {
			System.err.println("test fail");
		}
		// identify the username TextField and pass the text into it
		WebElement usnTF = driver.findElement(By.xpath("//input[1]"));
		usnTF.sendKeys("admin");
		// identify the password TextField and pass the text into it
		WebElement pwdTF = driver.findElement(By.xpath("//input[2]"));
		pwdTF.sendKeys("admin@123");
		// identify the login button and click on it
		driver.findElement(By.xpath("//button[1]")).click();
		// identify the forgot password link and click on it
		driver.findElement(By.xpath("//a")).click();
		Thread.sleep(2000);
		//close the window
		driver.close();

	}
}
