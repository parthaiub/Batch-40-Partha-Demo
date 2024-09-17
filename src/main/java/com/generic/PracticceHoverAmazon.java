package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticceHoverAmazon {
	
	public void getHover() {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com");
		
		
		WebElement Hello_Action= driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions ac= new Actions(driver);
		ac.moveToElement(Hello_Action).perform();
		
	
	
		
	}
	
	public static void main(String[] args) {
		
		PracticceHoverAmazon obj =new PracticceHoverAmazon();
		obj.getHover();
		
	}
	
}
