package day8;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {

         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         driver.get("https://testautomationpractice.blogspot.com/?");
         
         //driver.findElement(By.xpath("//input[@id='sunday']")).click();
         
        //WebElement abc= driver.findElement(By.xpath("//input[@id='sunday']"));
        
       // System.out.println(abc.isSelected());
        
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();
        
       // System.out.println(abc.isSelected());
         
        java.util.List<WebElement> count = driver.findElements(
        	        By.xpath("//input[@class='form-check-input' and @type='checkbox']")
        	);

         
        System.out.println("check boxes count="+count.size());
        
        /*for(int i=0;i<count.size();i++)
        {
        	count.get(i).click();
        }
        */
        
        /*for (int i=4;i<count.size();i++)
        {
        	count.get(i).click();
        }*/
        
        for(int i=0;i<3;i++)
        {
      
        	count.get(i).click();
        	
        }
        
        /*
        
        for(WebElement counts:count)
        {
        	if (counts.isSelected())
        	{
        		counts.click();
        	}
        	else
        	{
        		counts.click();
        	}
        	
        }
        
        /*
        Thread.sleep(5000);
        
        for (int i=0;i<count.size();i++)
        {
        	if(i==0|| i==3||i==5)
        	{
        		 ((WebElement) count).click();
        	}
        						
        }*/
        
	}

}
