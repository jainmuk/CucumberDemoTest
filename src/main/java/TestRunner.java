import cucumber.api.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"src/main/java/stepDef"},
        plugin = {"pretty", "html:target/cucumber/html"},
        monochrome = true,
        dryRun = true

)
public class TestRunner {
}
