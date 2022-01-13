package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExJava {
	
	public static void main(String[] args) throws IOException {
		 File file=new File("C:\\New folder (2)\\XlWorksheet\\EXC\\RequirDat.xlsx");
		 
		 FileInputStream stream = new FileInputStream(file);
		 
		 XSSFWorkbook workbook=new XSSFWorkbook(stream);
		 
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 int lastRowNum = sheet.getLastRowNum();
		 
		 int lastCellNum = sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<lastRowNum;i++) {
			 XSSFRow row = sheet.getRow(i);
			 
			 for(int j=0;j<lastCellNum;j++) {
				 String cell = row.getCell(j).toString();
				 
				 System.out.print("   "+cell);
				 
 
			 }
			 System.out.println("    ");
			 

		 }
		 
		 
		 
		 
		 
		 
		 
		
	}

}
