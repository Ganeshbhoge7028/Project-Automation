package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
    Properties pro;
	public ConfigDataProvider() {
		
		File src =new File("./Config/Config.Properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not Able To Load Data"+e.getMessage());
		}
		
	}
	public String getdatafromConfig(String Key) {
		return pro.getProperty(Key);
	}
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getStageURL() {
		return pro.getProperty("AppURL");
	}
}

