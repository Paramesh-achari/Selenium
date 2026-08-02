package Utilites;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtilities {
	public WebDriver driver = null;

	// launch the browser
	public void launchTheBrowser() {
		driver = new ChromeDriver();
	}

	// navigate to an application
	public void navigateToAnApp(String url) {
		driver.get(url);
	}

	// fetch the title
	public String fetchWebPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	// fetch the url
	public String fetchCurrentUrl() {
		return driver.getCurrentUrl();

	}

	// fetch the source code
	public String fetchTheSourceCode() {
		String sc = driver.getPageSource();
		return sc;
	}

	// close the browser
	public void closeTheWindow() {
		driver.close();
	}

	// quit the browser
	public void closeAllWindows() {
		driver.quit();
	}

	// maximize the window
	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}

	// minimize the window
	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}

	// window fullscreen
	public void windowFullscreen() {
		driver.manage().window().fullscreen();
		;
	}

	// fetch the window size
	public Dimension fetchTheWndowSize() {
		Dimension dim = driver.manage().window().getSize();
		return dim;
	}

	// fetch the window position
	public Point fetchTheWindowPosition() {
		Point p = driver.manage().window().getPosition();
		return p;
	}

	// set the window size
	public void setWindowSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	// set the window position
	public void setWindowPosition(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}

	// navigate to next page
	public void navigateToNext_WP() {
		driver.navigate().forward();
	}

	// navigate to the previous page
	public void navigateToPrevious_WP() {
		driver.navigate().back();
	}

	// navigate to next page
	public void refreshTheWebpage() {
		driver.navigate().refresh();
	}

	// navigate to new page/url
	public void navigate_StringUrl(String url) {
		driver.navigate().to(url);
	}

	// navigate to new page/url
	public void navigate_URLUrl(String url) throws MalformedURLException {
		driver.navigate().to(new URL(url));
	}

	// Fetch the single window id
	public String fetchOneWindowID() {
		String wid = driver.getWindowHandle();
		return wid;
	}

	// Fetch the all window ids
	public Set<String> fetchAllWindowIDs() {
		Set<String> wids = driver.getWindowHandles();
		return wids;
	}

	// implicit wait
	public void waitForAnElement(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	// handle DD using selectByIndex
	public void selectDDByIndex(WebElement dropdown, int index) {
		Select s = new Select(dropdown);
		s.selectByIndex(index);
	}

	// handle DD using selectByValue
	public void selectDDByValue(WebElement dropdown, String value) {
		Select s = new Select(dropdown);
		s.selectByValue(value);
	}

	// handle DD using selectByValue
	public void selectDDByText(WebElement dropdown, String text) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
	}

	// handle DD using deselectByIndex
	public void deselectDDByIndex(WebElement dropdown, int index) {
		Select s = new Select(dropdown);
		s.deselectByIndex(index);
	}

	// handle DD using deselectByValue
	public void deselectDDByValue(WebElement dropdown, String value) {
		Select s = new Select(dropdown);
		s.deselectByValue(value);
	}

	// handle DD using deselectByValue
	public void deselectDDByText(WebElement dropdown, String text) {
		Select s = new Select(dropdown);
		s.deselectByVisibleText(text);
	}

	// handle DD using deselectAll
	public void deselectALLDD(WebElement dropdown) {
		Select s = new Select(dropdown);
		s.deselectAll();
	}
	//explicit wait
	public void waitForElementVisibility(long time, WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}