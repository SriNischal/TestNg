package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("My test case started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("My test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("My test case failure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("My test case skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("My test case success percent is");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("My test case terminated");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
