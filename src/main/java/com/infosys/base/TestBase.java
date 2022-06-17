package com.infosys.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	//here I will write the common code
	//required for all the classes
	//eg webdriver config
	
	public static WebDriver driver;
	
	public static void initialization() {
		System.out.println(2);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(3);
	}
	
	public static void tearDown() {
		System.out.println(7);
		driver.quit();
	}
	
}
