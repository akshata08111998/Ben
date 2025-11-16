package com.testNG.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayNo1 {

	@Test
	public void Demo()
	{
		System.out.println("hello");// TODO Auto-generated method stub

	}
	@Test
	public void SecondRun()
	{
		System.out.println("bye");// TODO Auto-generated method stub

	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("Iam First in Test");// TODO Auto-generated method stub

	}
	@AfterTest
	public void LastExecution()
	{
		System.out.println("Iam Last in Test");// TODO Auto-generated method stub

	}
	
	@BeforeSuite
	public void Firstrun()
	{
		System.out.println("Iam First in Suite");
	}
	@AfterSuite
	public void Lastrun()
	{
		System.out.println("Iam Last in Suite");
	}
	@BeforeMethod
	public void FirstruninMethod()
	{
		System.out.println("Iam First in Method");
	}
	@AfterMethod
	public void LastruninMethod()
	{
		System.out.println("Iam Last in Method");
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
