package com.skorozvon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPage extends Page {

	public LeadsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "add-contact")
	private WebElement addcontact;
	

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

}
