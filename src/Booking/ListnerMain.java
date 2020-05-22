package Booking;

import org.testng.ITestListener;
import org.testng.ITestResult;

//iTestListner
public class ListnerMain implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("My Test Case Passed " + result.getName() + result.getTestClass());
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("My Test Case Failed " + result.getName() + result.getTestClass());
		System.out.println("Error Message: " +  result.getThrowable());
	  }
	
	public void onTestSkipped(ITestResult result) {
	    
	  }

}
