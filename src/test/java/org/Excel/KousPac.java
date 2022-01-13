package org.Excel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KousPac {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
List<WebElement> labels = driver.findElementsByTagName("label");

WebElement lastElement = labels.get(labels.size()-1);
System.out.println("LastElement "+lastElement.getText());

   int size=labels.size();
   if(size==6) {
	   
	   System.out.println("Test case Passed");
   }
	
   else System.out.println("failed");
	
	}		



}
