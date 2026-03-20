package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictpractice {

	public static void main(String[] args) {

          WebDriver driver=new ChromeDriver();
          
          WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
          
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          
         // WebElement userfiled=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
          
          //userfiled.sendKeys("vishal_khalate");
          
          WebElement userbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
          
          userbutton.click();
	}

}
