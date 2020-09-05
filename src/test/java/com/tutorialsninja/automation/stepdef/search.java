package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.searchPage;

import cucumber.api.java.en.*;

public class search {
	
	searchPage search = new searchPage();
	
	 @When("^I search for a product \"([^\"]*)\"$")
	    public void i_search_for_a_product_something(String strArg1)  {
		 
		 Elements.TypeText(searchPage.searchbox,strArg1);
		 Elements.click(searchPage.clicksearchbutton);
	       
	    }

	    @Then("^I should see the product in the search resultsil address$")
	    public void i_should_see_the_product_in_the_search_resultsil_address() {
	    	
	   Assert.assertTrue(Elements.isDisplayed(searchPage.displayedsearchdetails));
	        
	    }

	   


	    @Then("^I should see the page displaying the message \"([^\"]*)\"$")
	    public void i_should_see_the_page_displaying_the_message_something(String arg1)  {
	    
	    	Assert.assertTrue(Elements.VerifyTextEquals(searchPage.noresultmessage,arg1));
	    }

}
