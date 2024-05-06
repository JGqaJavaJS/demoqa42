package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class PracticeFormPage extends BasePage{

    By labelMale = By.xpath("//label[@for='gender-radio-1']");
    By labelFemale = By.xpath("//label[@for='gender-radio-2']");
    By labelOther = By.xpath("//label[@for='gender-radio-3']");

    By inputBirthDay = By.xpath("//input[@id='dateOfBirthInput']");

    By inputUploadFile = By.xpath("//input[@id='uploadPicture']");
    By inputState = By.xpath("//input[@id='react-select-3-input']");

    public void fillGender(String gender) {
   //     jsScroll(0,200);
        if(gender.equals("Male")) {
            clickBase(labelMale);
        } else if(gender.equals("Female")) {
            clickBase(labelFemale);
        } else if (gender.equals("Other")) {
            clickBase(labelOther);
        }
    }

    public void fillDateOfBirth(String date) {
        clickBase(inputBirthDay);
        Keys key = getKeyOSCommandOrControl();
        WebElement element = findElementBase(inputBirthDay);
        element.sendKeys(key, "a");
        element.sendKeys(date);
        element.sendKeys(Keys.ENTER);
    }

    public Keys getKeyOSCommandOrControl() {
        String os = System.getProperty("os.name");
        System.out.println(os);
        if(os.startsWith("Mac")) {
            return Keys.COMMAND;
        } else if (os.startsWith("Win")) {
            return Keys.CONTROL;
        }
        return Keys.CONTROL;
    }

    public void uploadFile(String path) {
        findElementBase(inputUploadFile).sendKeys(path);
        jsScroll(0, 400);
    }

    public void fillState(String state) {
        findElementBase(inputState).sendKeys(state);
        findElementBase(inputState).sendKeys(Keys.ENTER);
    }
}
