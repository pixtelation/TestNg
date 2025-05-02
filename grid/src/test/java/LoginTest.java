
import Base.base;
import Pages.Login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest {
    @Parameters({"platform", "browser", "nodeURL"})
    @Test
    public void googleSearch(String platform, String browser, String nodeURL) throws MalformedURLException, InterruptedException {
        base l = new base();
        l.setup(platform, browser, nodeURL);

        Login lg = new Login(base.driver);
        lg.searchWord("TestNG Grid");
    }
}