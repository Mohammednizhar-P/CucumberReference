@functionality
Feature: Hotel booking Functanality 


@outline  @login
Scenario Outline:    User want To login 

	Given user launges the application 
	And   user enter "<username>" valid username
	And   user enter "<password>" the valid password 
	And   user clicks the login button 
	Then  user verifies the login is successfull
	
	Examples:
	|username|password|
	|nizhar|1234|
	|love|143|
	|yu|143|
	
  @Login
Scenario: User want To login 

	Given user launges the application 
	And   user enter "Technologiest" valid username
	And   user enter "J4G7D1" the valid password 
	And   user clicks the login button 
	Then  user verifies the login is successfull 
@search
Scenario: search hotel 
	Given application launged success fully 
	When   user select the location 
	And    user select the hotels 
	And    user select  the room type 
	And    user select the num of rooms 
	And    user enter the check in date 
	And    user enter the check out date 
	And    user select the adults per room 
	And    user select the children per room 
	And    user click the search button 
	Then   user verifies naviagte to next page 
 
Scenario: user want to select hotel 
	Given Application launged successfully 
	When user select the hotel 
	And user clicks the continue button 
	Then  user verifies navigate to next page 
	
Scenario: user want to book a hotel 
	Given application launged sucsessfully 
	When  user enter the first name 
	And user enter the last name 
	And user enter the billing address 
	And user enter the credit card number 
	And  user select the credit card type 
	And user select the expirary date 
	And user enter the cvv number 
	And user click  the book now button 
	Then user verifies navigate to nextpage 
	
 Scenario:  booking confirmation
     Given application launged
     When  click my iternery button
     Then  verified next page
     
     Scenario: user book iternery
         Given  launge successfully
         When   clicks the order id
         And  clicks order id
         Then  user verifes successfully log out
     