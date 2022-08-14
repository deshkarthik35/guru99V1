package com.guru99.testcases;

import org.testng.annotations.Test;

import com.guru99.pageobject.login_page;

public class loginTest_001 extends baseclass {

	@Test
	public void loginTest() {
		driver.get(URL);
		login_page LP = new login_page(driver);
				LP.setusername(username);
				LP.setpassword(password);
				LP.submitbutton();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
		
	}
}
