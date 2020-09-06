package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.checkoutpage;
import com.tutorialsninja.automation.pages.ordersuccesspage;
import com.tutorialsninja.automation.pages.searchPage;
import com.tutorialsninja.automation.pages.shoppingcartpage;

import cucumber.api.java.en.*;

public class Orders {
	
	HeadersSection hs = new HeadersSection();
	LoginPage lp = new LoginPage();
	searchPage sp = new searchPage();
	shoppingcartpage scp = new shoppingcartpage();
	checkoutpage cop = new checkoutpage();
	ordersuccesspage osp = new ordersuccesspage();
	
	@Given("^I login to the application$")
    public void i_login_to_the_application()  {
		
		Browser.OpenApplication();
		HeadersSection.navigatetologinpage();
		LoginPage.dologin();
        
    }

    @When("^I add any product to Bag and checkout$")
    public void i_add_any_product_to_bag_and_checkout()  {
    	searchPage.searchproduct();
    	searchPage.addfirstproduct();
    	HeadersSection.navigatetoshoppingcartpage();
    	shoppingcartpage.navigatetocheckoutpage();
    	
    	
    	
    	
    }
    
    @And("^I place an order$")
    public void i_place_an_order() {
    	
    	checkoutpage.billingdetails();
    }

    @Then("^I should see that the order is placed successfully$")
    public void i_should_see_that_the_order_is_placed_successfully() {
    	
    	Waits.waitUntilElementLocated(10, ordersuccesspage.successBreadCrumb);
    	
    	Assert.assertTrue(Elements.isDisplayed(ordersuccesspage.successBreadCrumb));
       
    }

   

}
