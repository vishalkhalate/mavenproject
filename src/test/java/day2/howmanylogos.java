package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class howmanylogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php/");
		
		Driver.findElement(By.linkText("Buttons")).click();
	

	}

}
