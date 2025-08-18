package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.Browser;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite
	public void SetupSuite() {
		excel = new ExcelDataProvider();
		config= new ConfigDataProvider();

	}

	@BeforeClass
	public void setUp() {
		driver = Browser.LaunchBrowser(driver, config.getBrowser(), config.getStageURL());

	}

	@AfterClass
	public void tearDown() {
		Browser.closebrowser(driver);
	}
	@AfterMethod
	public void MethodTearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Helper.CaptureScreenshote(driver);
		}
		
	}
}
