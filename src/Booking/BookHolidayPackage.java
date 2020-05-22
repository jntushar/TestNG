package Booking;

import org.testng.annotations.Test;

public class BookHolidayPackage {

	@Test(groups= {"Regression"})
	public void BookHolidayPackage_destination() {
		System.out.println("BookHolidayPackage Test Case 1");
	}
	
	@Test
	public void BookHolidayPackage_departure() {
		System.out.println("BookHolidayPackage Test Case 2");
	}
	
	@Test
	public void BookHolidayPackage_return() {
		System.out.println("BookHolidayPackage Test Case 3");
	}
	
}
