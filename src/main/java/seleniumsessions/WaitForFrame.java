package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForFrame {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");




//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//       driver = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainframe"));
//       driver.findElement(By.id("sabsjka")).click();


        // by locator
        // timeout
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy()).size();


        //radio buttons, checkboxes
        //visibility
        //enable
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By locator));

    }
}
