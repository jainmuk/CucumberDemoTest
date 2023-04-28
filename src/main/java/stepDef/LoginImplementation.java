package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginImplementation {

    @Given("I am on the login page url {string}")
    public void i_am_on_the_login_page_url(String string) {
        System.out.println("Given");
    }
    @When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String string, String string2) {
        System.out.println("When");
    }
    @Then("I land on home page")
    public void i_land_on_home_page() {
        System.out.println("Then");
    }

}
