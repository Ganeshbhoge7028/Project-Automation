package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utility.Browser;

public class BaseClass {

public WebDriver driver;
@BeforeClass
    public void setUp() {
		driver=Browser.LaunchBrowser(driver, "edge", "https://www.automationexercise.com/login");
	
	}

    @AfterClass
	public void tearDown() {
		Browser.closebrowser(driver);
	}
}
