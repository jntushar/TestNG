package Booking;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pmt {

	@Parameters({"URL","Username","Password"})
	@Test
	public void tc1(String url,String Uname, String pwd) {
		System.out.println("My URL name is " + url);
		System.out.println("My Database Username is " + Uname);
		System.out.println("My Database password is " + pwd);
	}
	
}
