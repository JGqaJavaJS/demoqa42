package pages;

import config.ConfigManager;
import org.openqa.selenium.By;

import java.util.Set;

public class HandlersPage extends BasePage{

    By btnNewTab = By.cssSelector("#tabButton"); // by id == #
    By h1SecondHandler = By.tagName("h1");

    public void navigateToHandlersPage() {
        ConfigManager.getDriver().navigate().to("https://demoqa.com/browser-windows");
    }

    public void clickBtnNewTab() {
        clickBase(btnNewTab);
    }

    public String getTextNewTabHandlerH1() {
        return getTextBase(h1SecondHandler);
    }
}
