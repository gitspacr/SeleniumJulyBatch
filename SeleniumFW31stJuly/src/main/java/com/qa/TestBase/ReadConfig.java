package com.qa.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	
	public ReadConfig() {
		try {
			
			File file =new File("./config/config.properties");
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	public String launchURL() {
		try {
			String urlAccess=prop.getProperty("url");
			return urlAccess;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
	

}
