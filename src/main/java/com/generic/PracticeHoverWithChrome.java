 package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactroy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeHoverWithChrome {
	
	
	public void getHover() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

	driver.navigate().to("https://www.costco.com");
		
	MasterPageFactroy mpf = new MasterPageFactroy(driver);
	
	
	// Create an object of the action class
	Actions ac = new Actions(driver);
	ac.moveToElement(mpf.getService()).perform();
	
	}
	
public static void main(String[] args) {
	
	PracticeHoverWithChrome obj = new PracticeHoverWithChrome();
	obj.getHover();
	
}

}


