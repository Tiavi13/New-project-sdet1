package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ManagerPage {
    public WebDriver driver;
    public ManagerPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'btn btn-lg tab')]")
    private WebElement addcustBtn;
    @FindBy(xpath = "//*[contains(@ng-click, 'showCust()')]")
    private WebElement customersBtn;
    public void clickaddcustBtn() {
        addcustBtn.click(); }
    public void clickCustomersBtn() {
        customersBtn.click(); }
}
