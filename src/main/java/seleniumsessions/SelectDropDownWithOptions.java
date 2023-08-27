package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectDropDownWithOptions {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

        Thread.sleep(4000);

        By selectCountryDropDown = By.id("Form_getForm_Country");

        System.out.println("count is:: "+getCountOfAllOptionsOfACountryDropDown(selectCountryDropDown));

        List<String> actualCountries = getAllOptionsOfACountryDropDown(selectCountryDropDown);

        System.out.println(actualCountries);

        List<String> expectedCountries =  Arrays.asList("India","Algeria","Angola");

        if (actualCountries.containsAll(expectedCountries)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

    }

    private static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static int getCountOfAllOptionsOfACountryDropDown(By locator){

        Select select = new Select(getElement(locator));
        List<WebElement> countryOptions = select.getOptions();
        return countryOptions.size();
    }

    public static List<String> getAllOptionsOfACountryDropDown(By locator){

        Select select = new Select(getElement(locator));
        List<WebElement> countryOptions = select.getOptions();
        List<String> actualCountryOptions = new ArrayList<>();

        for(WebElement e: countryOptions){
            String text = e.getText();
            actualCountryOptions.add(text);
        }
        return actualCountryOptions;
    }

}
