package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.forgotpasswordpage;

import cucumber.api.java.en.*;


public class Login {
	
	HeadersSection hs = new HeadersSection();
	LoginPage lp = new LoginPage();
	MyAccountPage mp = new MyAccountPage();
	forgotpasswordpage fpg = new forgotpasswordpage();
	
	
	@And("^I Navigate to Login page$")
    public void i_navigate_to_login_page()  {
		
		Elements.click( HeadersSection.myAccountlink);
		Elements.click( HeadersSection.Login);
        
    }
	
	  @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void i_enter_username_something_and_password_something(String email, String password)  {
		  
		  LoginPage.dologin(email, password);
	    }

	    @Then("^I should be login successfully$")
	    public void i_should_be_login_successfully()  {
	    	Assert.assertTrue(Elements.isDisplayed(MyAccountPage.Registerforanaffiliateaccount));
	    	}
	    @Then("^I should see an error message informing the user about invalid credentails$")
	    public void i_should_see_an_error_message_informing_the_user_about_invalid_credentails() {
	    	Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.InvalidDetails,"Warning: No match for E-Mail Address and/or Password."));
	        
	    }
	    @When("^i reset the forgotten password for email \"([^\"]*)\"$")
	    public void i_reset_the_forgotten_password_for_email_something(String email) {
	    	Elements.click(LoginPage.forgotpassword);
	    	Elements.TypeText(forgotpasswordpage.emailaddressfield,email);
	    	Elements.click(forgotpasswordpage.ContinueBTN);
	        
	    }

	    @Then("^i should see a message informing that the password reset detailshave been sent to email page$")
	    public void i_should_see_a_message_informing_that_the_password_reset_detailshave_been_sent_to_email_page()  {
	    	
	    	Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.InvalidDetailsalert,"An email with a confirmation link has been sent your email address."));
	       
	    }
	    

}
