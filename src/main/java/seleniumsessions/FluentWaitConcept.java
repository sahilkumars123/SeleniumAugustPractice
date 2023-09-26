package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
    static WebDriver driver;


    //WebDriverWait --> FluentWait(C) --> Wait (until();)
    //until(){}
    //own methods


    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");

        waitForElementVisibleWithFluentWait(email, 10, 1).sendKeys("testing");


    }


//    public static void  waitForElementVisibleWithFluentWaits(By locator, int timeout, int pollingtime){


        //Top Casting
        //      FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//                .withTimeout(Duration.ofSeconds(timeout))
//                .pollingEvery(Duration.ofSeconds(pollingtime))
//                .ignoring(NoSuchElementException.class)
//                .withMessage("element not found"+locator+"till"+timeout+"having polling time as"+pollingtime);
//    }
//
//    public static WebElement  waitForElementVisibleWithFluentWaitsWithPresence(By locator, int timeout, int pollingtime){
//
//
//        //Top Casting
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(timeout))
//                .pollingEvery(Duration.ofSeconds(pollingtime))
//                .ignoring(NoSuchElementException.class)
//                .withMessage("element not found"+locator+"till"+timeout+"having polling time as"+pollingtime);
//
//        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//
//    }
//
//    public static Alert  waitForElementVisibleWithFluentWaitsWithAlert(By locator, int timeout, int pollingtime){
//
//
//        //Top Casting
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(timeout))
//                .pollingEvery(Duration.ofSeconds(pollingtime))
//                .ignoring(NoAlertPresentException.class)
//                .withMessage("element not found"+locator+"till"+timeout+"having polling time as"+pollingtime);
//
//        return wait.until(ExpectedConditions.alertIsPresent());
//    }
//
//    public static void  waitForElementVisibleWithFluentWaitsWithFrame(By locator, int timeout, int pollingtime, int frameId){
//
//
//        //Top Casting
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(timeout))
//                .pollingEvery(Duration.ofSeconds(pollingtime))
//                .ignoring(NoSuchFrameException.class)
//                .withMessage("element not found"+locator+"till"+timeout+"having polling time as"+pollingtime);
//
//        driver = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
//    }
//
//








    public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class)
                .withMessage("----time out is done...element is not found..." + locator);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class)
                .withMessage("----time out is done...element is not found..." + locator);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }

    public Alert waitForJSAlertWithFluentWait(int timeOut, int pollingTime) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("----time out is done...Js alert is not found...");
        return wait.until(ExpectedConditions.alertIsPresent());
    }

}