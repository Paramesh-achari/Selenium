package POMUtilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import PomUtilities.RegisterPomPage;
import Utilites.WebdriverUtilities;

public class AppRegisterTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//fetch the data from the property file
		FileInputStream fis=new FileInputStream("./src/test/resources/RegData.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String name = p.getProperty("username");
		String email = p.getProperty("emailid");
		String password = p.getProperty("password");
		//using utilities
		WebdriverUtilities wutl=new WebdriverUtilities();
		//launch the browser
		wutl.launchTheBrowser();
		//maximize the window
		wutl.maximizeTheWindow();
		//navigate to an application
		wutl.navigateToAnApp(url);
		Thread.sleep(3000);
		//identify the TF and pass text
		RegisterPomPage reg=new RegisterPomPage(wutl.driver);
//		reg.getUserName(name);
//		Thread.sleep(2000);
//		//identify the email TF and pass text 
//		reg.getEmailId(email);
//		Thread.sleep(2000);
//		//identify the password TF and pass text
//		reg.getPswd(password);
//		Thread.sleep(2000);
//		//identify the register button and click on it
//		reg.getRegBtn();
//		Thread.sleep(3000);
		reg.register(name, email, password);
		Thread.sleep(5000);
		//quit the browser
		wutl.closeAllWindows();
	}
}
