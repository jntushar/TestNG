package Booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {
	
	@BeforeMethod
	public void BeforeMethodTestCase1() {
		System.out.println("Before Method Test Case 1");   // this will run(executed) before every test case
	}
	
	@AfterMethod
	public void AfterMethodTestCase1() {
		System.out.println("After Method Test Case 1");   // this will run(executed) after every test case
	}
	
	@BeforeTest
	public void BeforeTestTestCase1() {
		System.out.println("Before Test Case 1");
	}
	
	@Test
	public void BookFlight_RoundTrip_TestCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test(dependsOnMethods= {"BookFlight_RoundTrip_TestCase1"})   //dependencies
	public void BookFlight_RoundTrip_TestCase2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void BookFlight_OneWay_TestCase3() {
		System.out.println("Test Case 3");
	}
	
	@Test(enabled=false)
	public void BookFlight_OneWay_TestCase4() {
		System.out.println("Test Case 4");
	}
	
	@AfterTest
	public void AfterTestTestCase1() {
		System.out.println("After Test Case 1");
	}
}

