package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SendKeysWithoutSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	    
	    
	    driver.findElement(By.xpath("//div[text()='Select Option']")).click();
	    
	    List<WebElement> listOfOptions = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
	    
	    System.out.println(listOfOptions.size());

	    for(WebElement e : listOfOptions) {
	    	
	    	String text = e.getText();
	    	System.out.println(text);
	    	if(text.contains("Group 2, option 2")) {
	    		e.click();
	    		break;
	    	}
	    }
	}

}
