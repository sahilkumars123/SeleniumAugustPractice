package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By firstname = By.id("input-firstname");

//        String text = "sahil";
//        StringBuffer sf = new StringBuffer("sail");
//        StringBuilder sf1 = new StringBuilder("sahil");
//
//        System.out.println("this is my value"+"sahil");
//
//        driver.findElement(firstname).sendKeys(text,sf,sf1);
//        driver.findElement(firstname).sendKeys(text+sf+sf1);

//        driver.findElement(firstname).sendKeys("");
//        driver.findElement(firstname).sendKeys(" ");
        driver.findElement(firstname).sendKeys(null);

       String title =  driver.getTitle();




    }
}
