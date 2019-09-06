package com.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{

	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver.exe");

		 driver=new ChromeDriver();
		
	driver.manage().window().maximize();  // for window maxmize
	driver.manage().deleteAllCookies();  // for delete all cookies
	
	// Dynamic wait
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com");
	}

	
	
	@Test(priority=2,groups="Title")
	
	public void googletitleTest() 
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
	@Test(priority=1,groups="Test")
	public void test() 
	{
		System.out.println("test");
	}
	
	
	@Test(priority=3,groups="Test")
	public void test1() 
	{
		System.out.println("test1");
	}
	
	
	@Test(priority=4,groups="Test")
	public void test3() 
	{
		System.out.println("test3");
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
	
	
		



}




