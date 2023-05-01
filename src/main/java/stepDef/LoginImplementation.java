package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.TestBase;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LoginImplementation extends TestBase {

    WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("I am on the login page url {string}")
    public void i_am_on_the_login_page_url(String string) {
        System.out.println("I am on login page");
    }
    @When("I click on about page")
    public void i_click_on_about_page() {

        By element  = By.xpath("//a[@href='about.html']");
        myWait.until(ExpectedConditions.presenceOfElementLocated(element));
        driver.findElement(element).click();
    }
    @Then("it lands on about page")
    public void it_lands_on_about_page() {
       String text = driver.findElement(By.xpath("//div/h6[text()='About Us']")).getText();

        Assert.assertEquals("About us is not available","ABOUT US",text);

        WebElement ourMission = driver.findElement(By.xpath("//li/button[text()='Our Mission']"));
        String text1 = driver.findElement(with(By.tagName("button")).toRightOf(ourMission)).getText();
        System.out.println(text1);
    }

    @And("add product to a cart")
    public void add_product_to_a_cart() throws InterruptedException {
        By element  = By.xpath("//a[@href='product.html']");
        myWait.until(ExpectedConditions.presenceOfElementLocated(element));
        driver.findElement(element).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,350)","");
        Thread.sleep(3000);
    }


}
