package testUtility;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.loginPage.LoginPageMethods;
import io.qameta.allure.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest extends TestUtils {

    // Initialize the LoginPage object to be used in tests
    // This will allow us to access the methods defined in the LoginPage class
  public LoginPageMethods loginPage;

  @BeforeAll
    public static void setup() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000; // Set a default timeout for tests
      Configuration.browserCapabilities = new ChromeOptions().addArguments(
              "--no-sandbox",
              "--disable-dev-shm-usage",
              "--disable-gpu",
              "--remote-allow-origins=*"
      );
        Configuration.baseUrl = "https://www.demo.guru99.com/V4/"; // Set a default base URL for tests
        Configuration.headless = true; // Run tests in headless mode if needed
        Configuration.webdriverLogsEnabled = true; // Enable WebDriver logs for debugging

        }
    @BeforeEach
    public  void openLoginPage() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));// Add Selenide listener for Allure reporting
        open(Configuration.baseUrl); // Open the login page using the base URL
        sleep(4000);
        WebDriverRunner.getWebDriver().manage().window().maximize();
       loginPage= new LoginPageMethods();
    }
@AfterEach
    public void tearDown() {
        // Common cleanup code for tests can go here
        SelenideLogger.removeListener("AllureSelenide");
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }
}
