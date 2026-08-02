package UsingHtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	//launch the browser
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement actl = driver.findElement(By.xpath(""));
}
}
