package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pom.TopNavPOM;
import pom.URLS;
import utilities.Actions;
import utilities.Driver;


public class applyNowSteps extends Actions {

    private WebDriver driver;

    TopNavPOM tn = new TopNavPOM();
    URLS urls = new URLS();

    @Given("^Go To TechnoStudy website$")
    public void go_To_TechnoStudy_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://techno.study");
    }

    @When("^On click of Apply Now at top nav$")
    public void on_click_of_Apply_Now_at_top_nav() {
       clickOn(tn.ApplyNowTopNav);
    }

    @Then("^Navigate to Apply Now page and assert URL$")
    public void navigate_to_Apply_Now_page_and_assert_URL() {
        Assert.assertEquals(driver.getCurrentUrl(), urls.ApplyNowURL, "The URLs are not matching");
    }


}
