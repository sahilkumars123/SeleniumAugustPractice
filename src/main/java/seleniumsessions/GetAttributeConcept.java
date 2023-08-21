package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By firstName = By.id("input-firstname");

        driver.findElement(firstName).sendKeys("sahiltesting");

        String text = driver.findElement(firstName).getAttribute("value");
        System.out.println(text);



//       String type = driver.findElement(firstName).getAttribute("type");
//        String name = driver.findElement(firstName).getAttribute("name");
//        String id = driver.findElement(firstName).getAttribute("id");
//        String className =driver.findElement(firstName).getAttribute("class");
//
//        System.out.println("attribute value is:: "+type);
//        System.out.println("attribute value is:: "+name);
//        System.out.println("attribute value is:: "+id);
//        System.out.println("attribute value is:: "+className);

        //String type = getElementAttribute(firstName,"type");



    }

    private static WebElement getElement(By locator){
       return driver.findElement(locator);
    }

    private static String getElementAttribute(By locator, String attributeName){
       return getElement(locator).getAttribute(attributeName);
    }

}
