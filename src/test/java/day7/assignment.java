package day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1) Open URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // 2) Provide search string
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input"))
              .sendKeys("selenium");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // 3) Count number of links
        List<org.openqa.selenium.WebElement> links =
                driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));

        System.out.println("Total links found: " + links.size());

        // 4) Click on each link using for loop
        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
            Thread.sleep(2000);
        }

        // 5) Get window IDs
        Set<String> windowIds = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windowIds);

        System.out.println("Total windows opened: " + windowList.size());

        // Print all window IDs
        for (String winId : windowList) {
            System.out.println(winId);
        }

        // 6) Close specific browser window (example: close 2nd window)
        if (windowList.size() > 1) {
            driver.switchTo().window(windowList.get(1));
            driver.close();
        }

        // Switch back to main window
        driver.switchTo().window(windowList.get(0));

        // driver.quit(); // close all windows
    }
}
