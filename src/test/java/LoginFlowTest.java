import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginFlowTest {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/minhle/Desktop/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void RegisterAndLogin(){
        RegistrationPage.using(driver)
                .launch()
                .setFirstName("Le Truong")
                .setLastName("Minh")
                .setUserName("minhle2098")
                .setPassword("123456")
                .setConfirmPassword("123456")
                .clickOnButtonRegister()
                .clickToSignInLink();

        LoginPage.using(driver)
                .setUserName("minhle2098")
                .setPassword("123456")
                .clickOnButtonSubmit();
    }

}
