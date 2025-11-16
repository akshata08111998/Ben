package com.testNG.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DayNo3 {
	@Test(groups= {"Smoke"})
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan-Selenium");
	}
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan-Appium");
	}
	@Test(dependsOnMethods= {"MobileLoginCarLoan"})
	public void ApILoginCarLoan()
	{
		System.out.println("ApILoginCarLoan-RestAPI");
	}
	
	
	@BeforeClass
	public void befoClass()
	{
		System.out.println("before executing any methods in class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after executing any methods in class");
	}

}
