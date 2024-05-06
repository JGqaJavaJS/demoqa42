package pages;

import org.openqa.selenium.By;

public class FormsPage extends BasePage{

    By btnPracticeForm = By.xpath("//span[text()='Practice Form']");
    public void clickPracticeForm() {
        jsScroll(0,200);
        clickBase(btnPracticeForm);
    }

}
