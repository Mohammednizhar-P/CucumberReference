package com.adaction.runner;

import java.io.IOException;
import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.configuration.File_Reader_Manager;
import com.baseclass.BaseClass; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

   @RunWith(Cucumber.class)
   @CucumberOptions(features = "src\\test\\java\\com\\adaction\\feature",
   glue ="com\\adaction\\stepdefinition",dryRun =false ,  
   plugin ={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","html:Report/WebReport.html",
		   "json:Report/jsonreport.json","junit:Report/xmlreport.xml "},monochrome = true,tags = "@functionality" )
   
   
public class RunnerClass {

	public  static WebDriver driver;

	@BeforeClass
	public static  void SetUp() throws IOException {
		
		//driver=	BaseClass.getBrowsers("chrome");
		
      String browser = File_Reader_Manager.getInstance().getInstanceCR().browser();
      driver=   BaseClass.getBrowsers(browser);  // using file reader manager
       
	}
  
	@AfterClass
	public static void closebroser() {
		driver.quit();
	  //BaseClass.quit(); //quit using extends of base class
	}
		 
	
	
}
