package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {


    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        String parentWindow = it.next();

        //driver.switchTo().window(parentWindow); -- this line is not required as I am already on parent window
        System.out.println("parent session id:: "+parentWindow);
        System.out.println("parent current url:: "+ driver.getCurrentUrl());

        System.out.println("child ----------------------------------------------------");
        String childWindow = it.next();

        driver.switchTo().window(childWindow);
        System.out.println("child session id:: "+childWindow);
        System.out.println(driver.getCurrentUrl());
        driver.close();

        System.out.println("Again Parent ----------------------------------------------------");

        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
