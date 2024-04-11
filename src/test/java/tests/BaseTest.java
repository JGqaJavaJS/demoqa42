package tests;

import config.ConfigManager;
import org.testng.asserts.SoftAssert;
import pages.AlertsPage;
import pages.AlertsWindowsPage;
import pages.ElementsPage;
import pages.MainPage;

public class BaseTest extends ConfigManager {
    SoftAssert softAssert = new SoftAssert();
    MainPage mainPage = new MainPage();
    ElementsPage elementsPage = new ElementsPage();
    AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    AlertsPage alertsPage = new AlertsPage();
}
