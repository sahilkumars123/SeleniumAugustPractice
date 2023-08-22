package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TotalLinksConcept {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //1. total links present a webpage
        //2. to print the text of an link

        List<WebElement> linksList = driver.findElements(By.tagName("a"));

        int linksListCount = linksList.size();

        System.out.println("count is:: "+linksListCount);


        //1. Index based loop
//        for(int i=0;i<linksListCount;i++){
//           String text = linksList.get(i).getText();
//           if(!text.isEmpty()){
//               System.out.println(i+":"+text);
//           }
//        }

        //2
        int count =1;
        for(WebElement e: linksList){
                 String text = e.getText();
                 if(!text.isEmpty()) {
                     System.out.println(count + ":" + text);
                 }
                 count++;
        }
    }

}
