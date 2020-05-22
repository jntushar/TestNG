package Booking;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PmtDp {
	
	@Test(dataProvider="myData1")
	public void tc1(String uname, String pwd) {
		System.out.println("Test Case 1 should run for 4 sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@Test(dataProvider="myData1")
	public void tc2(String uname, String pwd) {
		System.out.println("Test Case 2 should run for 4 sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	

	@DataProvider(name="myData1")
	public Object[][] myDataProvider1() {
		Object[][] obj = new Object[4][2];
		obj[0][0]="user1";
		obj[0][1]="pwd1";
		
		obj[1][0]="user2";
		obj[1][1]="pwd2";
		
		obj[2][0]="user3";
		obj[2][1]="pwd3";
		
		obj[3][0]="user4";
		obj[3][1]="pwd4";
		
		return obj;
	}
}
