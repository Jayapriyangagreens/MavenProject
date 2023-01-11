package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LaunchDataDriver {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Maven\\worksheet\\priya.xlsx");

		FileInputStream inputSream = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(inputSream);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				String stringCellValue = cell.getStringCellValue();
				System.out.print(stringCellValue+"\t");
				
			}
			
			System.out.println();
			
			
			
			
			
		}
		
		
		
		
	}

}
