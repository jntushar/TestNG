package Booking;

import org.testng.annotations.Test;

public class BookFlight2 {
	
	@Test
	public void BookFlight_RoundTrip_TestCase1() {
		System.out.println("Book Flight Round Trip Test Case 1");
	}
	
	@Test(groups= {"Regression"})
	public void BookFlight_RoundTrip_TestCase2() {
		System.out.println("Book Flight Round Trip Test Case 2");
	}
	
	@Test
	public void BookFlight_OneWay_TestCase1() {
		System.out.println("Book Flight One Way Test Case 1");
	}
	
	@Test(groups= {"Regression"})
	public void BookFlight_OneWay_TestCase2() {
		System.out.println("Book Flight One Way Test Case 2");
	}
}
