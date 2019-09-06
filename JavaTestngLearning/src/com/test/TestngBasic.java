package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasic {
	
	// precondotion anotation -- ststring with Before
	@BeforeSuite   // 1.
	public void setup() {
		
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest    //2 
	public void launchbrowser() {
     System.out.println("launch chrome Browser ");		
	}
	
	
	@BeforeClass    // 3
	public void login() 
	{
		System.out.println("login method ");
	}

	
	
	@BeforeMethod // 4
	
	public void enterUrl() {
		
		System.out.println("enter url");
	}
	
	
	


	// test case --- stsrting with test
	@Test  // 5
	public void googletitleTest() {
		
		System.out.println("google title test");
	}

	
	
	// post condition -- stsrting with @After
	@AfterMethod  //6 
	public void logout () {
		System.out.println("logout method ");
	}
	
	@AfterClass // 7
	public void classBrowser() {
		System.out.println("Class Browser");
	
}
	
	
	
	@AfterTest //8
	public void deleteALLcockies() {
		System.out.println("delete all coockei");
	}
	
	
	
	
//	@AfterSuite // 9
//	public void generateTestReport() {
//		
//		System.out.println("generateTestReport");
//	}
	
}

/*setup system property for chrome
launch chrome Browser 
login method 
enter url
google title test
logout method 
Class Browser
delete all coockei*/

