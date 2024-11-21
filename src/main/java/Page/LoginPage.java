package Page;

import Base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public final By usernameInput = By.cssSelector("div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input[name='username']");
    public final By passwordInput = By.cssSelector("div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input[type='password']");
    public final By logInButton = By.cssSelector("div.orangehrm-login-form > form >div:nth-child(4) > button");

    public String username = "Admin";
    public String password = "admin123";

    public void inputUsername() {
        enterText(usernameInput, username);
    }

    public void inputPassword() {
        enterText(passwordInput, password);
    }
    public void clickLoginButton() {
        click(logInButton);
    }
}

