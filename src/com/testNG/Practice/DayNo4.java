package com.testNG.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DayNo4 {
		@Parameters({"URL","Key"})
		@Test
		public void WebLoginHomeLoan(String urlname, String key)
		{
			System.out.println("WebLoginHomeLoan-Selenium"+urlname);
			System.out.println("WebLoginHomeLoan-Selenium"+key);
		}
		@Parameters({"URL"})
		@Test(groups= {"Smoke"})
		public void MobileLoginHomeLoan(String urlname)
		{
			System.out.println("MobileLoginHomeLoan-Appium"+urlname);
		}
		@Test(enabled=false)
		public void ApILoginHomeLoan()
		{
			System.out.println("ApILoginHomeLoan-RestAPI");
		}
		
		@Test(dataProvider="getData")
		public void PrintData(String username, String Password)
		{
			System.out.println(username);
			System.out.println(Password);
		}
		@DataProvider
		public Object getData()
		{
			Object[][] data=new Object[3][2];
			//1st set
			data[0][0]="Arun";
			data[0][1]="Arun@123";
			//2nd set
			data[1][0]="Kavya";
			data[1][1]="Kavya@123";
			//23rd set
			data[2][0]="Raksh";
			data[2][1]="Raksh@123";
			return data; 
		}
		
		

	}
