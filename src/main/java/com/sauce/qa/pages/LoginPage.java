package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	// Page Factory - Object Repos :
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name ="login-button")
	WebElement loginbtn; 
	
	@FindBy(xpath ="//div[contains(@class, 'login_logo')]")
	WebElement saucelogo;
	
	
	// Initializing page objects :
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
 
	public String validateLoginPgTitle() {
		 return driver.getTitle();
	}
	
	public boolean validateSauceLogo() {
		return saucelogo.isDisplayed();
	}
	
	public HomePage login(String un , String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	}

	/*public String validateLoginPgTitle() {
		// TODO Auto-generated method stub
		return null;*/
	

	
	
}
	
	
	

