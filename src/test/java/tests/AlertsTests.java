package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {

    @BeforeClass
    public void preconditions() {
        alertsWindowsPage.navigateToAlertsAndWindowsPage();
        alertsWindowsPage.clickOpenAlertsPage();
    }

    @AfterClass
    public void afterClass() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void testAlert() {
        alertsPage.clickBtnOpenAlertConfirm();
        Assert.assertEquals(alertsPage.alertGetText(), "You clicked a button",
                "1");
        Assert.assertTrue(alertsPage.alertGetText().contains("You clicked a"),
                "2");
        alertsPage.alertClickOk();
    }
}
