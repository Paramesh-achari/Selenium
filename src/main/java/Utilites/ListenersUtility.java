package Utilites;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersUtility implements ISuiteListener, ITestListener {
	
	@Override
	public void onStart(ISuite suite) {
		Reporter.log("configuratiion of report on start", true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		Reporter.log(testname + " :Test exe started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		Reporter.log(testname + " :Test exe sucess", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		Reporter.log(testname + " :Test exe fail--screenshot", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		Reporter.log(testname + " :Test exe skipped", true);
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("configuratiion of report on finish", true);
	}

}
