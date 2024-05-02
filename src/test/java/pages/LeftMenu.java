package pages;

import org.openqa.selenium.By;

public class LeftMenu extends BasePage{

    By btnSelectMenu = By.xpath("//span[text()='Select Menu']");
    public void clickOnSelect() {
        jsScroll(0, 550);
        clickBase(btnSelectMenu);
    }
}
