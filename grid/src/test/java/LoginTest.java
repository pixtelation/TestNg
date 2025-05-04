import Base.base;
import Pages.Login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends base {



    @Parameters({"platform", "browser", "nodeURL"})
    @Test
    public void googleSearch(String platform, String browser, String nodeURL) throws MalformedURLException, InterruptedException {
        setup(platform, browser, nodeURL);

        Login lg = new Login(driver);
        lg.searchWord("TestNG Grid");
        tearDown();
    }



    @Parameters({"platform", "browser", "nodeURL"})
    @Test
    public void clickOnGmail(String platform, String browser, String nodeURL) throws Exception
    {
        setup(platform, browser, nodeURL);

        Login lg = new Login(driver);
        lg.GmailIcon();
        tearDown();
    }
   
}