/*package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    WebDriver driver =new ChromeDriver();

    @Given("Verify that User is on the browser")
    public void verifyThatUserIsOnTheBrowser() {
        System.out.println("verifyThatUserIsOnTheBrowser");
    }

    @When("verify if the browser is triggered")
    public void verifyIfTheBrowserIsTriggered() {
        System.out.println("verifyIfTheBrowserIsTriggered");

    }

    @Then("Browser is displayed")
    public void browserIsDisplayed() {
        System.out.println("browserIsDisplayed");
    }

    @Given("User is on DemoWEbShop landing page and login button is visible")
    public void User_is_on_DemoWEbShop_landing_page_and_login_button_is_visible(){
        System.out.println("User_is_on_DemoWEbShop_landing_page_and_login_button_is_visible");
        System.setProperty("web-driver.chrome.driver", "/home/dsf5/Desktop/collaborative project/-DNBAutomationProject-/src/test/java/chromedriver_linux64");
        driver.get("https://demowebshop.tricentis.com/");

    }
    @When("User login  with {} and {}")
    public void user_Login_With_And(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);

    }
    @Then("Home page is populated {string}")
    public void home_Page_Is_Populated(String arg0) {
        System.out.println(arg0);
    }
}
*/