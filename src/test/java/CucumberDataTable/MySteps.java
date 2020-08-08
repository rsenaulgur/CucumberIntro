package CucumberDataTable;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pom.TopNavPOM;
import utilities.Actions;

import java.util.List;

public class MySteps extends Actions {

    TopNavPOM tp = new TopNavPOM();

    @And("^Click on top nav buttons$")
    public void click_on_top_nav_buttons(DataTable dataTable){

        List<List<String>> myData = dataTable.asLists(String.class);

        for (int i = 0; i < myData.size(); i++) {

            String page = myData.get(i).get(0);
            String url = myData.get(i).get(1);

            System.out.println("My page is: " + page + "  -  my expected url is: " + url);

            if (page.equalsIgnoreCase("Home")) {
                clickOn(tp.HomeTopNav);
            }
            else if (page.equalsIgnoreCase("Apply Now")) {
                clickOn(tp.ApplyNowTopNav);
            }
            else if (page.equalsIgnoreCase("Contact Us")) {
                clickOn(tp.ContactUsTopNav);
            }

            Assert.assertEquals(driver.getCurrentUrl(), url, "The URLs are not matching");

        }




    }
}
