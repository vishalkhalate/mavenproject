package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerdropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        String year = "2026";
        String month = "July";
        String day = "7";

        // Open datepicker
        driver.findElement(By.id("datepicker")).click();

        // Navigate to required month & year
        while (true) {

            String monthName = driver.findElement(
                    By.className("ui-datepicker-month")
            ).getText();

            String yearName = driver.findElement(
                    By.className("ui-datepicker-year")
            ).getText();

            if (monthName.equals(month) && yearName.equals(year)) {
                break;
            }

            // Click Next button
            driver.findElement(
                    By.xpath("//span[contains(@class,'ui-icon-circle-triangle-e')]")
            ).click();
        }

        // Select the date
        List<WebElement> allDates = driver.findElements(
                By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a")
        );

        for (WebElement dt : allDates) {
            if (dt.getText().equals(day)) {   // ✅ FIXED
                dt.click();
                break;
            }
        }

   
    }
}
