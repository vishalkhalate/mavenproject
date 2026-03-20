package scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,1500)","");
	    
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		/*
		WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']"));
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

		System.out.println(js.executeScript("return window.pageYOffset;"));

		

	}

}
