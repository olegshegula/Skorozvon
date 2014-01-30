/**
 * 
 */
package com.skorozvon.pages;

import org.openqa.selenium.WebDriver;

/**
 * @author shcegula-os
 *
 */
public abstract class Page {

	protected WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
public abstract void open();	

}
