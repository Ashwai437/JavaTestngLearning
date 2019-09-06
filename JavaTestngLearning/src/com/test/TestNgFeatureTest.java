package com.test;

import org.testng.annotations.Test;

public class TestNgFeatureTest {

	@Test
	public void logintest() 
	{
		System.out.println("logintest");
		//int i =9/0;
	}
	
	
	@Test(dependsOnMethods="logintest")
	public void Homepagetest() 
	{
		System.out.println("homepage test");
	}
	
	@Test
	public void searchtest() 
	{
		System.out.println("serrchtest");
	}
}
