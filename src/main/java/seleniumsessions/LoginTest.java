package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    static WebDriver driver;

    public static void main(String[] args) {

        BrowserUtil browserUtil = new BrowserUtil();
        driver= browserUtil.intailizeBrowser("chrome"); //123
        browserUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");
        By password = By.id("input-password");

        ElementUtil elementUtil = new ElementUtil(driver); //123
        elementUtil.doSendKeys(email,"abc@gmail.com");
        elementUtil.doSendKeys(password,"abc@123");

        browserUtil.closeBrowser();
    }
}
