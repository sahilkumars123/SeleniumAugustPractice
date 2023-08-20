package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        // create the webelement + perform the action(click,sendkeys,gettext, isDisplayed)

        // 1. not able to reuse the stuff
//        driver.findElement(By.id("input-email")).sendKeys("janautomation@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("Selenium@12345");



        //2.
//        WebElement email = driver.findElement(By.id("input-email"));
//        WebElement password = driver.findElement(By.id("input-password"));
//         WebElement forgotPassword  = driver.findElement(By.id("forgot-password"));
//
//        email.sendKeys("abc@gmail.com");
//        password.sendKeys("abc@123");


        //3.
//        By email = By.id("input-email");
//        By password = By.id("input-password");
//        By forgotpassword = By.id("forgot=password");
//
//        WebElement email_id =  driver.findElement(email);
//        WebElement pass = driver.findElement(password);

        // 4.
//        By email = By.id("input-email");
//        By password = By.id("input-password");
//
//        getElement(email).sendKeys("abc@gmail.com");
//        getElement(password).sendKeys("abc@123");

        //5. utility method apprach
//        By email = By.id("input-email");
//        By password = By.id("input-password");

//        doSendKeys(email,"abc@gmail.com");
//        doSendKeys(password,"abc@123");


        //6.utility method apprach with a ElementUtil
        By email = By.id("input-email");
        By password = By.id("input-password");

        ElementUtil elementUtil = new ElementUtil(driver);

        elementUtil.doSendKeys(email,"abc@gmail.com");
        elementUtil.doSendKeys(password,"abc@123");
    }

}