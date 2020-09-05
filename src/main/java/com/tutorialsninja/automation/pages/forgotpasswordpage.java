package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class forgotpasswordpage {
	
	public forgotpasswordpage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath="//input[@id='input-email']")
	public static WebElement emailaddressfield;
	
	@FindBy(css="input.btn.btn-primary")
	public static WebElement ContinueBTN;
}
