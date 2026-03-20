package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://demo.nopcommerce.com/");
		
		Driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");

	}

}
