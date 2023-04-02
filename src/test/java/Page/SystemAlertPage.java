package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SystemAlertPage {
    public WebDriver driver;
    public SystemAlertPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    public void closeSystemAlert() {
        driver.switchTo().alert().accept(); }
}
