package herokkoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestsBasic extends BaseTestHerokkoApp {

    @Test
    public void rightMouseClick() throws InterruptedException {
        By locator = By.xpath("//a[contains(text(),'Testing')]");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        WebElement element = driver.findElement(locator);

        Actions actions = new Actions(driver);
        // right click mouse
        actions.contextClick(element).perform();
        Thread.sleep(5000);
    }
}
