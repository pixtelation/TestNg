package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URL;
import java.time.Duration;
import org.testng.annotations.*;


public class base {
    protected WebDriver driver;

    public void setup(String os, String browser, String version) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", os);
        caps.setCapability("browserName", browser);
        caps.setCapability("browserVersion", version);
        caps.setCapability("name", "BrowserStack Test - " + browser + " on " + os);

        // Set your BrowserStack credentials
        String USERNAME = "sumank_lp4nIj";
        String ACCESS_KEY = "QNV9WYsEjpC7sxjqRaUi";
        String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

        driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://www.google.com");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}