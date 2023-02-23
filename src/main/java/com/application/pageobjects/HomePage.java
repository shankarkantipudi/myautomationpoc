package com.application.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.actiondriver.Action;
import com.application.base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//a[@class='login']")
	WebElement signin;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public LoginPage clickonsignin() {
		Action.click(driver,signin);
		return new LoginPage();
	}

}
