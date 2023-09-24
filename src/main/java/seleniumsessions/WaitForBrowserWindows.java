package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WaitForBrowserWindows {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        String parentWindowHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if(wait.until(ExpectedConditions.numberOfWindowsToBe(5))){

                }
            }

        }
