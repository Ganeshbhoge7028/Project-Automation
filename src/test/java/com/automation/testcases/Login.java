package com.automation.testcases;


import org.openqa.selenium.support.PageFactory;

//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class Login extends BaseClass{

	

	@Test
public void LogintoApp() {
	
	LoginPage loginPage=PageFactory.initElements( driver, LoginPage.class);

	loginPage.loginToAPP("ganesh@yopmail.com","Pass@1234");
	
}

}
