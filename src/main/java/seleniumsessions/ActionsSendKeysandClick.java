package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsSendKeysandClick {

       static WebDriver driver;

        public static void main(String[] args) throws InterruptedException {

            driver = new ChromeDriver();
            driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

            By forgotten_password = By.linkText("Forgotten Password");
            By fn = By.id("input-firstname");

            Actions actions = new Actions(driver);
            actions.click(driver.findElement(forgotten_password)).perform();

            actions.sendKeys(driver.findElement(fn)).perform();

    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static void doActionsClick(By locator){
            Actions actions = new Actions(driver);
            actions.click(getElement(locator)).perform();
    }

    public static void doActionsSendKeys(By locator, String value){
        Actions actions = new Actions(driver);
        actions.sendKeys(getElement(locator), value).perform();
    }
}
