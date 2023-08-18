package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuitCaseStudy {

    private static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver(); //sid = 123

        driver.get("https://www.google.com"); //sid = 123

        System.out.println(driver.getTitle()); //sid = 123

        driver.close(); //sid=123

        //quit
        //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
        //System.out.println(driver.getCurrentUrl()); //sid = null

        //close
        //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
        //System.out.println(driver.getCurrentUrl());
    }
}
