package dynamicpagehandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyamicpagepagination {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // Find total pages
        List<WebElement> totalPages =
                driver.findElements(By.xpath("//ul[@class='pagination']//li"));

        System.out.println("Total Pages: " + totalPages.size());

        // Loop through pages
        for (int p = 1; p <= totalPages.size(); p++) {

            if (p > 1) {
                WebElement pageNo = driver.findElement(
                        By.xpath("//ul[@class='pagination']//a[text()='" + p + "']")
                );
                pageNo.click();
            }

            // Read table data for each page
            List<WebElement> rows =
                    driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));

            for (int r = 1; r <= rows.size(); r++) {

                String productName = driver.findElement(
                        By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]")
                ).getText();
                
                String price = driver.findElement(
                        By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]")
                ).getText();
                
                driver.findElement(
                	    By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//input[@type='checkbox']")
                	).click();

             
                
                System.out.println(productName+"   \t"+price);
            }
        }

  
    }
}
