package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php/");
		
		List<WebElement> headerlinks = Driver.findElements(By.className("list-group-item"));
		System.out.println("Total links found = " + headerlinks.size());


	}

}
