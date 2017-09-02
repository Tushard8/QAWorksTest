package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.junit.Assert;


public class MyTestStepdefs {
    @Given("^I am on (\\d+)th Page$")
    public void iAmOnThPage(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am here");
        Assert.assertTrue(true);
    }
}
