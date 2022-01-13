
package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExWorkPract

{
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\New folder (2)\\XlWorksheet\\excel\\New Microsoft Excel Worksheet (2).xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				System.out.println(cell.getCellType());
			}
		}

//		Row row = sheet.getRow(10);
//
//		Cell cell = row.getCell(3);
//
//		System.out.println(cell);
//
//		int type = cell.getCellType();
//
//		if (type == 1) {
//
//			String data = cell.getStringCellValue();
//
//			System.out.println(data);
//
//		}
//		if (type == 0) {
//
//			double d = cell.getNumericCellValue();
//			long l = (long) d;
//			String data = String.valueOf(l);
//			System.out.println(data);
//
//		}

	}
}