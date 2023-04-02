package Tests;
import Page.ListcustPage;
import Page.ManagerPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class SortCustomers {
    public static ManagerPage managerPage;
    public static ListcustPage listcustPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        managerPage = new ManagerPage(driver);
        listcustPage = new ListcustPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
    }

    @Test
    public void sortTest() {
        managerPage.clickCustomersBtn();
        listcustPage.checkCollection();
    }
    @AfterClass
    public static void tearDown() {
        driver.quit(); }
}