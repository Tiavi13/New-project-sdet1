package Tests;

import Page.AddcustPage;
import Page.ListcustPage;
import Page.ManagerPage;
import Page.SystemAlertPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;





public class AddCustomer {
    public static ManagerPage managerPage;
    public static AddcustPage addcustPage;
    public static ListcustPage listcustPage;
    public static SystemAlertPage systemalertPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        managerPage = new ManagerPage(driver);
        addcustPage = new AddcustPage(driver);
        listcustPage = new ListcustPage(driver);
        systemalertPage = new SystemAlertPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
    }
    @Test
    public void loginTest() {
        managerPage.clickaddcustBtn();
        addcustPage.firstNameInput("Severus");
        addcustPage.lastNameInput("Snape");
        addcustPage.postalCodeInput("AA8080");
        addcustPage.clickAddBtn();
        systemalertPage.closeSystemAlert();
        managerPage.clickCustomersBtn();
        listcustPage.searchCustomer("Severus");
        listcustPage.assertFirstName("Severus");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit(); }



}
