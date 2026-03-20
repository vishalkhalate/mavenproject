package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class boostrapdropdown {

	public static void main(String[] args) {

         WebDriver driver=new ChromeDriver();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         driver.manage().window().maximize();
         
         driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
         
         driver.findElement(By.xpath("//button[@id='menu1']")).click();
         
         //select single element
         
        //driver.findElement(By.xpath("//div[@class='column-center-outer']//li[3]")).click();
        
        
        //count of element
        
        List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class, 'dropdown-menu')]//li"));
        
        System.out.println("count of options:"+options.size());
        
        /*
        for (int i=0;i<options.size();i++)
        {
        	System.out.println(options.get(i).getText());
        }*/
        
        for(WebElement op:options)
        {
        	System.out.println(op.getText());
        }
         
         

	}

}
