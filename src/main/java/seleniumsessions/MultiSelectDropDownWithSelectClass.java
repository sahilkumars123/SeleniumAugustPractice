package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownWithSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	    
	    WebElement options = driver.findElement(By.id("cars"));
	    
	    Select select = new Select(options);
	    
	    if(select.isMultiple()) {
	    	System.out.println("This is multiple option dropdown");
	    	select.selectByVisibleText("Volvo");
	    	select.selectByVisibleText("Audi");
	    	select.deselectByVisibleText("Audi");
	    	select.deselectAll();
	    }
	    else {
	    	System.out.println("this is not a multiple option dropdown");
	    }  
	}
}
