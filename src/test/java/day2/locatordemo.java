package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatordemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Thread.sleep(1000);
		
		Driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php/");
		
		WebElement serchbox=Driver.findElement(By.id("fullname"));
		
		serchbox.sendKeys("vishal");

	}

}
