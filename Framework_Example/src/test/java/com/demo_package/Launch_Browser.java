package com.demo_package;

import org.openqa.selenium.WebDriver;

import com.demo_utility.BaseTest;

public class Launch_Browser extends BaseTest
{
	WebDriver driver= WebDriverLoad();

     public WebDriver LaunchURL()
     {
    	 String baseURL="http://newtours.demoaut.com/";
    	 driver.get(baseURL);
    	 driver.manage().window().maximize();
    	 return driver;
     }

}
