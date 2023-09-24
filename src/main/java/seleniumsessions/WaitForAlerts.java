package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForAlerts {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();


//       Alert alert =driver.switchTo().alert();
//
//       alert.getText();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

      Alert alert =  JSAlert(5);

        System.out.println(alert.getText());

        alert.accept();

    }

    public static Alert JSAlert(int timeout){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert;
    }

}
