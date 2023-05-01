package stepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static testBase.TestBase.getWebDriver;

public class ServiceHooks {

    @Before
    public void setup(){
        WebDriverManager.edgedriver().setup();
        getWebDriver();
    }

    @After
    public void tearDown()
    {
//        getWebDriver().quit();
    }
}
