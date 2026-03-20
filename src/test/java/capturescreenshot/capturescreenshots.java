package capturescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturescreenshots {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        File targetFile = new File("C:\\Users\\visha\\eclipse-workspace\\mavenproject\\src\\test\\java\\screenshot\\homepage.png");

        FileHandler.copy(sourceFile, targetFile);

        driver.quit();
    }
}
