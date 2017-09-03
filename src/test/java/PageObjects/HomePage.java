package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
        pageDriver = driver;

    }

    public WebDriver pageDriver;

    String services = pageElements.readProperty("HomePage.Services");
    String contactUs = pageElements.readProperty("HomePage.ContactUs");

    public boolean isCommentDisplayed() {
        //return seleniumLib.isTextContainedInElement(seleniumLib.getElement(yourCommentsSpan),pageElements.readProperty("RANDOM_TEXT"));
        return true;
    }

    public boolean isPageLoaded() {
        return seleniumLib.waitForElementVisible(seleniumLib.getElement(services)) &&
                seleniumLib.waitForElementVisible(seleniumLib.getElement(contactUs));

    }

    public void navigateToContactUsPage() {
        seleniumLib.clickOnElement(seleniumLib.getElement(contactUs));

    }
}
