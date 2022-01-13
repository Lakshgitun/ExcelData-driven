package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrivenPrac {
	
	static WebDriver driver;

	@BeforeClass
	public void setup()	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	

	@Test(dataProvider="Logindata")
	public void loginTest(String user,String pass,String exp)
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	
		WebElement usrName = driver.findElement(By.id("Email"));
		usrName.clear();
		usrName.sendKeys("user");
		
		WebElement usrPass = driver.findElement(By.id("Password"));
		usrPass.clear();
		usrPass.sendKeys("pass");
		driver.findElement(By.className("//button[@class=\"button-1 login-button\"]")).click();
		
		String exp_Title="Dashboard / nopCommerce administration";
		String act_Title=driver.getTitle();
		
		if(exp.equals("valid"))
		{
		if(exp_Title.equals(act_Title))
		{
			driver.findElement(By.linkText("Logout")).click();

		Assert.assertTrue(true);
		}
		else
		{		Assert.assertTrue(false);
		}
		
		}
		else if(exp.equals("invalid")) {
			if (exp_Title.equals(act_Title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);

			}
			else
			{
				Assert.assertTrue(true);

			}
		}
		}
	   
	@DataProvider(name="Logindata")
	public String[][] getData() {
		
		String loginData[][]= { 
				                  {"admin@yourstore.com","admin","Valid"},
				                  {"adm@yourstore.com","admin","Invalid"},
			                      {"admin@yourstore.com","adm","Invalid"}
				               };
		
        return loginData;
	}
	



@AfterClass
public void tearDown() {
	//driver.close();
	
}
}













