import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexcetor {

	private static JavascriptExecutor JavascriptExecutor;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement text=driver.findElement(By.xpath("//input[@id='name']"));
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','John')", text);
		
		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()",radiobtn);
		
		WebElement chekbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		
		js.executeScript("arguments[0].click()",chekbox);

		
		
		
		
		

	}

}
