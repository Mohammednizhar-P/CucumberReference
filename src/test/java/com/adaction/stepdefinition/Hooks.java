package com.adaction.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass {
	
	
	 @Before
	 public void beforeHooks(Scenario scene ) {
	 
	String name = scene.getName();	
	System.out.println("scenario name :"+name);
		 

	}
	@After
	 public void afterHooks(Scenario scene1 ) throws Throwable {
		 
		  Status status = scene1.getStatus();
		  System.out.println("scenario status:"+status);
	
		
		if (scene1.isFailed()) {
			
			screenShot("C:\\Users\\hp\\eclipse-workspace\\cucumber-project\\ScreenShot\\bug.png");
			
		}
		
		
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	

}
