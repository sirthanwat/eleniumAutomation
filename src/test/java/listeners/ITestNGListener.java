package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestNGListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart....." + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess....." + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure....." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped....." + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
