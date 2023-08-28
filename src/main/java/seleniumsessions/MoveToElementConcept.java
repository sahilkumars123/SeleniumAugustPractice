package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

        Thread.sleep(3000);

        By menu = By.className("menulink");

        twoLevelOfMenuHandling(menu,"COURSES");
    }

    public static WebElement getElement(By locator){
       return driver.findElement(locator);
    }

    public static void twoLevelOfMenuHandling(By locator, String submenu){

        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).build().perform();
        By secondLevelOfMenu = By.linkText(submenu);
        getElement(secondLevelOfMenu).click();

    }
}
