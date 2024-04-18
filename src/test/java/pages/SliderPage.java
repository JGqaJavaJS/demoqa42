package pages;

import config.ConfigManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends BasePage{

    By rangeSlider = By.xpath("//input[@type='range']");
    By sliderQuantityValue = By.xpath("//input[@id='sliderValue']");

    public void navigateToSliderPage() {
        ConfigManager.getDriver().navigate().to("https://demoqa.com/slider");
    }

    public void moveSlider(int point) {
        waitForElementVisible(rangeSlider);
        WebElement element = findElementBase(rangeSlider);
        Actions actions = new Actions(ConfigManager.getDriver());
        actions.dragAndDropBy(element, point, 0).build().perform();
    }

    public String getValueSlider() {
        return getValueOfAttribute(sliderQuantityValue, "value");
    }
}
