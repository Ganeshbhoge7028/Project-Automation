package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		
	}
	
	@FindBy(xpath="//input[@type='email']")WebElement email;
	
	@FindBy(name ="password")WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")WebElement login;
	
	public void loginToAPP(String EmailAddress, String Passwordapp) {
		
		email.sendKeys(EmailAddress);
		password.sendKeys(Passwordapp);
		login.click();
	}
			
			
			
	
}
