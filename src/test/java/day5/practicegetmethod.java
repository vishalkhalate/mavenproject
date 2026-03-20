package day5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicegetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//System.out.println("Title is:"+driver.getTitle());
		
		//System.out.println("Url of the page:"+driver.getCurrentUrl());
		
		//System.out.println("Page code:"+driver.getPageSource());
		
		System.out.println("Id of the Page:"+driver.getWindowHandle());
		
		

	}

}
