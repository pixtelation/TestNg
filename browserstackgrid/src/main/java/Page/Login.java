package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    public void enterSearchTerm(String term) {
        searchBox.sendKeys(term);
    }

    public void clickSearch() {
        searchButton.click();
    }
}