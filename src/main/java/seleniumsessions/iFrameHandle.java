package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

        driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-8']")).sendKeys("SAHIL");

        //main page
        driver.switchTo().defaultContent();

        String heading = driver.findElement(By.id("tooltip")).getText();

        System.out.println(heading);
    }
}
