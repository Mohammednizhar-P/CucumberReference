package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	 
	public static WebDriver driver4;
	
	
	@FindBy(xpath = "//input[@name='radiobutton_0']" )
	private WebElement selecthotel;
	
	@FindBy(name = "continue")
	private WebElement clickcontinuebutton;

	public SelectHotel(WebDriver driver) {
		 this.driver4=driver;
		 PageFactory.initElements(driver,this);
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getClickcontinuebutton() {
		return clickcontinuebutton;
	}
	
	
	

}
