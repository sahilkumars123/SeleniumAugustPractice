package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String username = "admin";
        String password = "admin";

        driver = new ChromeDriver();
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");


    }
}
