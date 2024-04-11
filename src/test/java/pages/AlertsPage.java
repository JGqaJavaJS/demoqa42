package pages;

import org.openqa.selenium.By;

public class AlertsPage extends BasePage{

    By btnOpenAlertConfirm = By.xpath("//button[@id='alertButton']");

    public void clickBtnOpenAlertConfirm() {
        clickBase(btnOpenAlertConfirm);
    }
}
