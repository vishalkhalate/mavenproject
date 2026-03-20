package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalcommand {

	public static void main(String[] args) {

      WebDriver driver=new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
     // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
      //driver.navigate().to("https://demo.nopcommerce.com/");
      
      //driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
      
      //driver.navigate().back();
      
      //driver.navigate().forward();
      
      driver.navigate().refresh();
      
      System.out.println(driver.getCurrentUrl());
      
      ;
	}

}
