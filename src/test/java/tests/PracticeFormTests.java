package tests;

import config.ConfigManager;
import org.testng.annotations.Test;
import utils.TakeScreenshot;

public class PracticeFormTests extends BaseTest{

    @Test
    public void formTest() {
// precondition
        mainPage.clickOnForms();
        formsPage.clickPracticeForm();
// gender
        practiceFormPage.fillGender("Other");
        TakeScreenshot.takeScreenShot(ConfigManager.getDriver(), "gender");
// DatePicker
        practiceFormPage.fillDateOfBirth("07 Aug 2000");
        TakeScreenshot.takeScreenShot(ConfigManager.getDriver(), "birth");

// upload file
        practiceFormPage.uploadFile("/Users/julia/Tools/1.png");
        TakeScreenshot.takeScreenShot(ConfigManager.getDriver(), "file");

        practiceFormPage.fillSubjects(new String[] {"Math", "English"});
        TakeScreenshot.takeScreenShot(ConfigManager.getDriver(), "subjects");

        // fill state
        practiceFormPage.fillState("NCR");
        TakeScreenshot.takeScreenShot(ConfigManager.getDriver(), "state");

    }
}
