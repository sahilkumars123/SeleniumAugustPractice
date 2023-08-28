package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        Thread.sleep(3000);

        By source_ele = By.id("draggable");
        By target_ele = By.id("droppable");


        Actions actions = new Actions(driver);
        //Method Chaining
//        actions.
//                clickAndHold(driver.findElement(source_ele)).
//                    moveToElement(driver.findElement(target_ele)).
//                        release().
//                            build().
//                                perform();



        //without build and perform ---not valid
        //with build ---not valid
        //with perform - valid
        //with build and with perform - valid

        actions.dragAndDrop(driver.findElement(source_ele), driver.findElement(target_ele)).perform();

    }
    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static void dragAndDropOperation(By source_locator, By target_locator){

        Actions actions = new Actions(driver);
        actions.dragAndDrop(getElement(source_locator), getElement(target_locator)).perform();
    }

}
