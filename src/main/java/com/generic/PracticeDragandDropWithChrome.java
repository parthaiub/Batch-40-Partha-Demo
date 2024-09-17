package com.generic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class PracticeDragandDropWithChrome {
	

		
		public void getDragAndDrop() {
			
			//Set WebDriver
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			
			//Add URl Link
			driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
			
			//Drag and drop by action class
			
			WebElement columnA = driver.findElement(By.xpath("//*[@id='column-a']"));
			WebElement columnB = driver.findElement(By.xpath("//*[@id='column-b']"));
			
			
			//Create an object of the actions class
			Actions ac= new Actions(driver);
			
			ac.dragAndDrop(columnA, columnB).perform();
		}
		
		public static void main(String[] args) {
			PracticeDragandDropWithChrome obj =new PracticeDragandDropWithChrome ();
			obj.getDragAndDrop();
			
		}	
	}

