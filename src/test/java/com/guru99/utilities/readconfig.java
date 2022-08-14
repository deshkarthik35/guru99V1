package com.guru99.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	
	Properties pro;
	
	public readconfig() {
		
		File src = new File("./configaration files//config.properties");
		
		try {
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties(); 
		pro.load(fis); 
		} catch (Exception e) {
			System.out.println("exception is handled");
		}
	} 
	
public String getURL() {
	
	String url = pro.getProperty("baseurl");
	return url;
}

public String getusername() {
	
	String username= pro.getProperty("username");
	return username;
}

public String getpassword() {
	
	String password= pro.getProperty("password");
	return password;
}

public String getcropath() {
	
	String cropath = pro.getProperty("cropath");
	return cropath;
}

public String getgeopath() {
	String geopath = pro.getProperty("gechopath");
	return geopath;
	
}

}
