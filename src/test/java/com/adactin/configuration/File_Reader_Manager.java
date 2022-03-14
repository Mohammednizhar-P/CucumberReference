 package com.adactin.configuration;

import java.io.IOException;

public class File_Reader_Manager {
	
	    private File_Reader_Manager() {
		                                       // this is empty constructor for stop object creation in any other class 
		}
	
	
	  public static  File_Reader_Manager getInstance() {
		  
		  File_Reader_Manager helper = new File_Reader_Manager();
		  
		  return helper;
	 

	}
	
	
	 public Configuration_Reader getInstanceCR() throws IOException {
		 
		 Configuration_Reader con = new Configuration_Reader();
		 return con;
		 
		 
	 
	}
	
	
	
	
	
	
	
	
	
	
	

}
