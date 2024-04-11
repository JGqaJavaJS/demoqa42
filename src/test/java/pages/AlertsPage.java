package pages;

import org.openqa.selenium.By;

public class AlertsPage extends BasePage{

    By btnOpenAlertConfirm = By.xpath("//button[@id='alertButton']");
    By btnOpenAlertPrompt = By.xpath("//button[@id='promtButton']");
    By textAddFromPrompt = By.xpath("//span[@id='promptResult']");

    public void clickBtnOpenAlertConfirm() {
        clickBase(btnOpenAlertConfirm);
    }

    public void clickBtnOpenAlertPrompt() {
        clickBase(btnOpenAlertPrompt);
    }

    public String getTextPromptAdd() {
        return getTextBase(textAddFromPrompt);
    }

    public void scrollToElementAlertPrompt() {
        jsScrollToElement(btnOpenAlertPrompt);
    }

}
