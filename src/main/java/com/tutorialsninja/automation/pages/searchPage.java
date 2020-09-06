package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class searchPage {
	
	public searchPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public static WebElement searchbox;
	
	@FindBy(css="button[type='button'][class='btn btn-default btn-lg']")
	public static WebElement clicksearchbutton;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	public static WebElement displayedsearchdetails;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criteria.')]")
	public static WebElement noresultmessage;
	
	public static void searchproduct() {
		Elements.TypeText(searchPage.searchbox, Base.reader.getProduct());
    	Elements.click(searchPage.clicksearchbutton);
        
	}
	
	@FindBy(xpath="//button[@onclick=\"cart.add('33', '1');\"]")
	public static WebElement addtocartbtn;
	
	public static void addfirstproduct() {
		Elements.click(searchPage.addtocartbtn);
	}

}
