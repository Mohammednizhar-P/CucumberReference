package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {


	public static WebDriver driver5;

	public BookAHotel(WebDriver driver) {
		this.driver5=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	public WebElement getEntercvvnumber() {
		return entercvvnumber;
	}

	public WebElement getClickbooknowbutton() {
		return clickbooknowbutton;
	}

	@FindBy(id = "first_name")
	private WebElement firstname;


	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(name = "address")
	private WebElement billingAddress;

	@FindBy(xpath = "(//input[@class='reg_input'])[3]")
	private WebElement creditcardnumber;

	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement creditcardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement selectmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement selectyear;

	@FindBy(id = "cc_cvv")
	private WebElement entercvvnumber;

	@FindBy(id = "book_now")
	private WebElement clickbooknowbutton;
}
