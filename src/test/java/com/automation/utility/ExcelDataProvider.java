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
	public double getStringData(int sheetIndex, int row, int column) {
		return book.getSheetAt(sheetIndex).getRow(0).getCell(0).getNumericCellValue();
	}
	public String getStringData(String sheetname, int row, int column) {
		return book.getSheet(sheetname).getRow(0).getCell(0).getStringCellValue();
	}
	public double getNumericData(String sheetname, int row, int column) {
		return book.getSheet(sheetname).getRow(0).getCell(0).getNumericCellValue();
	}

}
