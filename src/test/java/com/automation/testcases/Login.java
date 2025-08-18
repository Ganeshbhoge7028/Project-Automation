package com.automation.testcases;


import org.openqa.selenium.support.PageFactory;

//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class Login extends BaseClass{



	@Test
public void LogintoApp() throws InterruptedException { 
        System.out.println(excel.getStringData("Login",0,0));
        System.out.println(excel.getStringData("Login",0,1));
	LoginPage loginPage =PageFactory.initElements( driver, LoginPage.class);

	loginPage.loginToAPP(excel.getStringData("Login",0,0),excel.getStringData("Login",0,1));
	
	
}
}
