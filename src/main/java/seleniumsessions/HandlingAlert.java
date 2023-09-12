package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    
	    
	    //1. JS Alert
//	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//	    Alert alert = driver.switchTo().alert();
//	    Thread.sleep(3000);
//	    String text = alert.getText();
//	    System.out.println(text);
//	    alert.accept();
	    
	    
	    //2. Confirm alert
//	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	    Alert alert = driver.switchTo().alert();
//	    Thread.sleep(3000);
//	    String text = alert.getText();
//	    System.out.println(text);
//	    alert.dismiss();
	    //alert.accept(); ---  org.openqa.selenium.NoAlertPresentException: no such alert
	    
	    //3. Prompt Alert
	    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(3000);
	    String text = alert.getText();
	    System.out.println(text);
	    alert.sendKeys("TestAutomation");
	    alert.accept();
	    
	    String result = driver.findElement(By.id("result")).getText();
	    String resultOne = result.split(":")[1].trim();
	    if(resultOne.equals("TestAutomation")) {
	    	System.out.println("TESTCASE::PASSED");
	    }else {
	    	System.out.println("TESTCASE::FAIL");
	    }
   
	}

}
