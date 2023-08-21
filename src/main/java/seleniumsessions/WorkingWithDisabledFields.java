package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisabledFields {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

        By pass = By.id("pass");

//      Boolean isDisplayedValue =  driver.findElement(pass).isDisplayed();
//      System.out.println(isDisplayedValue);
//
//      Boolean isEnabledValue =  driver.findElement(pass).isEnabled();
//      System.out.println(isEnabledValue);

       String value = getElementAttribute(pass,"disabled");

       if(value.equals("true")){
           System.out.println("field is diabled");
       }
       else {
           System.out.println("field is enabled");
       }


    }

    private static WebElement getElement(By locator){
       return driver.findElement(locator);
    }

    private static Boolean isElementDisabled(By locator){
        return getElement(locator).isEnabled();
    }

//    private static Boolean isElementDisabled(By locator){
//        String value =  getElementAttribute(locator,"disabled");
//        if(value.equals("true")){
//          return true;
//        }
//       return false;
//    }



    private static String getElementAttribute(By locator, String attributeName){
        return getElement(locator).getAttribute(attributeName);
    }
}
