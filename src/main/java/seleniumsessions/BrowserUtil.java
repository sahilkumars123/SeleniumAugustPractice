package seleniumsessions;

import CustomException.FrameworkException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

        private WebDriver driver;

        public WebDriver intailizeBrowser(String browserName){//chrome,firefox sahil

            if(browserName == null){
               // System.out.println("BROWSERNAME CANNOT BE NULL");
                throw new FrameworkException("BROWSERNAME CANNOT BE NULL");
            }

            switch (browserName.toLowerCase().trim()){

                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                   // System.out.println("Please enter valid browser name");
                    throw new FrameworkException("Please enter valid browser name");
            }
            return driver;
        }

        public void launchUrl(String url){
            driver.get(url);
        }

        public String title(){
           return driver.getTitle();
        }

        public String getUrl(){
           return driver.getCurrentUrl();
        }

        public void closeBrowser(){
            driver.quit();
        }

    public String pageSource(){
        return driver.getPageSource();
    }


}
