package PageObjects;

import SeleniumWrapper.SeleniumLib;
import Utility.Common;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage extends Common {

    WebDriver driver;
    public static SeleniumLib seleniumLib;

    public BasePage(WebDriver driver) {
        //LOGGER.log_def_track("Started Base Page Constructor");
        this.driver = driver;
        seleniumLib = new SeleniumLib(driver);
        //log.log_def_track(" completing in constructor of BasePage");
    }

    @Test
    public void chk() {
        System.out.println(pageElements.readProperty("BROWSER"));
        // System.out.println(testConfigInstance.readProperty("BROWSER"));
    }

    public void clickURL(String URL) {
        seleniumLib.openURL(URL);
    }

    public void openTestSite() {
        clickURL(testConfigs.readProperty("baseURL"));

    }

    public void displayProperty() {

        String str = pageElements.readProperty("somepage.somevariable");
        seleniumLib.getElement(str);

        seleniumLib.clickOnElement(seleniumLib.getElement(str));
    }
}
