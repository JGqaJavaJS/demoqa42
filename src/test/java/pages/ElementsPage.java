package pages;

import org.openqa.selenium.By;

public class ElementsPage extends BasePage{

    By textBoxMenu = By.xpath("//span[text()='Text Box']");

    public String getTextTextBoxMenu() {
        return getTextBase(textBoxMenu);
    }
}
