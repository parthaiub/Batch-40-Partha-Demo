package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactroy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumExpection {
	
	
	public void getSalary() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com");
		
		
		//Add implicitly wait time 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		MasterPageFactroy mpf= new MasterPageFactroy(driver);
		
		//Create objective for action classs
		
		Actions ac =new Actions(driver);
		ac.moveToElement(mpf.getService()).perform();
		
		
		//Click on "Bottles Water Delivery" open/link
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		PracticeSeleniumExpection obj= new PracticeSeleniumExpection();
		obj.getSalary();
		
	}
	
	
	

}
