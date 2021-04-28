package com.cjc.MT.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks 
{

	@Before
	public void beforeMetod()
	{
		System.out.println("Before Cucumber Method");
	}
	@After
	public void afterMethod()
	{
		System.out.println("After Cucumber Method");
	}
	
}
