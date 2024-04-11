package pages;

import config.ConfigManager;
import org.openqa.selenium.By;

public class AlertsWindowsPage extends BasePage{

    By btnAlerts = By.xpath("//li[@id='item-1']//span[text()='Alerts']");

    public void navigateToAlertsAndWindowsPage() {
        ConfigManager.getDriver().navigate().to("https://demoqa.com/alertsWindows");
    }

    public void clickOpenAlertsPage() {
        clickBase(btnAlerts);
    }
}
