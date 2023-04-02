package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcustPage {
    public WebDriver driver;

    public AddcustPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@placeholder, 'First Name')]")
    private WebElement firstFild;
    @FindBy(xpath = "//*[contains(@placeholder, 'Last Name')]")
    private WebElement lastFild;
    @FindBy(xpath = "//*[contains(@placeholder, 'Post Code')]")
    private WebElement postalFild;
    @FindBy(xpath = "//*[contains(@class, 'btn btn-default')]")
    private WebElement addBtn;
    @FindBy(xpath = "//*[contains(@ng-click, 'showCust()')]")
    private WebElement customersBtn;

    public void firstNameInput(String login) {
        firstFild.sendKeys(login);
    }

    public void lastNameInput(String login) {
        lastFild.sendKeys(login);
    }

    public void postalCodeInput(String login) {
        postalFild.sendKeys(login);
    }

    public void clickAddBtn() {
        addBtn.click();
    }
}

