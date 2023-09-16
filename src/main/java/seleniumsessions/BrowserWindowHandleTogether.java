package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowHandleTogether {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       String parentWindowHandle = driver.getWindowHandle();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();


        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        while (it.hasNext()){
             String handle = it.next();
             driver.switchTo().window(handle);
             System.out.println(driver.getCurrentUrl());

             if(!handle.equals(parentWindowHandle)){
                 driver.close();
             }
        }
        System.out.println("-----------------------------------------------");
        driver.switchTo().window(parentWindowHandle);
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
