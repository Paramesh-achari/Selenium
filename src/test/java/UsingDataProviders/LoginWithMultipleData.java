package UsingDataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithMultipleData {
	@Test(dataProvider = "data")
	public void login(String userName, String password) throws InterruptedException {
	System.out.println(userName+" "+password);
	Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] data() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="Tony";
		obj[0][1]="stark@123";
		obj[1][0]="Steve";
		obj[1][1]="rogers@123";
		obj[2][0]="Thor";
		obj[2][1]="asgaurd@123";
		return obj;
	}
}
