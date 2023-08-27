package seleniumsessions;

import CustomException.FrameworkException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

        Thread.sleep(4000);

        By selectCountryDropDown = By.id("Form_getForm_Country");

        selectFromDropDownByIndex(selectCountryDropDown,5);
        Thread.sleep(2000);
        selectFromDropDownByValue(selectCountryDropDown,"India");
        Thread.sleep(2000);
        selectFromDropDownByValue(selectCountryDropDown,"Angola");
        Thread.sleep(2000);
        selectFromDropDownByVisibleText(selectCountryDropDown, "Algeria");




        //By index
//        WebElement ele = driver.findElement(selectCountryDropDown);
//        Select select = new Select(ele);
//        select.selectByIndex(5);


        //By value
//        Select select = new Select(driver.findElement(selectCountryDropDown));
//        select.selectByValue("Afghanistan");

        //By Visible text
//        Select select = new Select(driver.findElement(selectCountryDropDown));
//        select.selectByVisibleText("India");

    }

    private static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    private static void selectFromDropDownByIndex(By locator, int index){

        if(index < 0){
            System.out.println("please pass the +ve index");
            return;
        }
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    private static void selectFromDropDownByValue(By locator, String value){

        if(value == null){
            System.out.println("value cannot be null");
            return;
        }
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    private static void selectFromDropDownByVisibleText(By locator, String text){

        if(text == null){
            System.out.println("text cannot be null");
            return;
        }
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(text);
    }

}
