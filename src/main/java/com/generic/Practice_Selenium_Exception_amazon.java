package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPageFactroy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Selenium_Exception_amazon {
	
	
public void get_salary() {

		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.amazon.com");
		MasterPageFactroy mpf= new MasterPageFactroy(driver);
		
		
		//Implicit wait time
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		
		
		//Explicit Wait time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getHello_Action()));
		
		
		Actions ac= new Actions(driver);
		ac.moveToElement(mpf.getHello_Action()).perform();
		
		
		
		//mpf.getOrder_Action().click();
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getSign_in()));
		mpf.getSign_in().click();
		
		

}
public static void main(String[] args) {
	
	Practice_Selenium_Exception_amazon obj= new Practice_Selenium_Exception_amazon();
	obj.get_salary();
	
	
	
	
}


}
