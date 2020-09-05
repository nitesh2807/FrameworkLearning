package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
@FindBy(id="input-email")
public static WebElement emailfield;

@FindBy(id="input-password")
public static WebElement passwordfield;

@FindBy(xpath="//input[@value='Login']")
public static WebElement loginbtn;

public static void dologin(String email,String password) {
	Elements.TypeText(LoginPage.emailfield,email);
    Elements.TypeText(LoginPage.passwordfield,password);
    Elements.click(LoginPage.loginbtn);
	
}

@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
public static WebElement InvalidDetails;

@FindBy(linkText="Forgotten Password")
public static WebElement forgotpassword;

@FindBy(css="div.alert.alert-success.alert-dismissible")
public static WebElement InvalidDetailsalert;







}
