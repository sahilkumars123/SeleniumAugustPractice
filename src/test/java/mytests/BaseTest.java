package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    WebDriver driver;

    @Parameters({"browserName","url"})
    @BeforeTest
    public void setup(String browser, String url){
        //chrome
        //driver = new ChromeDriver();

        switch (browser.toLowerCase()){

            case "chrome":
                driver = new ChromeDriver();
                break;
            case  "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("please enter valid browser name:: "+browser);
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}