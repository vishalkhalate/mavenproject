package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firsttestcase {
    public static void main(String[] args) throws InterruptedException {



    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://demo.opencart.com/");

    	// keep browser open for 10 seconds
    	Thread.sleep(10000);
    	
    	String act_result=driver.getTitle();
    	
    	if (act_result.equals("Your Store"))
    	{
    		System.out.println("Test pass");
    	}
    	else
    	{
    		System.out.println("test fail");
    	}

    	//driver.quit();

    }
}

