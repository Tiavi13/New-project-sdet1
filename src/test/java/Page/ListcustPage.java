package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

public class ListcustPage {
    public WebDriver driver;
    public ListcustPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//*[contains(@placeholder, 'Search Customer')]")
    private WebElement searchCustomerInput;


    public void searchCustomer(String login) {
        searchCustomerInput.sendKeys(login); }

    public void assertFirstName(String firstName) {
        String firstNameInTable = driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
        assertEquals(firstNameInTable, firstName);}
    public void checkCollection() {
        String firstName1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
        String firstName2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
        String firstName3 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
        String firstName4 = driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]")).getText();
        String firstName5 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]")).getText();

        ArrayList<String> firstNameCollection = new ArrayList<String>();
        firstNameCollection.add(firstName1);
        firstNameCollection.add(firstName2);
        firstNameCollection.add(firstName3);
        firstNameCollection.add(firstName4);
        firstNameCollection.add(firstName5);
        Collections.sort(firstNameCollection);
        System.out.println(firstNameCollection);

        driver.findElement(By.xpath("//*[contains(@ng-click, 'fName')]")).click();
        driver.findElement(By.xpath("//*[contains(@ng-click, 'fName')]")).click();

        String firstNameNew1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
        String firstNameNew2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
        String firstNameNew3 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
        String firstNameNew4 = driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]")).getText();
        String firstNameNew5 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]")).getText();

        ArrayList<String> firstNameCollection1 = new ArrayList<String>();
        firstNameCollection1.add(firstNameNew1);
        firstNameCollection1.add(firstNameNew2);
        firstNameCollection1.add(firstNameNew3);
        firstNameCollection1.add(firstNameNew4);
        firstNameCollection1.add(firstNameNew5);
        System.out.println(firstNameCollection1);

        assertEquals(firstNameCollection, firstNameCollection1);
    }

}
