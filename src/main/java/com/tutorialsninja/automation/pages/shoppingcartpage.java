package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class shoppingcartpage {
	
	public shoppingcartpage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(linkText="Checkout")
	public static WebElement checkoutbtn;
	
	public static void navigatetocheckoutpage() {
		Elements.click(shoppingcartpage.checkoutbtn);
	}

}
