package seleniumsessions;

import CustomException.FrameworkException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    //********************Actions Utils ***************************************//

    public void twoLevelOfMenuHandling(By locator, String submenu){

        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).build().perform();
        By secondLevelOfMenu = By.linkText(submenu);
        doClick(secondLevelOfMenu);
    }

    public void dragAndDropOperation(By source_locator, By target_locator){

        Actions actions = new Actions(driver);
        actions.dragAndDrop(getElement(source_locator), getElement(target_locator)).perform();
    }

    public void RightClickOperation(By locator, String optionValue){

        Actions actions = new Actions(driver);
        actions.contextClick(getElement(locator)).perform();
        By option = By.xpath("//*[text()='"+optionValue+"']");
        doClick(option);
    }

    public  void doActionsClick(By locator){
        Actions actions = new Actions(driver);
        actions.click(getElement(locator)).perform();
    }

    public  void doActionsSendKeys(By locator, String value){
        Actions actions = new Actions(driver);
        actions.sendKeys(getElement(locator), value).perform();
    }

    /**
     *
     * @param It is accepting By locator
     * @param It is for 2 level menuhandling
     */
    public void MultiLevelOfMenuHandling(By locator, String submenu){

        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).build().perform();
        By secondLevelOfMenu = By.linkText(submenu);
        getElement(secondLevelOfMenu).click();
    }


    /**
     * It is for 4 level menu handling
     * @param locator
     * @param menu1
     * @param menu2
     * @param menu3
     * @throws InterruptedException
     */
    public void MultiLevelOfMenuHandling(By locator, String menu1, String menu2, String menu3) throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).build().perform();
        Thread.sleep(2000);

        By level1 = By.linkText(menu1);
        actions.moveToElement(getElement(level1)).build().perform();
        Thread.sleep(2000);

        By level2 = By.linkText(menu2);
        actions.moveToElement(getElement(level2)).build().perform();
        Thread.sleep(2000);

        By level3 = By.linkText(menu3);
        getElement(level3).click();
    }

}

