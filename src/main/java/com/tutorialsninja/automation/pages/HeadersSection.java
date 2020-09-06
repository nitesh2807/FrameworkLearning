package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	
	
	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	public static WebElement  myAccountlink;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	public static WebElement register;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	public static WebElement Login;
	
	public static void navigatetologinpage() {
		Elements.click(HeadersSection.myAccountlink);
		Elements.click(HeadersSection.Login);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	public static WebElement viewshoppingcart;
	
	public static void navigatetoshoppingcartpage() {
		Elements.click(viewshoppingcart);
	}
	

}
