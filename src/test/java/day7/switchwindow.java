package day7;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		ArrayList windowList = new ArrayList(windowIds);
		
		Object parentid=windowList.get(0);
		
		Object childid=windowList.get(1);
		
		//driver.switchTo().window((String) childid);
		
		driver.switchTo().window((String) parentid);
		
		System.out.println(driver.getTitle());


	}

}
