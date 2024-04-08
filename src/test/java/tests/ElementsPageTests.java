package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest {

//    @BeforeClass
//    public void preconditions() {
//        mainPage.openElementsPage();
//    }

    @AfterMethod
    public void afterMethod() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void urlTest() {
        mainPage.openElementsPage();
        String urlActualRes = mainPage.getCurrentUrl();
        Assert.assertTrue(mainPage.isTextEqual(urlActualRes,
                "https://demoqa.com/elements"),
                "url's not equal");
    }

    @Test
    public void textBoxTextTest() {
        mainPage.openElementsPage();
        String actualRes = elementsPage.getTextTextBoxMenu();
        Assert.assertTrue(elementsPage.isTextEqual(actualRes, "Text Box"));
    }

}
