package day11;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // Row count
        List<WebElement> rowcount = driver.findElements(
                By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("Rows: " + rowcount.size());

        // Column count (header only)
        List<WebElement> colcount = driver.findElements(
                By.xpath("//table[@name='BookTable']//tr[1]//th"));
        System.out.println("Columns: " + colcount.size());

        // Specific cell value
        /*String value = driver.findElement(
                By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
        System.out.println("Specific Cell Value: " + value);

        System.out.println("\nTable Data:");

        // Read full table (skip header row)
        /*for (int r = 2; r <= rowcount.size(); r++) {

            for (int c = 1; c <= colcount.size(); c++) {

                String cellValue = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
                        .getText();

                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }*/
        
        for (int r = 2; r <= rowcount.size(); r++) {

            String authorName = driver.findElement(
                    By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
                    .getText();

            if (authorName.equals("Mukesh")) {

                String bookName = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
                        .getText();

                System.out.println(bookName);
            }
        }

     
    }
}

