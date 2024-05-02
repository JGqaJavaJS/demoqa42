package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectTests extends BaseTest{

    @BeforeClass
    public void precondition() {
        mainPage.clickOnWidgets();
        leftMenu.clickOnSelect();
    }

    @Test
    public void testSelectOneForm() {
        selectPage.fillForm("Mr.");
        Assert.assertTrue(selectPage.verifySelectOneFormFilledCorrect("Mr."));
    }
}
