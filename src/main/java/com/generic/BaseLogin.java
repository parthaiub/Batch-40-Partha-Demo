package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {
	
	
	public void getLogin() {
		
		
		
		//Setting up browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();//Upcasting
		
		//Window maximize
		driver.manage().window().maximize();
		
		//Add URL for homepage
		driver.navigate().to("https://automationexercise.com/");
		
		
		//Click on Login_button 
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		
		
		//Enter email Id in email filed
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("parthadebnathk@gmail.com");
		
		
		
		//Enter password in password field
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1234567");
		
		
		//Click on login button
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		
		//verify login successful
		if(driver.findElement(By.xpath("//*[contains(text(),' Logout')]")).isDisplayed()) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login Failed");
		}
			
		//driver.quit();//browser close
		driver.close();
		
	}
}
