package org.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public static WebDriver driver;
	
public WebDriver getDriver() {

	
	WebDriverManager.chromedriver().setup();
	
	 driver=new ChromeDriver();
	
  return driver;

}

 // private void clkBtn(WebElement ref) {
   //ref.click();

}
  
 

}
	

}
