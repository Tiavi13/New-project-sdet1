package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ListcustPage {
    public WebDriver driver;
    public ListcustPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
}
