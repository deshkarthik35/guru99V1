package com.guru99.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	 WebDriver ldriver;
	
	public login_page(WebDriver rdriver){
		
		ldriver=rdriver;
	
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement submit;
	
	@FindBy(name="btnReset")
	WebElement reset;
	
	
	public void setusername(String uname) {
		
		username.sendKeys(uname);
	}
	
	public void setpassword(String pwd) {
		
		password.sendKeys(pwd);
	
}

	public void submitbutton() {
		submit.click();
	}
	
	public void resetbutton() {
		
	reset.click();
}
}
