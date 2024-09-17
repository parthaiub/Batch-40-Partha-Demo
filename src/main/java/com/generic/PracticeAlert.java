package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactroy;


import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {
	public void getAlert() {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	MasterPageFactroy mpf =new MasterPageFactroy(driver);
	
	
	
	mpf.getAlertbtn().click();
	Alert alert =driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
	alert.accept();
	
	}
	
	public static void main(String[] args) {
		PracticeAlert obj =new PracticeAlert();
		obj.getAlert();
	}
}