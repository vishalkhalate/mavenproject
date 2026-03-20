package scrolldown;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		/*
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Users\\visha\\eclipse-workspace\\mavenproject\\src\\test\\java\\screenshot\\specificelement.png");
		
		sourcefile.renameTo(targetfile);
		*/
		/*
		WebElement ele=driver.findElement(By.xpath("//section[@class='category-grid home-page-category-grid']//div[@class='item-grid']"));
		//TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ele.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Users\\visha\\eclipse-workspace\\mavenproject\\src\\test\\java\\screenshot\\abc.png");
		
		sourcefile.renameTo(targetfile);
		*/
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Users\\visha\\eclipse-workspace\\mavenproject\\src\\test\\java\\screenshot\\xyz.png");
		
		sourcefile.renameTo(targetfile);

	}

}
