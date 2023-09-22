package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandleSVGElements {

    //1. To print all states name
    //2. To click on any of one state
    //3. Hover on the state and print the state name


    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://petdiseasealerts.org/forecast-map");
        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));

        Actions actions = new Actions(driver);
        for(WebElement e: states){
            actions.moveToElement(e).build().perform();
            Thread.sleep(500);
            String text = e.getAttribute("name");
            System.out.println(text);
            if(text.equals("Nevada")){
                e.click();
                break;

            }
        }
    }
}
