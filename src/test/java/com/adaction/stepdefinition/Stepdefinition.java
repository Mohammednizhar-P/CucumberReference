package com.adaction.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.PageObjectManager;
import com.adaction.runner.RunnerClass;
import com.baseclass.BaseClass;
import com.pom.BookAHotel;
import com.pom.BookedIternery;
import com.pom.ConfirmPage;
import com.pom.LoginPage;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefinition extends BaseClass {



	public static WebDriver driver=RunnerClass.driver;

	LoginPage l =      new LoginPage(driver);
	SearchHotel s=     new SearchHotel(driver);
	SelectHotel h =    new SelectHotel(driver);
	BookAHotel b =     new BookAHotel(driver);
	ConfirmPage f =    new ConfirmPage(driver);
	BookedIternery g = new BookedIternery(driver);

//	PageObjectManager pom = new PageObjectManager(driver);  
	 


    @Given("user launges the application")
	public void user_launges_the_application() throws IOException {
    	
		String url = File_Reader_Manager.getInstance().getInstanceCR().url(); // using file reader manager
		getUrl(url);

		//getUrl("https://adactinhotelapp.com/");  

	}

   /* @Given("user enter the valid username")
	public void user_enter_the_valid_username() throws IOException {

		sendKeys(l.getUsername(),"Technologiest");     // using page object model indivitual

		//	WebElement  ele = findElement("stringid","username");
		//sendKeys(ele,"Technologiest");                          // using normal extends base class

		//	sendKeys(pom.getInstanceLoginPage().getUsername(),"Technologiest");  // using page object manager
	}
	@Given("user enter the valid password")
	public void user_enter_the_valid_password() throws IOException {

		sendKeys(l.getPassword(),"J4G7D1");

		WebElement  password = findElement("stringname","password");
		sendKeys( password, "Nizhar@");   // normal extends base class

	}*/


	@Given("user enter {string} valid username")
	public void user_enter_valid_username(String string) throws IOException {
		sendKeys(l.getUsername(), string);  
		
	//	String username = File_Reader_Manager.getInstance().getInstanceCR().username();
	//	WebElement username2 = pom.getInstanceLoginPage().getUsername();   // using file reader manager
	 	 
	 //	sendKeys(username2, username);
		
		
	}                                                        // using scenario pass single datas
	@Given("user enter {string} the valid password")
	public void user_enter_the_valid_password(String string) {
		sendKeys(l.getPassword(), string);
	}


	@Given("user clicks the login button")
	public void user_clicks_the_login_button() {

		click(l.getLogin());

	//	WebElement click = findElement("stringid","login");
	//	click(click);


	}
	@SuppressWarnings("deprecation")
	@Then("user verifies the login is successfull")
	public void user_verifies_the_login_is_successfull() {
		String title = getTitle();
		System.out.println(title);

		Assert.assertEquals(title, title);




		if (title.equals("Adactin.com - Search Hotel")) {

			System.out.println("navigated to next page ");

		}else {
			System.out.println("navigation failed");
		}
	}
	 
	@Given("application launged success fully")
	public void application_launged_success_fully() {
		System.out.println("application launged successfully");
	}
	
	@When("user select the location")
	public void user_select_the_location() {

		select(s.getLocation(), "byindex","3");

	}
	@When("user select the hotels")
	public void user_select_the_hotels() {
		select(s.getHotels(),"byvisibletext","Hotel Sunshine");
	}
	@When("user select  the room type")
	public void user_select_the_room_type() {
		select(s.getRoomtype(),"byindex", "3");
	}
	@When("user select the num of rooms")
	public void user_select_the_num_of_rooms() {
		select(s.getNumberofrooms(),"byindex","5");
	}
	@When("user enter the check in date")
	public void user_enter_the_check_in_date() {
		sendKeys(s.getCheckindate(),"5/3/2022");
	}
	@When("user enter the check out date")
	public void user_enter_the_check_out_date() {
		sendKeys(s.getCheckoutdate(),"6/3/2022");
	}
	@When("user select the adults per room")
	public void user_select_the_adults_per_room() {
		select(s.getAdultsperroom(),"byindex","1");
	}
	@When("user select the children per room")
	public void user_select_the_children_per_room() {
		select(s.getChildrenperroom(), "byindex", "1");
	}
	@When("user click the search button")
	public void user_click_the_search_button() {
		click(s.getClicksearchbutton());
	}
	@Then("user verifies naviagte to next page")
	public void user_verifies_naviagte_to_next_page() {

		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl.equals("https://adactinhotelapp.com/SelectHotel.php")) {
			System.out.println("navigate to next page ");
		} else {
			System.out.println("navigation failed ");
		}

	}
	@Given("Application launged successfully")
	public void application_launged_successfully() {
		System.out.println("application launged successfully");
	}
	@When("user select the hotel")
	public void user_select_the_hotel() {
		click(h.getSelecthotel());

	}
	@When("user clicks the continue button")
	public void user_clicks_the_continue_button() {
		click(h.getClickcontinuebutton());
	}
	@Then("user verifies navigate to next page")
	public void user_verifies_navigate_to_next_page() {

		String currentUrl1 = getCurrentUrl();
		System.out.println(currentUrl1);


		if (currentUrl1.equals("https://adactinhotelapp.com/BookHotel.php")) {
			System.out.println("navigate to next page ");

		} else {

			System.out.println("not navigate to next page");
		}

	}

	@Given("application launged sucsessfully")
	public void application_launged_sucsessfully() {
		System.out.println("application launged successfully ");
	}
	@When("user enter the first name")
	public void user_enter_the_first_name() {
		sendKeys(b.getFirstname(),"mohammed"); 

	}
	@When("user enter the last name")
	public void user_enter_the_last_name() {
		sendKeys(b.getLastname(),"nizhar");
	}
	@When("user enter the billing address")
	public void user_enter_the_billing_address() {
		sendKeys(b.getBillingAddress(), "23,india street ,australia ");
	}
	@When("user enter the credit card number")
	public void user_enter_the_credit_card_number() {
		sendKeys(b.getCreditcardnumber(), "9876543210567890");
	}
	@When("user select the credit card type")
	public void user_select_the_credit_card_type() {
		select(b.getCreditcardtype(),"byindex","2");
	}
	@When("user select the expirary date")
	public void user_select_the_expirary_date() {
		select(b.getSelectmonth(),"byindex","6");
		select(b.getSelectyear(),"byindex","6");
	}
	@When("user enter the cvv number")
	public void user_enter_the_cvv_number() {
		sendKeys(b.getEntercvvnumber(),"345");
	}
	@When("user click  the book now button")
	public void user_click_the_book_now_button() {
		System.out.println( driver.getTitle());
		click(b.getClickbooknowbutton());

	}
	@Then("user verifies navigate to nextpage")
	public void user_verifies_navigate_to_nextpage() {

		String title1 = driver.getCurrentUrl();

		System.out.println(title1);


	}
	@Given("application launged")
	public void application_launged() {
		System.out.println("application launged");
	}
	@When("click my iternery button")
	public void click_my_iternery_button() {
		click(f.getIternaryButton());
	}
	@Then("verified next page")
	public void verified_next_page() {
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl.equals("https://adactinhotelapp.com/BookedItinerary.php")) {
			System.out.println("navigated successfully");
		} else {
			System.out.println("not navigated");
		}
	}

	@Given("launge successfully")
	public void launge_successfully() {
		System.out.println("luauged succesfully");
	}
	@When("clicks the order id")
	public void clicks_the_order_id() {
		click(g.getClickorederid());
	}
	@When("clicks order id")
	public void clicks_order_id() {
		click(g.getClicklogoutbutton());
	}
	@Then("user verifes successfully log out")
	public void user_verifes_successfully_log_out() {
		String currentUrl4 = getCurrentUrl();
		System.out.println(currentUrl4);
		if (currentUrl4.equals("https://adactinhotelapp.com/Logout.php")) {
			System.out.println("successfully logout ");
		} else {
			System.out.println(" not successfully log out");
		}
	}


}