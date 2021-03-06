package com.skorozvon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage  {

	private WebDriver driver;



	public LeadsPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "add-contact")
	private WebElement addcontact;
	

		
	public boolean isPageOpened() {
		return addcontact.isDisplayed();
	}
	
	public CreateContactPage addContact(){
		addcontact.click();
		return PageFactory.initElements(driver, CreateContactPage.class);
	}

}
