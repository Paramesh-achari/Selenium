package ListenersUtilization;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilites.Baseclass;

@Listeners(Utilites.ListenersUtility.class)
public class RetryImplementation extends Baseclass{
	@Test(retryAnalyzer = Utilites.RetryAnalyser.class)
	public void loginTest() {
		Reporter.log("login",true);
		Assert.fail();
		
	}
}
