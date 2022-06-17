package com.infosys.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.infosys.base.TestBase;
import com.infosys.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	LoginPage lp;
	
	//here we will write the test cases
	
	@BeforeMethod
	public void setUp() {
		System.out.println(1);
		initialization();
		lp = new LoginPage();
	}
	
	@Test
	public void validateTitleTest() {
		System.out.println(4);
		String expTitle = "OrangeHRM India";
		String actTitle = lp.getTitle();
		Assert.assertEquals(expTitle, actTitle);
		
	}
	
	@Test
	public void validateLoginTest() {
		lp.validateLogin("Admin", "admin123");
		
	}
	
	@AfterMethod
	public void closeSetUp() {
		System.out.println(6);
		tearDown();
	}
}
