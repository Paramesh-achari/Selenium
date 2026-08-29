package Utilites;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeSuite
	public void bs() {
		Reporter.log("connect to DB", true);
	}

	@BeforeTest
	public void bt() {
		Reporter.log("configure parallel exe", true);
	}

	@BeforeClass
	public void bc() {
		Reporter.log("launch", true);
	}
	@BeforeMethod
	public void bm() {
		Reporter.log("login", true);
	}
	@AfterMethod
	public void am() {
		Reporter.log("logout", true);
	}
	@AfterClass
	public void ac() {
		Reporter.log("quit", true);
	}
	@AfterTest
	public void at() {
		Reporter.log("close configuration of parallel exe", true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("disconnect with DB", true);
	}
}
