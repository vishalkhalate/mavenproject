package sclider;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickregistrationandopennewtab {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement textclick=driver.findElement(By.xpath("//a[normalize-space()='Udemy Courses']"));
        
        Actions ac=new Actions(driver);
        
        ac.keyDown(Keys.CONTROL).click(textclick).keyUp(Keys.CONTROL).perform();
        
        List<String>ids=new ArrayList(driver.getWindowHandles());
        
        driver.switchTo().window(ids.get(1));
        
 
	}

}
