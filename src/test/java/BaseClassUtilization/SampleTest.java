package BaseClassUtilization;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilites.Baseclass;

public class SampleTest extends Baseclass {
	@Test
	public void create() {
		Reporter.log("CreateTest", true);
	}
	@Test
	public void modify() {
		Reporter.log("ModifyTest",true);
	}
}
