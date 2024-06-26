package tests;

import config.ConfigManager;
import org.testng.asserts.SoftAssert;
import pages.*;

public class BaseTest extends ConfigManager {
    SoftAssert softAssert = new SoftAssert();
    MainPage mainPage = new MainPage();
    ElementsPage elementsPage = new ElementsPage();
    AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage();
    AlertsPage alertsPage = new AlertsPage();
    SliderPage sliderPage = new SliderPage();
    HandlersPage handlersPage = new HandlersPage();
    LeftMenu leftMenu = new LeftMenu();
    SelectPage selectPage = new SelectPage();
    FormsPage formsPage = new FormsPage();
    PracticeFormPage practiceFormPage = new PracticeFormPage();
}
