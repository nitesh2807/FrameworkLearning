package com.tutorialsninja.automation.config;


import java.io.IOException;
import java.util.Properties;

import com.tutorialsninja.automation.util.PathHelper;



public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	
	public String getUsername() {
		
		return properties.getProperty("username");
	}

	
	public String getPassword() {
		
		return properties.getProperty("password");
	}

	
	public String getProduct() {
		
		return properties.getProperty("product");
	}

	@Override
	public String getfirstname() {
		// TODO Auto-generated method stub
		return properties.getProperty("firstname");
	}

	@Override
	public String getlastname() {
		// TODO Auto-generated method stub
		return properties.getProperty("lastname");
	}

	@Override
	public String getaddress() {
		// TODO Auto-generated method stub
		return properties.getProperty("Address");
	}

	@Override
	public String getcity() {
		// TODO Auto-generated method stub
		return properties.getProperty("city");
	}

	@Override
	public String getcountry() {
		// TODO Auto-generated method stub
		return properties.getProperty("country");
	}

	@Override
	public String getstate() {
		// TODO Auto-generated method stub
		return properties.getProperty("state");
	}
	

	
	}
