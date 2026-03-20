package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) throws InterruptedException {

         WebDriver driver=new ChromeDriver();
         
         driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
         
         Thread.sleep(5000);
         
        //boolean logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        
       // System.out.println("logo is diaplayed:"+logo);
         
        //boolean serach= driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
        
       // System.out.println(serach);
         
        // boolean button=driver.findElement(By.xpath("//button[normalize-space()='Search']")).isDisplayed();
         
        // System.out.println(button);
         
         //boolean malebutton=driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
         
        // System.out.println(malebutton);
         
        //boolean femalebutton= driver.findElement(By.xpath("//input[@id='gender-female']")).isDisplayed();
        
       // System.out.println(femalebutton);
         
         //boolean maleselected=driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
         
         //System.out.println(maleselected);
         
         WebElement maleselect=driver.findElement(By.xpath("//input[@id='gender-male']"));
         WebElement femaleselect=driver.findElement(By.xpath("//input[@id='gender-female']"));
         
         maleselect.click();
         femaleselect.click();
         System.out.println(maleselect.isSelected());
         System.out.println(femaleselect.isSelected());
            
	}

}
