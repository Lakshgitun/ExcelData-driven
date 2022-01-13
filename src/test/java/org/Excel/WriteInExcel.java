package org.Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
   public static void main(String[] args) throws IOException {
	

	
	File file=new File("C:\\New folder (2)\\XlWorksheet\\excel\\New Microsoft Excel Worksheet (2).xlsx");
	
	Workbook workbook=new XSSFWorkbook();
	
	Sheet sheet=workbook.createSheet("Laks");
	
	Row row = sheet.createRow(0);
	
	Cell cell = row.createCell(0);
	
	cell.setCellValue("Javaa");
	
	FileOutputStream o=new FileOutputStream(file);
	
	
	workbook.write(o);
	
	
   }	
	
	
	

}

