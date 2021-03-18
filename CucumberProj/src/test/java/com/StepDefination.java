package com;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver dr;
	@Before
	public void setup() {
	System.out.println("lunch the browser");	
	}
	@After
	public void quit() {
		System.out.println("quit");
		
	}
	@Before("@prodnew")
	public void setupproduction() {
	System.out.println(" lunch prodution");	
	}
	@After("@prodnew")
	public void quitproduction() {
		System.out.println("lunch quit");
		
	}
	
	@Given("^user able to navigates to facebook$")
	public void user_able_to_navigates_to_facebook() throws Throwable {
	   System.out.println("@Given-- user able to navigates to facebook");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
	  System.out.println("@When--user validates the homepage title");  
	}

	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_valid_username(String username) throws Throwable {
	   System.out.println("@Then--user entered the "+username+"username");
	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void user_entered_valid_password(String password) throws Throwable {
	  System.out.println("@Then--user entered the "+password+"password"); 
	}
	@Then("^user select the age category$")
	public void user_select_the_age_category(DataTable table) throws Throwable {
	    
	    List<Map<String,String>>data=table.asMaps(String.class, String.class);
	    System.out.println("select age is"+data.get(0).get("age")+"Location is"+data.get(0).get("location"));
	}
	@Then("^user \"([^\"]*)\" succesfully login$")
	public void user_shouldbe_succesfully_login(String validlogin) throws Throwable {
	    System.out.println("@Then--user "+validlogin+" succesfully login");
	}


}
