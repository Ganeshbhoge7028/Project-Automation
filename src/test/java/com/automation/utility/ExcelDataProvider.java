package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook book;
	public ExcelDataProvider() {
		
		File src =new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			book = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to Read Excel File"+e.getMessage());
		} 
		 
		
	}

}
