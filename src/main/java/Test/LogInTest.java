package Test;

import Base.BaseTest;
import Page.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogInTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void displayWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void login() throws Exception{
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        Thread.sleep(5000);
    }
}
