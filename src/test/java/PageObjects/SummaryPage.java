package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage extends BasePage {


    public SummaryPage(WebDriver driver) {
        super(driver);
        pageDriver = driver;

    }

    public WebDriver pageDriver;

    String NameLocator = pageElements.readProperty("SummaryPage.NameLocator");


    public boolean isOnPage() {
        String title = "I am a page title - Sauce Labs";
        return true;
    }

    public boolean isCommentDisplayed() {
        //return seleniumLib.isTextContainedInElement(seleniumLib.getElement(yourCommentsSpan),pageElements.readProperty("RANDOM_TEXT"));
        return true;
    }

    public boolean isFieldValEmty() {

        boolean flag = false;
        String value = seleniumLib.getElementText(NameLocator);
        if (value.equals("")) {
            flag = true;
            return flag;
        } else
            return flag;
    }
}
