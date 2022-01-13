package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exsel {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\New folder (2)\\XlWorksheet\\EXC\\RequirDat.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(5);

		Cell cell = row.getCell(3);

	int count = sheet.getPhysicalNumberOfRows();
	//System.out.println(count);
		
       int count1 = row.getPhysicalNumberOfCells();		
      //System.out.println(count1);
      
      for(int i=0 ; i<row.getPhysicalNumberOfCells();i++) {
     	Cell cell2 = row.getCell(i);
      System.out.println(cell2);
   }
	   
	   for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
			Row row1 = sheet.getRow(i);
		//	System.out.println(row1);

	   
	   for(int j=0; j<row.getPhysicalNumberOfCells();j++) {
		  Cell cell1=row.getCell(j);
		// System.out.println(cell1);
		  
	   }
	   
	   int type=cell.getCellType();
	   if (type==1) {
		   String data = cell.getStringCellValue();
		   System.out.println(data);
	   }
	   if (type==0) {
		   double d=cell.getNumericCellValue();
		  long l = (long)d;
		  String data = String.valueOf(l);
		System.out.println(cell.getCellType());
				
		  
		   
		   
		   
	   }
	   }
}
	}


