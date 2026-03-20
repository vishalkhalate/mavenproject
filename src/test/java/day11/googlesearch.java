package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.bjs.com/");

        // Correct locator
        driver.findElement(By.className("search")).sendKeys("water");
        
       // List<WebElement> list=driver.findElements(By.xpath(""));
        
        //System.out.println(list.size());

    }
}

