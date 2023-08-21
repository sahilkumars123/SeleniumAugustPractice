package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementText {

   static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By headerText = By.tagName("h1");

       if(checkElementIsDisplayed(headerText)){
           String text = doElementGetText(headerText);
           System.out.println("text is:: "+text);
           if(text.equals("Register Account")){
               System.out.println("REGISTER TEST -- PASS");
           }
           else {
              System.out.println("REGISTER TEST -- FAIL");
           }
       }
       else {
           System.out.println("element is not present on the screen");
       }
    }

    private static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    private static String doElementGetText(By locator){
       return getElement(locator).getText();
    }

    private static Boolean checkElementIsDisplayed(By locator){
         return getElement(locator).isDisplayed();
    }


}
