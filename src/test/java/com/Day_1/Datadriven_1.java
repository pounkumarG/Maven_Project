package com.Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_1 {
	
	public static void main(String[] args) throws IOException {
		
		File f =new File(".\\datadriven\\Employee_Details.xlsx");
		FileInputStream ff= new FileInputStream(f);
		Workbook dr = new XSSFWorkbook(ff);
		
		Sheet at = dr.getSheetAt(0);
		
		Row rw = at.getRow(3);
		
		Cell cl = rw.getCell(2);
		
		CellType type = cl.getCellType();
		
		if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = cl.getNumericCellValue();
			System.out.println(numericCellValue);
		}	
	}
}
