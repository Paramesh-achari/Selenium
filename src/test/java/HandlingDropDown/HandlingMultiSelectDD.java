package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilites.WebdriverUtilities;


public class HandlingMultiSelectDD {
	@Test
	public void multiSelect() throws InterruptedException {
		
		WebdriverUtilities wutil= new WebdriverUtilities();
		
		// launch the browser
		wutil.launchTheBrowser();
		// maximize the window
		wutil.maximizeTheWindow();
		// implicit wait
		wutil.waitForAnElement(10);
		// navigate to the application
		wutil.navigateToAnApp("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(5000);
		// identify the DD
		WebElement dropdown = wutil.driver.findElement(By.id("select-multiple-native"));

		
		// check DD whether it is multi select
//		if (s.isMultiple()) {
//			System.out.println("Multi select dropdown");
//		} else {
//			System.out.println("single select dropdown");
//		}
		// select the option
		wutil.selectDDByIndex(dropdown,4);
		Thread.sleep(2000);
		wutil.selectDDByValue(dropdown, "Mens Casual Premium Slim Fit T-Shirts ");
		Thread.sleep(2000);
		wutil.selectDDByText(dropdown, "Mens Cotton Jacket...");
		Thread.sleep(2000);
		//for deselect purpose
		wutil.selectDDByIndex(dropdown,1);
		Thread.sleep(2000);
		wutil.selectDDByValue(dropdown,"Opna Women's Short Sleeve Moisture");
		Thread.sleep(2000);
		wutil.selectDDByText(dropdown,"DANVOUY Womens T Shi...");
		Thread.sleep(2000);

		// fetch all the options
		Select s = new Select(dropdown);
		List<WebElement> allopts = s.getOptions();
		for (WebElement ele : allopts) {
			Reporter.log("All options:" + ele.getText(),true);
		}
		// fetch the selected options
		List<WebElement> sopts = s.getAllSelectedOptions();
		for (WebElement ele : sopts) {
			Reporter.log("Selected options:" + ele.getText(),true);
		}
		// fetch the first selected option
		WebElement fsopt = s.getFirstSelectedOption();
		Reporter.log("First selected option:" + fsopt.getText(),true);
		//deselect the selected options
		wutil.deselectDDByIndex(dropdown, 4);
		Thread.sleep(2000);
		wutil.deselectDDByValue(dropdown, "Mens Casual Premium Slim Fit T-Shirts ");
		Thread.sleep(2000);
		wutil.deselectDDByText(dropdown, "Mens Cotton Jacket...");
		Thread.sleep(2000);
		wutil.deselectALLDD(dropdown);
		Thread.sleep(2000);
		//close the browser
		wutil.closeAllWindows();
	}
}
