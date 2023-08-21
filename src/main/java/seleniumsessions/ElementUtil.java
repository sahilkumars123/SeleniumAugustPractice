package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    private WebDriver driver;

    public  ElementUtil(WebDriver driver){
        this.driver = driver;
    }

    public void doSendKeys(By locator, String value){

        getElement(locator).sendKeys(value);
    }

    public void doClick(By locator){

        getElement(locator).click();
    }

    public String doElementGetText(By locator){
        return getElement(locator).getText();
    }

    public WebElement getElement(By locator){ //returning me a webelement

        return driver.findElement(locator);
    }

    public Boolean checkElementIsDisplayed(By locator){
        return getElement(locator).isDisplayed();
    }

    public String getElementAttribute(By locator, String attributeName){
        return getElement(locator).getAttribute(attributeName);
    }

    public Boolean isElementDisabled(By locator){
        return getElement(locator).isEnabled();
    }

//    private static Boolean isElementDisabled(By locator){
//        String value =  getElementAttribute(locator,"disabled");
//        if(value.equals("true")){
//            return true;
//        }
//        return false;
//    }

}
