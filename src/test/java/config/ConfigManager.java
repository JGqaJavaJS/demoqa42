package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class ConfigManager {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en");
            driver = new ChromeDriver(options);
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options =new FirefoxOptions();
            options.addPreference("intl.accept_languages","en");
            driver = new FirefoxDriver(options);
        }else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver();
        }
        else {throw new IllegalArgumentException("Invalid browser value : "+browser);}
        //driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterSuite
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
