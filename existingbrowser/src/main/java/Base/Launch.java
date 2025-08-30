package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Launch {
    public WebDriver driver ;
@BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("debuggerAddress", "localhost:62736");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

}
