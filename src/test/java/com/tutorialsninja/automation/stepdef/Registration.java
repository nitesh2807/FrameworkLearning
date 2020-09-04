package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I Navigate to Account registration page$")
	public void i_Navigate_to_Account_registration_page()  {
	   
	}

	@When("^I fill all the below valid details$")
	public void i_fill_all_the_below_valid_details(DataTable arg1)  {
	   
	}

	@And("^Select Yes on Subscribe$")
	public void select_Yes_on_Subscribe()  {
	    
	}

	@And("^I Select on Privacy Policy$")
	public void i_Select_on_Privacy_Policy()  {
	    
	}

	@And("^I click on continue$")
	public void i_click_on_continue() {
	    
	}

	@Then("^I should see user account has successfully created$")
	public void i_should_see_user_account_has_successfully_created()  {
	    
	}

}
