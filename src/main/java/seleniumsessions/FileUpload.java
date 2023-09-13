package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class FileUpload {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");


        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\SAHIL\\Downloads\\Sonika_Operations_7Years.pdf");

        //what if type=file is not availabe?
        //1. ask your dev team to add this attribute
        //2. Robot class -- not recommended -- only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
        //3. autoIt -- not recommended -- only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
        //4. sikuli -- not recommended -- coz its based image processing
    }
}
