package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		
		Driver.findElement(By.name("login")).click();

	}

}
