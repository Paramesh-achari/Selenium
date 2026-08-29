package ListenersUtilization;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilites.Baseclass;

@Listeners(Utilites.ListenersUtility.class)
public class DemoTest extends Baseclass {
	@Test
	public void demo() {
		Reporter.log("Listeners test", true);
//		Assert.fail();
	}
}
