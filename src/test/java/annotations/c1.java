package annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	
	@Test
	void ta()
	{
		System.out.println("Test for c1");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("Before test case");
	}
	

}
