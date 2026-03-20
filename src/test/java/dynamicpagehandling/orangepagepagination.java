package dynamicpagehandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangepagepagination {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Click Admin menu
        driver.findElement(
                By.xpath("//span[normalize-space()='Admin']")
        ).click();

        // Read table rows
        List<WebElement> rows = driver.findElements(
                By.xpath("//div[@role='rowgroup']//div[@role='row']")
        );

        System.out.println("Total Rows: " + rows.size());

        for (int i = 1; i <= rows.size(); i++) {

            String username = driver.findElement(
                    By.xpath("(//div[@role='rowgroup']//div[@role='row'])[" + i + "]//div[@role='cell'][2]")
            ).getText();

            System.out.println(username);
        }

 
    }
}
