package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logodisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://demo.nopcommerce.com/");
		
		boolean logo=Driver.findElement(By.id("logo")).isDisplayed();
		
		System.out.println("Displayes logo:"+logo);
		
		

	}

}
