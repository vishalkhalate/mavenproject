package day11;

import java.util.List;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {

           WebDriver driver=new ChromeDriver();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
           driver.manage().window().maximize();
           
           driver.get("https://blazedemo.com/");
           
           driver.findElement(By.xpath("//select[@name='fromPort']")).click();
           
           driver.findElement(By.xpath("//select[@name='toPort']")).click();
           
          List <WebElement> list=driver.findElements(By.xpath("//select[@name='fromPort']//option"));
          
          List <WebElement> list1=driver.findElements(By.xpath("//select[@name='toPort']//option"));
          
          System.out.println(list.size());
          
          
          
          for (WebElement op:list)
          {
        	  //System.out.println(list.get(i).getText());
        	  
        	 String option=op.getText();
        	 if(option.equals("Paris")||option.equals("Philadelphia")||option.equals("Boston")||option.equals("Portland")||
        			 option.equals("San Diego")||option.equals("Mexico City")||option.equals("São Paolo"))
        	 {
        		 op.click();
        	 }
          }
          
          for (WebElement op1:list1)
          {
        	  //System.out.println(list.get(i).getText());
        	  
        	 String option=op1.getText();
        	 if(option.equals("Buenos Aires")||option.equals("Rome")||option.equals("London")||option.equals("Berlin")||
        			 option.equals("New York")||option.equals("Dublin")||option.equals("Cairo"))
        	 {
        		 op1.click();
        	 }
        	 
        	 driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        	 
        	// driver.findElement(By.xpath(""))
          }
          

	}

}
