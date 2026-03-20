package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
		
		Driver.findElement(By.tagName("imput")).sendKeys("Youtube");
		

	}

}
