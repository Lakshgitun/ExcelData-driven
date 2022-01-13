package org.Excel;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseToday {
	public static void main(String[] args) {
		public static wedriver driver;
		public WebDriver Chrome() {
			WebDriverManager.chromedriver().browserVersion("94").setup();
			driver = new ChromeDriver();
			return driver;
		}
	}

}
