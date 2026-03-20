package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchcase {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		String weekname="tuesday";
		switch(weekname)
		{
		case "sunday":driver.findElement(By.xpath("//input[@id='sunday']")).click();
		              break;
		              
		case "monday":driver.findElement(By.xpath("//input[@id='monday']")).click();
		              break;
		              
		case "tuesday":driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		               break;
		               
		case "wednesday":driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		                break;
		
		case "thusday":driver.findElement(By.xpath("//input[@id='thusday']")).click();
		               break;
		
		case "friday":driver.findElement(By.xpath("//input[@id='friday']")).click();
		              break;
		              
		case "saturday":driver.findElement(By.xpath("//input[@id='saturday']")).click();
		
		default:System.out.println("Invalid weekname");
		}

	}

}
