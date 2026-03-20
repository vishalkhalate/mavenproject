package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
	
	@Test
	
	void tb()
	{
		System.out.println("Test for c2");
	}
	
	@AfterTest
	
	void at()
	{
		System.out.println("After test case");
	}
	

}
