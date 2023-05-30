package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCartStepDefination {

    WebDriver driver = new ChromeDriver();
    @Given("User is on Items home page")
    public void User_is_on_Items_home_page(){

        System.out.println("User_is_on_Items_home_page");
        System.setProperty("web-driver.chrome.driver", "/home/dsf5/Desktop/collaborative project/-DNBAutomationProject-/src/test/java/chromedriver_linux64");
        driver.get("https://demowebshop.tricentis.com/");
    }


    @When("User search for {string} and extract actual product name")
    public void userSearchForAndExtractActualProductName(String arg0) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys(arg0);
        Thread.sleep(2000);

        String ProductName = driver.findElement(By.cssSelector("h2.product-title")).getText().split("-")[0].trim();
        System.out.println(ProductName+ "is extracted from home page");

        WebElement searchbutton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        searchbutton.click();
    }

    @Then("User adds product to cart")
    public void userAddsProductToCart() {
        WebElement Addcartbutton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
      Addcartbutton.click();
    }

    @And("User Goes to shopping cart")
    public void userGoesToShoppingCart() {
        WebElement Cartbutton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]"));
        Cartbutton.click();
    }
}
