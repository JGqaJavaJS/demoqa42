package pages;

import config.ConfigManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage {

    ConfigManager config = new ConfigManager();

    protected WebElement findElementBase(By by) {
        System.out.println("find element by locator: " + by.toString());
        Allure.step("find element by locator: " + by.toString());
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

    protected void clickBaseElement(WebElement element) {
        element.click();
    }

    protected String getTextBaseElement(WebElement element) {
        return element.getText().trim();
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

    public void jsScrollToElement(By by) {
        JavascriptExecutor js = (JavascriptExecutor) ConfigManager.getDriver();
        WebElement element = findElementBase(by);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void jsScroll(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) ConfigManager.getDriver();
        js.executeScript("window.scrollBy(" + x + "," + y +")");
    }

    public String getValueOfAttribute(By by, String attributeName) {
        return findElementBase(by).getAttribute(attributeName).trim();
    }

    // Alerts -------------------------------------------

    public void alertClickOk() {
        Alert alert = ConfigManager.getDriver().switchTo().alert();
        alert.accept();
    }

    public void alertClickDismiss() {
        Alert alert = ConfigManager.getDriver().switchTo().alert();
        alert.dismiss();
    }

    public String alertGetText() {
        Alert alert = ConfigManager.getDriver().switchTo().alert();
        return alert.getText().trim();
    }

    public void alertSendKeys(String str) {
        Allure.step("get driver and switch to alert window");
        Alert alert = ConfigManager.getDriver().switchTo().alert();
        alert.sendKeys(str);
    }

    // --------------------------------------------------

    // waitings --------------

    public void waitForElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(ConfigManager.getDriver(),
                Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForQuantityOfHandlers(int handlerQuantity) {
        WebDriverWait wait = new WebDriverWait(ConfigManager.getDriver(),
                Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfWindowsToBe(handlerQuantity));
    }
//-------------------------------
    public Set<String> getAllHandlers(int handlersQuantity) {
        waitForQuantityOfHandlers(handlersQuantity);
        return ConfigManager.getDriver().getWindowHandles();
    }


    public void switchToHandlerByString(String s) {
        ConfigManager.getDriver().switchTo().window(s);
    }
}
