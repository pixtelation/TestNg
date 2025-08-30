package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Launch {
    protected WebDriver driver ;
@BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("debuggerAddress", "localhost:54854");
        driver = new ChromeDriver(options);
        // driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

}
