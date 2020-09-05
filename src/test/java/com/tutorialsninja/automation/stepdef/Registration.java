package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	 HeadersSection hs = new HeadersSection();
	 RegisterPage rp = new RegisterPage();
	 AccountSuccessPage asp = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I Navigate to Account registration page$")
	public void i_Navigate_to_Account_registration_page()  {
		Elements.click( HeadersSection.myAccountlink);
		Elements.click( HeadersSection.register);
	   
	}

	@When("^I fill all the below valid details$")
	public void i_fill_all_the_below_valid_details(DataTable datatable) {
		
		RegisterPage.enteralldetails(datatable,"unique");
	
	
	
	   
	}

	@And("^Select Yes on Subscribe$")
	public void select_Yes_on_Subscribe()  {
		Elements.click(RegisterPage.subscribe);
	    
	}

	@And("^I Select on Privacy Policy$")
	public void i_Select_on_Privacy_Policy()  {
		
		Elements.click(RegisterPage.privacypolicy);
	    
	}

	@And("^I click on continue$")
	public void i_click_on_continue() {
		
		Elements.click(RegisterPage.Continue);
	    
	}

	@Then("^I should see user account has successfully created$")
	public void i_should_see_user_account_has_successfully_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.success));
	}
	 @Then("^user account is not created$")
	    public void user_account_is_not_created() {
		 
		 Assert.assertTrue(Elements.isDisplayed(RegisterPage.register));
	     
	    }

	    @And("^i should see the error message informing the user to fill mandatory fields$")
	    public void i_should_see_the_error_message_informing_the_user_to_fill_mandatory_fields()  {
	    	
	    	Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstnamewarning));
	    	Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastnamewarning));
	     	Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailwarning));
	     	Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephonewarning));
	     	Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordwarning));
	     	Assert.assertTrue(Elements.isDisplayed(RegisterPage.privacypolicywarning));
	        
	    }
	    
	    @When("^I fill all the below duplicate details$")
	    public void i_fill_all_the_below_duplicate_details(DataTable datatable)  {
	    	RegisterPage.enteralldetails(datatable,"duplicate");
	        
	    }
	    @Then("^I should see user is restricted from creating duplicate account$")
	    public void i_should_see_user_is_restricted_from_creating_duplicate_account()  {
	    	
	    	Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainwarning, "Warning: E-Mail Address is already registered!"));
	  
	    }


}
