package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPseudoElements {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        Thread.sleep(3000);

        String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"),'::before').getPropertyValue('content')";

        JavascriptExecutor js = (JavascriptExecutor) driver;

         String var =  js.executeScript(script).toString();


        System.out.println(var);

        if(var.contains("*")){
            System.out.println("it is mandatory field");
        }


    }
}
