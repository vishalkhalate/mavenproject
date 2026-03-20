package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickertutorialpoint {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/date-picker");

        // Open Date Picker
        driver.findElement(By.id("datePickerMonthYearInput")).click();

        String year = "2027";
        String month = "July";
        String day = "7";

        // Select Year
        Select yearDropdown = new Select(
                driver.findElement(By.className("react-datepicker__year-select")));
        yearDropdown.selectByVisibleText(year);

        // Select Month
        Select monthDropdown = new Select(
                driver.findElement(By.className("react-datepicker__month-select")));
        monthDropdown.selectByVisibleText(month);

        // Select Day
        List<WebElement> allDates = driver.findElements(
                By.xpath("//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]"));

        for (WebElement date : allDates) {
            if (date.getText().equals(day)) {
                date.click();
                break;
            }
        }
    }
}
