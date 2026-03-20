package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcaseformethod {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Login successfully");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search a Element");
	}
	
	@AfterMethod
	
	void logout()
	{
		System.out.println("Logout Successfully");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("Adv search successfully");
	}
	

}
