package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Base.BaseTest.driver;

public class BasePage {

    public WebElement element(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        element(locator).click();
    }
    public void enterText(By locator, String string){
        element(locator).clear();
        element(locator).sendKeys(string);
    }
}
