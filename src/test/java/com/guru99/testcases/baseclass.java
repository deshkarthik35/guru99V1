 package com.guru99.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.guru99.utilities.readconfig;

public class baseclass {
	
	readconfig Readconfig = new readconfig();
	
	
	public String URL = Readconfig.getURL();
	public String username = Readconfig.getusername();
	public String password = Readconfig.getpassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String sr){
		
		if(sr.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",Readconfig.getcropath());
		 driver = new ChromeDriver();
	}
		else if (sr.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",Readconfig.getgeopath());
			driver = new FirefoxDriver();
		}
	}

	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	
}
