package sclider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scliderclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        driver.get("https://testautomationpractice.blogspot.com/");
        
       
        WebElement x=driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
        
        System.out.println("X-axis sclider is:"+x.getLocation());
        
        Actions ac=new Actions(driver);
        
        ac.dragAndDropBy(x,100, 2021).perform();

	}

}
