package UsingHtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAbsolutePath {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to the webpage
	driver.get("file:///C:/Users/param/OneDrive/Desktop/login.html");
	//validate the webpage using title
	String actlTitle = driver.getTitle();
	String exptdTitle="LoginPage";
	if (actlTitle.equals(exptdTitle)) {
		System.out.println("Test pass");
	}
	else {
		System.err.println("Test fail");
	}
	//identify the username TextField and pass the text into it 
	WebElement usernameTF = driver.findElement(By.xpath("html/body/input[1]"));
	usernameTF.sendKeys("saturo gojo");
	//identify the password Text Field and the text into it
	WebElement passwordTF = driver.findElement(By.xpath("html/body/input[2]"));
	passwordTF.sendKeys("gojo@123");
	//identify the login button and click on it
	driver.findElement(By.xpath("html/body/button[1]")).click();
	//identify the forgot password link and click on it
	driver.findElement(By.xpath("html/body/a")).click();
	Thread.sleep(3000);
	//close the window
	driver.quit();
}
}
