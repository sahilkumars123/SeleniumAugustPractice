package seleniumsessions;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        //launching a browser
        WebDriver driver = new ChromeDriver();

        //enter url
        driver.get("https://www.google.com");

       String title = driver.getTitle(); //Google
        System.out.println("title is:: "+title);

        if(title.equals("Google")){
            System.out.println("title matched as expected");
        }
        else {
            System.out.println("tile is incorrect");
        }

        //closing the browser
        driver.quit();
    }


}
