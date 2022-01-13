package org.Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownToExcel {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement s=driver.findElement(By.id("skills"));
	
	Select select=new Select(s);
	
List<WebElement> options = select.getOptions();	

File file=new File("C:\\New folder (2)\\XlWorksheet\\excel\\New Microsoft Excel Worksheet (2).xlsx");

Workbook work=new XSSFWorkbook();

Sheet sheet=work.createSheet("Vallalar");

for(int i=0; i<options.size();i++) {
	
	Row createRow = sheet.createRow(i);
	
	Cell createCell = createRow.createCell(0);
	
	WebElement webElement = options.get(i);
	
	String text = webElement.getText();
	
	createCell.setCellValue(text);
	
	FileOutputStream file1=new FileOutputStream(file);
	
	
	System.out.println(file1);
	
}



	}

}
