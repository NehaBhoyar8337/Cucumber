package com.cjc.MT.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	static WebDriver driver;

	
	@When("^user open the \"([^\"]*)\" browser$")
	  public void openBrwoser(String
	  browsername) 
	{ 
		if(browsername.equalsIgnoreCase("chrome")) 
		{
	  System.out.println("Chrome Browser");
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Testing Selenium\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	  
	  } 
		else { System.out.println("IE"); }
	  
	  }
	  
	@When("^user enter application url \"([^\"]*)\"$")
	  public void enterUrl(String
	  url) 
	  { driver.get(url); System.out.println("Enter Url Success"); }
	  
		
	@When("^enter username as \"([^\"]*)\"$")
		  public void enterusername(String
		  uname) 
		  { System.out.println("Uname value"+uname);
		  driver.findElement(By.xpath(
		  "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"
		  )).sendKeys(uname); 
		  System.out.println("Enter User Name");
		  }
		  
	@When("^enter password as \"([^\"]*)\"$")
		  public void enterpass(String pass) {
		  driver.findElement(By.name("password")).sendKeys(pass);
		  System.out.println("Enter Password"); 
		  }
		  
	@Then("^we get sucess page$")
		  public void entersubmit() {
		  driver.findElement(By.name("submit")).click();
		  System.out.println("Enter Submit Button and get Success");
		  }
		  
		  
		 

}
