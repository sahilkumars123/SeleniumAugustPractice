package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingWithRegister {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        Thread.sleep(3000);

        By firstName = By.id("input-firstname");
        Actions actions = new Actions(driver);

        actions
                .sendKeys(driver.findElement(firstName),"sahil")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("kumar")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("sahil@gmail.com").perform();
    }


}
