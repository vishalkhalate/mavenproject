package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php/");
		
		Driver.findElement(By.linkText("Web Tables")).click();

	}

}
