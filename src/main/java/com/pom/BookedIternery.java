package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedIternery {
	
	public static WebDriver driver7;
	
	@FindBy(id = "check_all")
	private  WebElement clickorederid;
	
	@FindBy(name = "logout")
    private WebElement clicklogoutbutton;

	public BookedIternery(WebDriver driver) {
		 this.driver7=driver;
		 PageFactory.initElements(driver,this);
	}

	public WebElement getClickorederid() {
		return clickorederid;
	}

	public WebElement getClicklogoutbutton() {
		return clicklogoutbutton;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
