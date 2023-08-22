package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GetElements {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By alinksList = By.tagName("a1");
        By imglinksList = By.tagName("a");

        System.out.println("total links present:: "+getLinksCount(alinksList));

        List<String> actualTextList = getElementsTextList(alinksList);

        System.out.println("this is my list:: "+actualTextList);

    }


    private static List<WebElement> getElements(By locator){
      return  driver.findElements(locator);
    }

    private static int getLinksCount(By locator){
       return getElements(locator).size();
    }

    private static List<String> getElementsTextList(By locator){
        List<WebElement> linksList = getElements(locator);
        List<String> linksListText = new ArrayList<>();
        for(WebElement e: linksList){
                String text = e.getText();
                if(!text.isEmpty()){
                    linksListText.add(text);
                }
        }
        return linksListText;
    }


    }
