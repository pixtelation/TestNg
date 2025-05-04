
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Base.base;
import Page.Login;

public class LoginTest extends base {


     @Test
    @Parameters({"os", "browser", "version"})
    public void openGoogle(String os, String browser, String version) throws Exception {
        setup(os, browser, version);
        System.out.println("Title: " + driver.getTitle());
    }

   
}