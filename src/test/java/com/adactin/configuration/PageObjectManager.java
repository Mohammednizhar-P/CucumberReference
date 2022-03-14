package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.pom.BookAHotel;
import com.pom.BookedIternery;
import com.pom.ConfirmPage;
import com.pom.LoginPage;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class PageObjectManager {
     
	public static WebDriver driver;
	
	
	private LoginPage l;
	
	private SearchHotel s;
	
	private SelectHotel h;
	
	private BookAHotel b;
	
	private ConfirmPage f;
	
	private  BookedIternery g;
	
	public PageObjectManager(WebDriver driver2) {
		 this.driver=driver2;
		 
	}

	public LoginPage getInstanceLoginPage() {
		l= new LoginPage(driver);
		return l;
	}
	public SearchHotel getInstanceSearchHotel() {
		s= new SearchHotel(driver);
		return s;
	}
	
	public SelectHotel getIntanceSelectHotel() {
		h=new SelectHotel(driver);
		return h;
	}
	
	public BookAHotel getInstanceBookAHotel() {
		
		b= new BookAHotel(driver);
		return b;
		
	}
	
	public ConfirmPage getInstanceConfirmPage() {
		
		f= new ConfirmPage(driver);
		
		return f;
		
	}
		
	public BookedIternery getInstanceBookIternery() {
		
		g= new BookedIternery(driver);
		
		return g; 
		
	}
	
	
	
	
	
	
}
