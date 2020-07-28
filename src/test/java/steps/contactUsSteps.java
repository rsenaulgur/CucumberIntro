package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pom.TopNavPOM;
import pom.URLS;
import utilities.Actions;

public class contactUsSteps extends Actions {

    TopNavPOM tn = new TopNavPOM();
    URLS urls = new URLS();

    @When("^On click of Contact Us at top nav$")
    public void on_click_of_Contact_Us_at_top_nav() {
        clickOn(tn.ContactUsTopNav);
    }

    @Then("^Navigate to Contact Us page and assert URL$")
    public void navigate_to_Contact_Us_page_and_assert_URL() {
        Assert.assertEquals(driver.getCurrentUrl(), urls.ContactUsURL, "The URLs are not matching");
    }


}
