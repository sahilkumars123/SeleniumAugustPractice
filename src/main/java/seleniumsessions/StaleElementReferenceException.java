package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        //dom v1 - 7834
       WebElement email =  driver.findElement(By.id("input-email"));

       driver.navigate().refresh();

       //Solution :: Reintialize your element

        email =  driver.findElement(By.id("input-email"));

       //9865 - v2 DOM
       email.sendKeys("sahil@yopmail.com");
    }
}
