package com.diatoz.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.diatoz.automation.config.ConfigurationReader;


import org.apache.log4j.Logger;


public class Base {

	public static Logger log = Logger.getLogger(Base.class);
	public static WebDriver driver;
	public static ConfigurationReader reader;

	public static void setDriver(ChromeDriver chromeDriver) {
		Base.driver = driver;

	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
