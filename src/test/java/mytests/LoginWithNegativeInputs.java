package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithNegativeInputs {

    WebDriver driver;

    @BeforeTest
    public void setup(){

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    }

    @DataProvider
    public Object[][] loginTestData(){
        return new Object[][] {
                {"test121212@gmail.com", "test@12121212"},
                {"sahil@gmail.com", "test@12121212"},
                {"test121212@.@.@gmail.com", "test@12121212121"},
                {"  ", "   "},
                {"!@#!@#!@#", "test12121"}
        };
    }

    @Test(dataProvider = "loginTestData")
    public void loginTest(String email, String password){

        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(email);

        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        String errorMsg =
                driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();

        System.out.println(errorMsg);
        Assert.assertTrue(errorMsg.contains("Warning: No match for E-Mail Address and/or Password"));

    }

}
