package BaseClassUtilization;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilites.Baseclass;

public class DemoTest extends Baseclass{
	@Test
	public void demo() {
		Reporter.log("demo",true);
	}
}
