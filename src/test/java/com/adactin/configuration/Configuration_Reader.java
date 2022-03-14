package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
	
	public Configuration_Reader() throws IOException {
		
		File f = new File( "C:\\Users\\hp\\eclipse-workspace\\cucumber-project\\src\\test\\java\\com\\adactin\\configuration\\Adactin.properties");

		FileInputStream in = new FileInputStream(f);  // for initialization

		p = new Properties();
		p.load(in);

	}


    public String browser() {
    	
    	String property = p.getProperty("browser");
    	return property;
		 
	}


   public String url() {
	   String property = p.getProperty("url");
	 return property;
   }

   public String username() {
	 
    String property = p.getProperty("username");
    return property;
}


   public String password() {
	   String property = p.getProperty("password");
	   return property;
	 

}



















}
