package com.pagefactory;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MasterPageFactroy {
	
	public MasterPageFactroy(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//i[@class='fa fa-lock']")
	private WebElement singin_button_homepage;
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;

	@FindBy(xpath="//*[text()='Login']")
	private WebElement login_button;
	
	@FindBy(xpath="//*[contains(text(),' Logout')]")
	private WebElement verify_login_successfully;
	
	
	
	
	
	
	
	//For hover in Costco service entity with action class
	@FindBy(xpath="//*[@id='Home_Ancillary_6']")
	private WebElement service;
	
	
	// For Dropdown menu with select 
	@FindBy(xpath="//*[@id='oldSelectMenu']")
	private WebElement dropdown;
	
	
	//For Alert
	@FindBy(xpath="//*[@id='confirmBox']")
	private WebElement alertbtn;

	
	
	
	
	
	
	@FindBy(xpath="")
	private WebElement Bottle_Water_Delivery;
	
	
	
	
	
	
	
	
		//Amazon Hover
		@FindBy(xpath="//*[@class='nav-line-2 ']")
		private WebElement Hello_Action;
	
	
	
		//Sign_in
		@FindBy(xpath="(//*[@class='nav-action-inner'])[1]")
		private WebElement Sign_in;
		
		
		
		public WebElement getSign_in() {
			return Sign_in;
		}

/*
		//order button click
		@FindBy(xpath="(//*[@class='nav-text'])[4]")
		private WebElement order_Action;
	
	
	
	*/
	
	

	public WebElement getHello_Action() {
			return Hello_Action;
		}


	public WebElement getAlertbtn() {
		return alertbtn;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getService() {
		return service;
	}

	public WebElement getVerify_login_successfully() {
		return verify_login_successfully;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSingin_button_homepage() {
		return singin_button_homepage;
	}
	

}
