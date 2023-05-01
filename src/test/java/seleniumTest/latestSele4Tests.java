package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class latestSele4Tests  {

    @Test
    public void seleTest() throws InterruptedException{
        WebDriverManager.edgedriver().create();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("-disable-notifications");
        EdgeDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.close();
    }
}
