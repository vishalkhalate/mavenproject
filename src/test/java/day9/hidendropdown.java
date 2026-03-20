package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidendropdown {

	public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/");
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
        
        driver.findElement(By.xpath("//div[contains(text(),'Automaton Tester')]")).click();

	}

}
