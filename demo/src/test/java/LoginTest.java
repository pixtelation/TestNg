import org.testng.annotations.Test;
import Base.Launch;
import Pages.Login;

public class LoginTest extends Launch {
    Login lg = new Login(driver);

    @Test
    public void SearchWord()
    {
       
        lg.searchword("Gemini");
        // lg.clickforword();
        // lg.Feel();
    }


}
