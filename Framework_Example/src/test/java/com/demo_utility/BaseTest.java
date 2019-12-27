package com.demo_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class BaseTest {
	WebDriver driver;
	public WebDriver WebDriverLoad()
	{
		String absolutePath=System.getProperty("user.dir");
		//String filePath=absolutePath+"\\chromedriver.exe";
		String filePath=absolutePath+"\\Drivers"+"\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", filePath);
		FirefoxDriver driver=new FirefoxDriver();
	    return driver;	
	}
	
	@DataProvider(name="Login")
	public Object[][] getDataFromDataprovider()
	{
		return new Object[][]
				{
			{"http://newtours.demoaut.com/mercurysignon.php?","testing","testing"},
			{"http://newtours.demoaut.com/mercurysignon.php?","dixit","dixit"},
			{"http://newtours.demoaut.com/mercurysignon.php?","testabhi","testabhi"}
				};
	}
	

}
