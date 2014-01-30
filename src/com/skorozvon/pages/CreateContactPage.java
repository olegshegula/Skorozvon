/**
 * 
 */
package com.skorozvon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.review.pages.RegistrationPage;

/**
 * @author shcegula-os
 *
 */
public class CreateContactPage extends Page {

	public CreateContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@CacheLookup
	@FindBy(id = "name")
	private WebElement name;
	
	@CacheLookup
	@FindBy(id = "city")
	private WebElement city;

	@CacheLookup
	@FindBy(id = "post")
	private WebElement post;
	
	@CacheLookup
	@FindBy(id = "phone")
	private WebElement phone;
	
	@CacheLookup
	@FindBy(id = "email")
	private WebElement email;
	
	@CacheLookup
	@FindBy(id = "comment")
	private WebElement comment;
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='popup popup__modal ui-draggable']")
	private WebElement popupwindow;
	
	
	/* (non-Javadoc)
	 * @see com.skorozvon.pages.Page#open()
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub

	}
	
	public boolean isPageOpened() {
		return popupwindow.isDisplayed();
	}

	public CreateContactPage enterName(String name_) {
		name.sendKeys(name_);
		return this;
	}
	
	public CreateContactPage enterCity(String city_) {
		name.sendKeys(city_);
		return this;
	}
}
