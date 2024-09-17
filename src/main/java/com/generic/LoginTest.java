package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pagefactory.MasterPageFactroy;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	MasterPageFactroy mpf;
	
public void getLogin() {
		
		 
		//Setting up browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();//Upcasting
		
		//Window maximize
		driver.manage().window().maximize();
		
		//Add URL for homepage
		//driver.navigate().to("https://automationexercise.com/");
		
		
		//Show how to add url with configfile
		driver.navigate().to(BaseConfig.getConfigValue("PROD_URL"));
			
		
		mpf= new MasterPageFactroy(driver);
		

		//Highlight signin_button_homepage
		Highlighter.addColor(driver, mpf.getSingin_button_homepage());
		//Click on Login_button
		mpf.getSingin_button_homepage().click();
		

		
		//Highlight email field
		Highlighter.addColor(driver, mpf.getEmail());
		//Enter email Id in email filed
		//mpf.getEmail().sendKeys("parthadebnathk@gmail.com");
		
		//Hiding emIL ID
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		
		//Highlight the password field 
		Highlighter.addColor(driver,mpf.getPassword());
		//Enter password in password field
		//mpf.getPassword().sendKeys("1234567");
		
		//Hiding password ID
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		
		
		
		
		
		//Highlight the login button 
		Highlighter.addColor(driver, mpf.getLogin_button());
		//Click on login button
		mpf.getLogin_button().click();
		
		
		
		
		//verify login successful
		if(mpf.getVerify_login_successfully().isDisplayed()) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login Failed");  
		}
			
		
		//Take screenshot
		Screenshot.getScreenShot(driver, "signin_button_homepage");
	  	
		
		//driver.quit();//browser close
		driver.close();
		
	}
}


