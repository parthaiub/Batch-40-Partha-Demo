package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.MasterPageFactroy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropDown {
	public void getDropDown() {
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/select-menu");
		
		MasterPageFactroy mpf =new MasterPageFactroy(driver);
		
		
		//For the old style menu dropdown select the option white 
		Select sc= new Select(mpf.getDropdown());
		
		
		//select by visible text
		sc.selectByVisibleText("White");
		
		
		//select yellow by the index
		sc.selectByIndex(3);
		
		//slelect blue by value
		sc.selectByValue("1");
		
	}
	
	public static void main(String[] args) {
		PracticeDropDown obj= new PracticeDropDown();
		obj.getDropDown();
	}

}
