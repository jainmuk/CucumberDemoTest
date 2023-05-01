package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.TestBase;

import java.time.Duration;

public class Pages extends TestBase {
    WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @When("i click on pages tab")
    public void i_click_on_pages_tab() {
        driver.findElement(By.xpath("//a[@href='product.html']/following-sibling::div")).click();

    }
    @Then("it shows a drop down list")
    public void it_shows_a_drop_down_list() {
            System.out.println("It shows a drop down list");
    }
    @Then("I click on The Team option")
    public void i_click_on_the_team_option() {
        driver.findElement(By.xpath("//a[text()='The Team']")).click();
    }
    @Then("it lands on appropriate page")
    public void it_lands_on_appropriate_page() {
        String teamMembers = driver.findElement(By.xpath("//h6[text()='Team Members']")).getText();
        System.out.println(teamMembers);
    }

}
