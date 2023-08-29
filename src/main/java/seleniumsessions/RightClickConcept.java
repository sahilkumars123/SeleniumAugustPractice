package seleniumsessions;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RightClickConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        Thread.sleep(3000);

        By right_click = By.xpath("//span[text()='right click me']");


        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(right_click)).perform();

       // driver.findElement(option).click();


//        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
//
//        for(WebElement e: options){
//            String text = e.getText();
//            System.out.println(text);
//            if(text.equals("Copy")){
//                e.click();
//                break;
//            }
//        }


    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static void RightClickOperation(By locator, String optionValue){

        Actions actions = new Actions(driver);
        actions.contextClick(getElement(locator)).perform();
        By option = By.xpath("//*[text()='"+optionValue+"']");
        getElement(option).click();
    }
}
