package seleniumsessions;

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

//    public static void getElementByLink(String value, Ac){
//
//
//    }

    public static void MultiLevelOfMenuHandling(By locator, String menu1, String menu2, String menu3) throws InterruptedException {

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(getElement(locator)).build();
        action.perform();
        Thread.sleep(2000);

        By level1 = By.linkText(menu1);
        actions.moveToElement(getElement(level1)).build().perform();
        Thread.sleep(2000);

        By level2 = By.linkText(menu2);
        actions.moveToElement(getElement(level2)).build().perform();
        Thread.sleep(2000);

        By level3 = By.linkText(menu3);
        getElement(level3).click();
    }
}
