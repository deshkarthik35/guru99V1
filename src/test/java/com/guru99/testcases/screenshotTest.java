package com.guru99.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


public class screenshotTest extends baseclass {

	@Test(description="this is a screnshot of my loginpage")
	public void homepagescreenshot() throws IOException {
		
		driver.get(URL);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg = new File("C://Users//hp//eclipse-workspace//com.guru99//screenshot//homepage.png");
					FileUtils.copyFile(src, trg);
			
		
	}
	
	
}
