package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {
	public static WebDriver driver6;
	
@FindBy(id = "my_itinerary")
private WebElement iternaryButton;

public ConfirmPage(WebDriver driver) {
	this.driver6=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getIternaryButton() {
	return iternaryButton;
}
}
