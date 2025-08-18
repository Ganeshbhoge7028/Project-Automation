package com.automation.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver LaunchBrowser(WebDriver driver, String Browsername, String URL) {
		if(Browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

			 driver = new EdgeDriver();
			
		}else if(Browsername.equals("firefox")) { 
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
	}else {
		System.out.println("Please give Proper browser name");
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		return driver;
		
}
	public static void  closebrowser(WebDriver driver) {
		driver.quit();
	
}}