package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver,this);
	}

	@FindBy(name="firstname")
	public static WebElement firstname;
	
	@FindBy(name="lastname")
	public static WebElement lastname;
	
	@FindBy(name="email")
	public static WebElement emailid;
	
	@FindBy(name="telephone")
	public static WebElement telephone;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="confirm")
	public static WebElement confirmpwd;
	
	public static void enteralldetails(DataTable datatable, String detailsType) {
		Map<String,String> map = 	datatable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.firstname, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastname, map.get("LastName"));
		//Elements.TypeText(RegisterPage.emailid, System.currentTimeMillis()+map.get("E-Mail"));
		Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.password, map.get("Password"));
		Elements.TypeText(RegisterPage.confirmpwd, map.get("PasswordConfirm"));
		
		if(detailsType.equalsIgnoreCase("duplicate")) {
			Elements.TypeText(RegisterPage.emailid, map.get("E-Mail"));
		}else {
			Elements.TypeText(RegisterPage.emailid,System.currentTimeMillis()+map.get("E-Mail"));
		}
		
		
	}
	
/*	public static void enterduplicatedetails(DataTable datatable) {
		Map<String,String> map = 	datatable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.firstname, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastname, map.get("LastName"));
		
		Elements.TypeText(RegisterPage.emailid, map.get("E-Mail"));
		Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.password, map.get("Password"));
		Elements.TypeText(RegisterPage.confirmpwd, map.get("PasswordConfirm"));
		
		
	}*/
	@FindBy(name="newsletter")
	public static WebElement subscribe;
	
	@FindBy(name="agree")
	public static WebElement privacypolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement Continue;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(xpath="//input[@id=\"input-firstname\"]/following-sibling::div")
	public static WebElement firstnamewarning;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]/following-sibling::div")
	public static WebElement lastnamewarning;
	
	@FindBy(xpath="//input[@id=\"input-email\"]/following-sibling::div")
	public static WebElement emailwarning;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]/following-sibling::div")
	public static WebElement telephonewarning;
	
	@FindBy(xpath="//input[@id=\"input-password\"]/following-sibling::div")
	public static WebElement passwordwarning;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public static WebElement privacypolicywarning;
	
	@FindBy(xpath="//ul[@class='breadcrumb']/following-sibling::div")
	public static WebElement mainwarning;
	
	
	
	
}
