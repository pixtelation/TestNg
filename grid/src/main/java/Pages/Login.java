package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
 

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(xpath = "//a[@aria-label='Gmail ']")
    WebElement Gmail;

    public void searchWord(String word) throws InterruptedException {
        searchBox.sendKeys(word);
        Thread.sleep(2000); // Let the suggestions load
        searchButton.submit();
    }

    public void GmailIcon()
    {
        Gmail.click();
    }


}
