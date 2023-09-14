package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-scenario/");

        driver.switchTo().frame("pact1");
        driver.findElement(By.id("inp_val")).sendKeys("first crush");

        driver.switchTo().frame("pact2");
        driver.findElement(By.id("jex")).sendKeys("current crush");

        driver.switchTo().frame("pact3");
        driver.findElement(By.id("glaf")).sendKeys("destiny crush");

        //Scenrio 1:: 1-2-3-mainpage
//        driver.switchTo().defaultContent();
//        String text = driver.findElement(By.tagName("h3")).getText();
//        System.out.println(text);

        //Scenrio 2: 1-2-3 3-2-1
        //driver.switchTo().frame("pact2");
        driver.switchTo().parentFrame(); //3-2
        driver.findElement(By.id("jex")).sendKeys(" current crush updated");

        driver.switchTo().parentFrame(); //2-1
        driver.findElement(By.id("inp_val")).sendKeys(" first crush updated");

        //Sceanrio 3: from 1-mainpage
        driver.switchTo().parentFrame();
        String text = driver.findElement(By.tagName("h3")).getText();
        System.out.println(text);

    }
}
