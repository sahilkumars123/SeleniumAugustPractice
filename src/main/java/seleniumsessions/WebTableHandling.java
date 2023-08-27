package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTableHandling {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        Thread.sleep(5000);

        //Req 1
        clickOnCheckbox("Joe.Root");
        clickOnCheckbox("John.Smith");

        //Req 2
        System.out.println(getEmployeeInfo("Joe.Root"));
        System.out.println(getEmployeeInfo("John.Smith"));

    }

    private static void clickOnCheckbox(String employeeName){

        driver.findElement(By.xpath("//a[text()='"+employeeName+"']/parent::td/preceding-sibling::td/input")).click();
    }

    private static List<String> getEmployeeInfo(String employeeName){

        List<WebElement> employeeInfo = driver.findElements(By.xpath("//a[text()='" + employeeName + "']/parent::td/following-sibling::td"));

        System.out.println("total info is:: "+employeeInfo.size());


        List<String> actualEmployeeInfo = new ArrayList<>();

        for(WebElement e: employeeInfo){
            String text = e.getText();
            actualEmployeeInfo.add(text);
        }
        return actualEmployeeInfo;
    }
}
