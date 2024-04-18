package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTest{

    @Test
    public void sliderMoveTest() {
        sliderPage.navigateToSliderPage();
        sliderPage.moveSlider(30);
        String value = sliderPage.getValueSlider();
        System.out.println(value);
        Assert.assertFalse(value.equals("25"));
    }
}
