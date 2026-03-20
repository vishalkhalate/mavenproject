package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class serachandsendkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php/");
		
		WebElement search=Driver.findElement(By.id("fullname"));
		
		search.sendKeys("vishal khalate");
		
		System.out.println(search);
	}

}
