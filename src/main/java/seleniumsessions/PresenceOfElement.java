package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PresenceOfElement {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

        By username = By.name("username");
        By password = By.name("password");
        By loginBtn = By.tagName("button");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));


        /**
         * An expectation for checking that an element is present on the DOM of a page.
         * This does not necessarily mean that the element is visible on the page.
         */

//      presenceOfElementLocated(username,10).sendKeys("Admin");
//      presenceOfElementLocated(password,3).sendKeys("admin123");
//      presenceOfElementLocated(loginBtn,3).click();

    }

//    private static WebElement presenceOfElementLocated(By locator, int timeInSeconds){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
//        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//    }


    /**
     * An expectation for checking that an element is present on the DOM of a page and visible.
     * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
     * @param locator dsbsbdkbdsknds,
     * @param timeInSeconds sdhksdbkjsd
     * @return it is returnning
     */
//    private static WebElement visibilityOfElementLocated(By locator, int timeInSeconds){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
}
