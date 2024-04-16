package tests;

import io.qameta.allure.Allure;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        softAssert.assertEquals(alertsPage.alertGetText(), "You clicked a button",
                "1");
        softAssert.assertTrue(alertsPage.alertGetText().contains("You clicked a"),
                "2");
        alertsPage.alertClickOk();
        softAssert.assertAll();
    }

    @Test
    public void testAlertPrompt() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println(formattedDateTime);
        Allure.description("test alert prompt, that text add correct, date and time:  "
                + formattedDateTime);
        Allure.step("scroll to element: open alert prompt");
        alertsPage.scrollToElementAlertPrompt();
        Allure.step("open alert prompt");
        alertsPage.clickBtnOpenAlertPrompt();
        Allure.step("send text in prompt input: abs");
        alertsPage.alertSendKeys("abs");
        Allure.step("close alert with click on accept button");
        alertsPage.alertClickOk();
        Allure.step("assert - text we add in the prompt displays on the page");
        Assert.assertTrue(alertsPage.getTextPromptAdd().contains("abs"));
    }
}
