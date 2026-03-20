package firsttestcase;

import org.testng.annotations.Test;

public class testcase {
	
	
	@Test(priority=1)
	
	void openapp()
	{
		System.out.println("open app successfull...");

	}
	
	@Test(priority=2)
	void loginapp()
	{
		System.out.println("login successfull....");
	}
	
	@Test(priority=3)
	void closeapp()
	{
		System.out.println("close app successfull....");
	}

}
