package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{

    String elementsCardClick = "document.querySelector(\".card-body\").click();";
    By btnWidgets = By.xpath("//h5[text()='Widgets']");

    public void openElementsPage() {
        jsExecutor(elementsCardClick);
    }

    public void clickOnWidgets() {
        jsScroll(0, 300);
        clickBase(btnWidgets);
    }
}
