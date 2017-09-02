package StepDefinitions;

import PageObjects.ContactUsPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class ContactUsStepdefs extends BaseStepDef
    {

    public static final Logger LOGGER = LoggerFactory.getLogger(ContactUsPage.class);

    @Before
    public void setUp(Scenario scenario) throws Exception {

        baseScenario=scenario;
        setDriver();
        initalize(localDriver);


    }


    @Given("^I am on QAWorks Site$")
    public void iAmOnQAWorksSite() throws Throwable {
        //LOGGER.info("I am here");
        basePage.openTestSite();
        Assert.assertTrue(homePage.isPageLoaded());

    }

    @Then("^I should be able to contact QA Works with the following information$")
    public void iShouldBeAbleToContactQAWorksWithTheFollowingInformation(DataTable formDetails) throws Throwable {
        List<List<String>> data = formDetails.raw();

        homePage.navigateToContactUsPage();
        Assert.assertTrue(contactUsPage.isPageLoaded());
        contactUsPage.submitDefaultForm(data);
        Assert.assertTrue(summaryPage.isFieldValEmty());


    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        try {
            terminateDriver();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
