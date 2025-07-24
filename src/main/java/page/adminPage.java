package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminPage {
    @FindBy(className = "search-box")
    public WebElement searchInput;

    public adminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
