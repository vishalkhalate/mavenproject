package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class secondtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		
		Driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(1000);
		
		String result=Driver.getTitle();
		
		if(result.equals("nopCommerce demo store"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}

	}

}
