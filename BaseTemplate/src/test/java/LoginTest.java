import org.testng.annotations.Test;
import Base.Launch;
import Pages.Login;

public class LoginTest extends Launch {
    

    @Test
    public void SearchWord()
    {
       
        Login lg = new Login(driver);
       
        lg.searchword("Gemini");
        // lg.clickforword();
        // lg.Feel();
    }


}
