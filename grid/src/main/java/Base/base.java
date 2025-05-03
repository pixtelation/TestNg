package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class base {
    protected WebDriver driver;

    // @BeforeSuite
    public void setup(String platform, String browser, String nodeURL) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("platformName", platform);


        driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    // @AfterSuite
    // public void tearDown() {
    //     if (driver != null) {
    //         driver.quit();
    //     }
    // }

}


