package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectPage extends BasePage{

    By selectOneDropDown = By.xpath("//div[text()='Select Title']");
    By allStatusesInSelectOne = By.xpath("//div[contains(@id,'react-select')]");
    By resultValueInSelectOne = By.xpath("//div[contains(@class,'singleValue')]");
    public void fillForm(String s) {
        jsScroll(0, 400);
        clickBase(selectOneDropDown);
        List<WebElement> allStatuses = findElementsBase(allStatusesInSelectOne);
        for(WebElement element : allStatuses) {
            if(getTextBaseElement(element).equals(s)) {
                clickBaseElement(element);
                break;
            }
        }
    }

    public boolean verifySelectOneFormFilledCorrect(String s) {
        return isTextEqual(getTextBase(resultValueInSelectOne), s);
    }
}
