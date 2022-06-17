package com.infosys.pages;

import org.openqa.selenium.By;

import com.infosys.base.TestBase;

public class LoginPage extends TestBase{

	//here I will write the code for this page
	
	public String getTitle() {
		System.out.println(5);
		return driver.getTitle();
		
	}
	
	public void validateLogin(String uname, String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
	}
}
