package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPauseConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        Thread.sleep(3000);

        By firstName = By.id("input-firstname");
        Actions actions = new Actions(driver);

        String s = "SahilKumar";

        char[] name = s.toCharArray();

        for(int i=0; i< name.length; i++){
            actions.sendKeys(driver.findElement(firstName), String.valueOf(name[i]+" "))
                    .pause(500)
                    .perform();
        }

    }
}
