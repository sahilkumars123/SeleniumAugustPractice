package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");


        //driver.switchTo().frame(2);
        //driver.switchTo().frame("main");
        //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));

        String title = driver.findElement(By.tagName("h2")).getText();
        System.out.println(title);


    }
}
