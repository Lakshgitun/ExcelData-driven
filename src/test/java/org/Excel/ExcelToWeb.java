package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToWeb {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	File file = new File("C:\\New folder (2)\\XlWorksheet\\EXC\\RequirDat.xlsx"); 
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workBook = new XSSFWorkbook();
	
	Sheet sheet = workBook.getSheet("Sheet1");
	

	
		 Row row = sheet.getRow(i);
		 System.out.println(row);
		 
		 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			 
			 Cell cell = row.getCell(j);
			 
			 System.out.println(cell);
			
		}
		
	}

}

