package com.generic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactroy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeHover {
	
	
	public void getHover() {
		
		
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.costco.com");
	
	
/*	
WebElement service=	driver.findElement(By.xpath("//*[@id='Home_Ancillary_6']"));
Actions ac= new Actions(driver);
ac.moveToElement(service).perform();
	*/

	
	MasterPageFactroy mpf= new MasterPageFactroy(driver);
	
	
	Actions ac= new Actions(driver);
	ac.moveToElement(mpf.getService()).perform();
	
	
	}
	public static void main(String[] args) {
		PracticeHover obj= new PracticeHover();
		obj.getHover();
		
	}

}
