package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitalerthandling {

	public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        
        Alert abc=wait.until(ExpectedConditions.alertIsPresent());
        
       // abc.accept();
        
        abc.dismiss();
        
        
	}

}
