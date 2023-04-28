package runnerDemo;

import cucumber.api.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/login.feature"},
        glue = {"src/main/java/stepDef"},
        monochrome = true,
        dryRun = true
)
public class TestRunner {
}