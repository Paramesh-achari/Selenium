package ListenersUtilization;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilites.Baseclass;
@Listeners(Utilites.ListenersUtility.class)
public class SampleTest extends Baseclass {
	@Test
	public void sample() {
		Reporter.log("Listeners Test",true);
	}
}
