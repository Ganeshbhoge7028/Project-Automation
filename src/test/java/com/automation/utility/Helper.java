package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static void CaptureScreenshote(WebDriver driver) {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Screenshote/NBF"+getcurrentdate()+"Login.png"));
		} catch (IOException e) {
			
			System.out.println("Unable to Take Screen Shote "+e.getMessage());
		}
		
	}
	public static String getcurrentdate() {
		
		DateFormat customtdate= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date date= new Date();
		return customtdate.format(date);
	}
}
