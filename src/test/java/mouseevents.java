import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        driver.get("https://vinothqaacademy.com/mouse-event/");
	        
	        WebElement pointme=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Free Complete QA Video Courses')]"));
	        
	        WebElement mobile=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Cypress Automation']"));
	        
	        Actions ac=new Actions(driver);
	        
	        ac.moveToElement(pointme).moveToElement(mobile).click().build().perform();
	        

	}

}
