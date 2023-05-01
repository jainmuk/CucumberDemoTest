package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class TestBase {

    public static EdgeDriver  driver = new EdgeDriver();;
    public static WebDriver getWebDriver() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://127.0.0.1:5500/");
        return driver;
    }


}
