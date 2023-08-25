package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterHeaderText {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // //a[text()='Help']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div

        String actualFooterHeaderText1 =  getFooterHeaderText("Help");
        String actualFooterHeaderText2 =  getFooterHeaderText("Blog");
        String actualFooterHeaderText3 =  getFooterHeaderText("Sell apps on Amazon");
        String actualFooterHeaderText4 =  getFooterHeaderText("Shop with Points");

        System.out.println(actualFooterHeaderText1);
        System.out.println(actualFooterHeaderText2);
        System.out.println(actualFooterHeaderText3);
        System.out.println(actualFooterHeaderText4);

    }
    private static String getFooterHeaderText(String link){

       return driver.findElement(By.xpath("//a[text()='"+link+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
    }
}
