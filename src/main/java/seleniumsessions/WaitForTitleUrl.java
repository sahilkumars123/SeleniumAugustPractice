package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForTitleUrl {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");


//       String title = driver.getTitle();
//
//       System.out.println(title); // Loading..Untitled..CRM demo:


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            if (wait.until(ExpectedConditions.titleIs("Book Your Free OrangeHRM Demo Now | OrangeHRM"))) {
                System.out.println("title is correct");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("tile not found");
        }
    }

//    private static void titleContains(String titleFraction, int timeout){
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//        try {
//            if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
//                System.out.println("title fraction is correct");
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            System.out.println("tile fraction not found");
//        }


//        private static void titleIs(String title, int timeout){
//
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//            try {
//                if (wait.until(ExpectedConditions.titleIs(title))) {
//                    System.out.println("title  is correct");
//                }
//            }
//            catch (Exception e){
//                e.printStackTrace();
//                System.out.println("tile  not found");
//            }
//    }


//    private static void urlToBe(String url, int timeout){
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//        try {
//            if (wait.until(ExpectedConditions.urlToBe(url))) {
//                System.out.println("url  is correct");
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            System.out.println("url  not found");
//        }
//    }


        private static String urlContains(String urlFraction, int timeout) {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            try {
                if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
                    System.out.println("url fraction is correct");
                    return driver.getCurrentUrl();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("url fraction not found");
            }
            return null;
        }

}
