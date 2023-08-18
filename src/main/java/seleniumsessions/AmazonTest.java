package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

    private static WebDriver driver;

    public static void main(String[] args) {


        BrowserUtil browserUtil = new BrowserUtil();

       driver = browserUtil.intailizeBrowser("chrome");

        browserUtil.launchUrl("https://www.amazon.com");

        String title = browserUtil.title();
        System.out.println("title is:: "+title);

        String url = browserUtil.getUrl();
        System.out.println("url is :: "+url);

        System.out.println(driver.getTitle());

        browserUtil.closeBrowser();
    }
}
