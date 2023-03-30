package Tests;
import Page.AddcustPage;
import Page.ListcustPage;
import Page.ManagerPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AddCustomer {
    public static ManagerPage managerPage;
    public static AddcustPage addcustPage;
    public static ListcustPage listcustPage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        managerPage = new ManagerPage(driver);
        addcustPage = new AddcustPage(driver);
        listcustPage = new ListcustPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
    }
    @Test
    public void loginTest() {
        managerPage.clickaddcustBtn();
        addcustPage.firstNameInput("Severus");
        addcustPage.lastNameInput("Snape");
        addcustPage.postalCodeInput("AA8080");
        addcustPage.clickAddBtn();




    }

    @AfterClass
    public static void tearDown() {
        driver.quit(); }



}
