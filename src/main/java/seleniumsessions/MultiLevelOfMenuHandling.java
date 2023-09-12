package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelOfMenuHandling {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
//        driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//        Thread.sleep(3000);
//        By menu = By.className("menulink");
        //MultiLevelOfMenuHandling(menu,"COURSES");


        driver.get("https://www.bigbasket.com/");
        Thread.sleep(3000);
        By category = By.xpath("//a[@qa='categoryDD']");


        MultiLevelOfMenuHandling(category,"Beverages","Tea","Green Tea");
    }

    public static WebElement getElement(By locator){
       return driver.findElement(locator);
    }

    public static void MultiLevelOfMenuHandling(By locator, String submenu){

        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).build().perform();
        By secondLevelOfMenu = By.linkText(submenu);
        getElement(secondLevelOfMenu).click();
    }

    public static WebElement getElementByLink(String linkText){

     return driver.findElement(By.linkText(linkText));

    }

    public static void MultiLevelOfMenuHandling(By locator, String menu1, String menu2, String menu3) throws InterruptedException {

        Actions actions = new Actions(driver);
       Alert a = driver.switchTo().alert();
       a.dismiss();
       driver.switchTo().defaultContent();
       
        Action action = actions.moveToElement(getElement(locator)).build();
        action.perform();
        Thread.sleep(2000);

//      By level1 = By.linkText(menu1);
        actions.moveToElement(getElementByLink(menu1)).build().perform();
        Thread.sleep(2000);

    //  By level2 = By.linkText(menu2);
        actions.moveToElement(getElementByLink(menu2)).build().perform();
        Thread.sleep(2000);

     // By level3 = By.linkText(menu3);
        getElementByLink(menu3).click();
    }
}
