package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceconditial {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//WebElement abc=driver.findElement(By.xpath("//input[@id='name']"));
		
		//abc.sendKeys("vishal");
		
		//System.out.println(abc.isDisplayed());
		
		//WebElement abc=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		
		//System.out.println(abc.isDisplayed());
		
		WebElement abc=driver.findElement(By.xpath("//input[@id='male']"));
		
		System.out.println("male radio status:"+abc.isSelected());
		
		abc.click();
		
		System.out.println("male radio status:"+abc.isSelected());
	

	}

}
