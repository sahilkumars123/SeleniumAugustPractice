package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

    //AAA -

    @Test(priority = 1)
    public void getTitle(){
        System.out.println("this is gettitle method");
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @Test(priority = 2)
    public void getURL(){
        System.out.println("this is geturl method");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test(priority = 3)
    public void appSearch(){
        System.out.println("this is my search method");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("selenium");
        search.submit();
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
    }

}
