package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLoadTimeout {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        //pageload timout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        pageLoadTimout(10);



        //document.readystate
        //loading
        //interactive
        //complete


//        //implicit wait is applicable to elements
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//        By email = By.id("input-email");

    }

    public static void pageLoadTimout(int timeOut){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
        String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
        if(Boolean.parseBoolean(flag)){
            System.out.println("Page has been loaded successfully");
        }
        else {
            System.out.println("page is not loaded");
        }
    }
}
