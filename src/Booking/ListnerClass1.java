package Booking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnerClass1 {
	
	@Test
	public void Class_testcase1() {
		Assert.assertEquals("Hi", "Hi");
	}
	
	@Test
	public void Class_testcase2() {
		Assert.assertEquals("HI", "hi");
	}

}
