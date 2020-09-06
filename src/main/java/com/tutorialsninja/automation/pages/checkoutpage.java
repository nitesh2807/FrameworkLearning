package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class checkoutpage {
	
	public checkoutpage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	/*@FindBy(id="input-payment-firstname")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	public static WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	public static WebElement address;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	public static WebElement city;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	public static WebElement country;
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
	public static WebElement state;*/
	
	@FindBy(id="button-payment-address")
	public static WebElement continuebtn;
	
	@FindBy(id="button-shipping-address")
	public static WebElement shippingcontinuebtn;
	
	@FindBy(id="button-shipping-method")
	public static WebElement shippingmethodbtn;
	
	@FindBy(xpath="//input[@name='agree']")
	public static WebElement termsandconditionsbtn;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	public static WebElement paymentscontinuebtn;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	public static WebElement confirmorderbtn;
	
	
	public static void billingdetails() {
		/*Elements.TypeText(firstname,Base.reader.getfirstname());
		Elements.TypeText(lastname,Base.reader.getlastname());
		Elements.TypeText(address,Base.reader.getaddress());
		Elements.TypeText(city,Base.reader.getcity());
		Elements.selectByText(country,Base.reader.getcountry());
		Elements.selectByText(state,Base.reader.getstate());*/
	    Waits.setImplicitWait(10);
		Elements.click(continuebtn);
		
		Elements.click(shippingcontinuebtn);
		
		Elements.click(shippingmethodbtn);
		
		Elements.click(termsandconditionsbtn);
		
		Elements.click(paymentscontinuebtn);
		
		Elements.click(confirmorderbtn);
		
	}
	
	
	
	
	
	

}
