package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorclassattribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");


	}

}
