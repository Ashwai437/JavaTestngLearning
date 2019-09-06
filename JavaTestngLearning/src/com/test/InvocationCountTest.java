package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=5) // for executing same test case multiple time.
	public void sum() 
	{
		int a=20;
		int b=20;
		int c=a+b;	
		
		System.out.println("sum is--"+ c);
		
		
	}
	
}
