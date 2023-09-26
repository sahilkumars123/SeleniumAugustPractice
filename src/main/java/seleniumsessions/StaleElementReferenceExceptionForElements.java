package seleniumsessions;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaleElementReferenceExceptionForElements {


    // 1. In Fluent wait feature you can write .ignoring condition
    //2. To re intialize the list
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        List<WebElement> footerLinks = driver.findElements(By.cssSelector("footer a"));

        for(int i=0; i<footerLinks.size(); i++){
            footerLinks.get(i).click();//v4
            driver.navigate().back();//v5
            footerLinks = driver.findElements(By.cssSelector("footer a")); //v5
        }
    }
}





