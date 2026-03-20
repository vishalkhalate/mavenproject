package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) {

         WebDriver driver=new ChromeDriver();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         driver.get("https://testautomationpractice.blogspot.com/");
         
         WebElement drpdown=driver.findElement(By.xpath("//select[@id='country']"));
         
         //selecting dropdown
         
         Select dropdown=new Select(drpdown);
         
         dropdown.selectByVisibleText("India");
         
         //count of droplist
         
        List<WebElement>countdrp= dropdown.getOptions();
        
        System.out.println("Count of Dropdown Countries:"+countdrp.size());
        
        //ruturn the name of dropdown list
        
        /*
        for(int i=0;i<countdrp.size();i++)
        {
        	System.out.println(countdrp.get(i).getText());
        }*/
        
        for(WebElement options:countdrp)
        {
        	System.out.println(options.getText());
        }
         

	}

}
