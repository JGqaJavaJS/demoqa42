package pages;

import config.ConfigManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    ConfigManager config = new ConfigManager();

    protected WebElement findElementBase(By by) {
        System.out.println("find element by locator: " + by.toString());
        return config.getDriver().findElement(by);
    }

    protected List<WebElement> findElementsBase(By by) {
        System.out.println("find all elementS by locator: " + by.toString());
        return config.getDriver().findElements(by);
    }

    protected void clickBase(By by) {
        System.out.println("click on element with locator: " + by.toString());
        findElementBase(by).click();
    }

    protected String getTextBase(By by) {
        System.out.println("get text with locator: " + by.toString());
        return findElementBase(by).getText().trim();
    }

    public void jsExecutor(String str) {
        JavascriptExecutor js = (JavascriptExecutor) config.getDriver();
        js.executeScript(str);
    }

    public boolean isTextEqual(String actualRes, String expectedRes) {
        if(actualRes.equals(expectedRes)) {
            return true;
        } else {
            System.out.println("actual result: " + actualRes + " "
            + "expected result: " + expectedRes);
            return false;
        }
    }

    public String getCurrentUrl() {
        return config.getDriver().getCurrentUrl();
    }

    public void navigateToMainPage() {
        config.getDriver().navigate().to("https://demoqa.com/");
    }
}
