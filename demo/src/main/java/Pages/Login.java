package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


public class Login {
    private WebDriver driver;


    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
     }
    

    @FindBy(id = "APjFqb")
    WebElement findword;

    @FindBy(xpath = "//input[@name='btnK']")
    WebElement searchicon;

    @FindBy(xpath = "//input[@name='btnI']")
    WebElement FeelingLucky;

    

    public void searchword(String word)
    {
        findword.click();
        findword.sendKeys(word);
    } 

    public void clickforword()
    {
        searchicon.click();
    }

    public void Feel()
    {
        FeelingLucky.click();
    }



    
}
