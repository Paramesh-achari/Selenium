package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPomPage {

	// declare
	@FindBy(name = "name")
	private WebElement nameTF;
	@FindBy(name = "email")
	private WebElement emailTF;
	@FindBy(name = "password")
	private WebElement pswdTF;
	@FindBy(xpath="//button[text()='Register']")
	private WebElement registerbtn;
	
	//initialize
	public RegisterPomPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//utilize
	 public void getUserName(String userName) {
		nameTF.sendKeys(userName);
	}
	 public void getEmailId(String emailId) {
			emailTF.sendKeys(emailId);
		}
	 public void getPswd(String pswd) {
			pswdTF.sendKeys(pswd);
		}
	 public void getRegBtn() {
		registerbtn.click();
	}
	 //business logic
	 public void register(String name, String email,String password) {
		 nameTF.sendKeys(name);
		 emailTF.sendKeys(email);
		 pswdTF.sendKeys(email);
		 registerbtn.click();
	}
}
