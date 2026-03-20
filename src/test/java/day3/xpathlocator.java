package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {

	public static void main(String[] args) {
       
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("t-shirt");
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']"))
	     // .sendKeys("T-shirt");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='abs']")).sendKeys("T-shirt");
		
	}

}
