package org.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositeCalculator {
	
	public static void main(String[] args) throws IOException {
	
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=tru");
		
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\New folder (2)\\XlWorksheet\\EXC\\Latest.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheetAt(1);
				
		int lastRowNum = sheet.getLastRowNum();
		
		for(int i=1;i<=lastRowNum;i++) {
			 XSSFRow cllectedRow = sheet.getRow(i);
			 
			 int princ = (int) cllectedRow.getCell(0).getNumericCellValue();
			 
			 int rateOfInterest=(int)cllectedRow.getCell(1).getNumericCellValue();
			 
			 int priodsYar=(int)cllectedRow.getCell(2).getNumericCellValue();
			 
			 String freq=cllectedRow.getCell(3).getStringCellValue();
			 
			 int exp_val=(int)cllectedRow.getCell(4).getNumericCellValue();
			 
			 driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			 driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateOfInterest));
			 driver.findElement(By.id("tenure")).sendKeys(String.valueOf(priodsYar));
			 
			 Select select=new Select(driver.findElement(By.id("tenurePeriod")));
			 select.selectByVisibleText("year(s)");
			 
			 Select select1=new Select(driver.findElement(By.id("frequency")));
			 select1.selectByVisibleText(freq);
			 
			 driver.findElement(By.xpath("//form[@id=\'fdMatVal\']/div[2]/a[1]/img")).click();
			 
			String actual_val= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(actual_val)== exp_val) 
			{
				System.out.println("Test case passed");
			}
			else
			{
				System.out.println("Test case failed");
			}
			driver.findElement(By.xpath("//form[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		    }
			
			driver.close();
			driver.quit();
			 
			
			 
			 
		  }
		
			
          }

