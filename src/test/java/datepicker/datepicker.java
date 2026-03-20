package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        // Switch to iframe
        driver.switchTo().frame(0);

        String year = "2026";
        String month = "June";
        String date = "12";

        driver.findElement(By.id("datepicker")).click();

        // Select month & year
        while (true) {

            String monthname = driver.findElement(
                    By.className("ui-datepicker-month")
            ).getText();

            String yearname = driver.findElement(
                    By.className("ui-datepicker-year")
            ).getText();

            if (monthname.equals(month) && yearname.equals(year)) {
                break;
            }

            // Click next arrow
            driver.findElement(
                    By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")
            ).click();
        }

        // Select date
        List<WebElement> dates = driver.findElements(
                By.xpath("//table[@class='ui-datepicker-calendar']//a")
        );

        for (WebElement dt : dates) {
            if (dt.getText().equals(date)) {   // ✅ FIXED
                dt.click();
                break;
            }
        }
    }
}
