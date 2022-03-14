package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver1;
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id ="room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement numberofrooms;
	
	@FindBy(xpath = "(//input[@class='date_pick'])[1]")
	private WebElement checkindate;
	
	
	@FindBy(xpath = "(//input[@class='date_pick'])[2]")
	private  WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultsperroom;
	
	
	@FindBy(id = "child_room")
    private WebElement childrenperroom;
	
	@FindBy(id = "Submit")
	private WebElement clicksearchbutton;

	public SearchHotel(WebDriver driver) {
		 this.driver1=driver;
		 PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getClicksearchbutton() {
		return clicksearchbutton;
	}
	
	
	
	
	
	
	
	
	
	

}
