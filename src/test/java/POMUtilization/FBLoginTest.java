package POMUtilization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtilities.LoginPomPage;

public class FBLoginTest {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		// navigate to an application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// identify the emailTF and pass text
//		WebElement emailTF = driver.findElement(By.name("email"));
//				emailTF.sendKeys("tanjiro");
//		Thread.sleep(3000);
//		
//		Thread.sleep(3000);
//		//again enter the name
//		emailTF.sendKeys("tanjiro");//StaleElementReferenceException
		
		//get emailTF and pass text by using pom
		LoginPomPage l=new LoginPomPage(driver);
		l.getEmailTF("tanjiro@gmail.com");
		Thread.sleep(3000);
		//refresh the page
		driver.navigate().refresh();
		Thread.sleep(3000);
//		l.getEmailTF("tanjiro@gmail.com");
//		Thread.sleep(3000);
//		//get passwordTF and pass text by using pom
//		l.getPwdTF("nezuko@123");
//		Thread.sleep(3000);
//		//get login button and click by using pom	
//		l.getLoginbtn();
//		Thread.sleep(3000);
		l.login("naruto@gmail.com", "minato@213");
		Thread.sleep(3000);
		//close the browser
		driver.quit();
		
	}
}
