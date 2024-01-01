
package com.Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Get {
	
	public static void getdata() throws IOException {
     
		File f = new File("C:\\Users\\Pounkumar G\\eclipse-workspace\\Maven_Project\\datadriven\\Employee_Details.xlsx");
				
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int noofrows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < noofrows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();	
			
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				
				else if (cellType.equals(cellType.NUMERIC)) {
			   double value =  cell.getNumericCellValue();
			   int num = (int)value;
			   System.out.println(num);
				}
				
			}
		}
		}
	public static void main(String[] args) throws IOException {
		getdata();
	}
		
	}


