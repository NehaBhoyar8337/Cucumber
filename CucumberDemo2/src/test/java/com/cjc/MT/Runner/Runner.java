package com.cjc.MT.Runner;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src//test//resources//Features"},glue={"com.cjc.MT.step"}, tags={"@Test1,@Test2"},format= {"pretty","html:target/Destination"})
public class Runner
{

	
}