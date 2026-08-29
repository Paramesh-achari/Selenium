package UsingAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {
	@Test
	public void hardAssert() throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to an application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//validate the webpage
		String acttitle=driver.getTitle();
		String exptitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		if (acttitle.contains(exptitle)) {
//			System.out.println("Test pass");
//		}else {
//			System.out.println("Test fail");
//		}
//		Assert.assertEquals(acttitle, exptitle,"failed msg: validating tite");
		Assert.assertTrue(acttitle.equals(exptitle),"error:actual title is not matching with expected title");
		System.out.println("Assert pass");
		//close the browser
		driver.quit();
	}
}
