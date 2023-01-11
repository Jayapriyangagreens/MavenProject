package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverPriya {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Maven\\worksheet\\priya.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(inputStream);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		
	
		
		
		
		
		
		
		
		
	}

}
