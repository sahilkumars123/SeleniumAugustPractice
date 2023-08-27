package seleniumsessions;

import CustomException.FrameworkException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ElementUtil {

    private WebDriver driver;

    public  ElementUtil(WebDriver driver){
        this.driver = driver;
    }


    public void doSendKeys(By locator, String value){

        if(value == null){
            System.out.println("please pass the correct value");
            throw new FrameworkException("VALUECANNOTBENULL");
        }

        getElement(locator).sendKeys(value);
    }

    public void doClick(By locator){

        getElement(locator).click();
    }

    public String doElementGetText(By locator){
        return getElement(locator).getText();
    }

    public WebElement getElement(By locator){//returning me a webelement
        WebElement element = null;
        try {
             element =  driver.findElement(locator);
        }
        catch (NoSuchElementException e){
            System.out.println("Please check your locator value");
            e.printStackTrace();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            element = driver.findElement(locator);
        }
        return element;
    }

    public Boolean checkElementIsDisplayed(By locator){
        return getElement(locator).isDisplayed();
    }

    public String getElementAttribute(By locator, String attributeName){
        return getElement(locator).getAttribute(attributeName);
    }

    public Boolean isElementDisabled(By locator){
        return getElement(locator).isEnabled();
    }

//    private static Boolean isElementDisabled(By locator){
//        String value =  getElementAttribute(locator,"disabled");
//        if(value.equals("true")){
//            return true;
//        }
//        return false;
//    }


    public  List<WebElement> getElements(By locator){
        return  driver.findElements(locator);
    }

    public  int getLinksCount(By locator){
        return getElements(locator).size();
    }

    public List<String> getElementsTextList(By locator){
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

    //*************************** DropDown Utils ********************************//

    public void selectFromDropDownByIndex(By locator, int index){

        if(index < 0){
            System.out.println("please pass the +ve index");
            return;
        }
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public void selectFromDropDownByValue(By locator, String value){

        if(value == null){
            System.out.println("value cannot be null");
            return;
        }
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    public void selectFromDropDownByVisibleText(By locator, String text){

        if(text == null){
            System.out.println("text cannot be null");
            return;
        }
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(text);
    }

    public int getCountOfAllOptionsOfACountryDropDown(By locator){

        Select select = new Select(getElement(locator));
        List<WebElement> countryOptions = select.getOptions();
        return countryOptions.size();
    }

    public List<String> getAllOptionsOfACountryDropDown(By locator){

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

