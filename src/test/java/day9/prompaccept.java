package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompaccept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        
        Alert abc=driver.switchTo().alert();
        
        System.out.println("Welcome:"+abc.getText());
        
        abc.sendKeys("vishal");
        
        abc.accept();
        
        //abc.dismiss();
        
	}

}
