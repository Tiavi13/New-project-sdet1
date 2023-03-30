package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcustPage {
    public WebDriver driver;
    public AddcustPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//*[contains(@name, 'fName')]")
    private WebElement firstFild;
    @FindBy(xpath = "//*[contains(@name, 'lName')]")
    private WebElement lastFild;
    @FindBy(xpath = "//*[contains(@name, 'postCd')]")
    private WebElement postalFild;
    @FindBy(xpath = "//*[contains(@name, 'Add Customer')]")
    private WebElement addBtn;
    public void firstNameInput(String login) {
        firstFild.sendKeys(login); }
    public void lastNameInput(String login) {
        lastFild.sendKeys(login); }
    public void postalCodeInput(String login) {
        postalFild.sendKeys(login); }
    public void clickAddBtn() {
        addBtn.click(); }




}
