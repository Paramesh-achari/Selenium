package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage {

	// Declare
	@FindBy(name = "email")
	private WebElement emailTF;
	@FindBy(name = "pass")
	private WebElement pwdTF;
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginbtn;
	// Initialize
	public LoginPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilize
	public void getEmailTF(String emailid) {
		 emailTF.sendKeys(emailid);;
	}
	public void getPwdTF(String pswd) {
		 pwdTF.sendKeys(pswd);;
	}
	public void getLoginbtn() {
		 loginbtn.click();
	}
	//business logic
	 public void login(String emailid,String pswd) {
		emailTF.sendKeys(emailid);
		pwdTF.sendKeys(pswd);
		loginbtn.click();
	}
	
}
