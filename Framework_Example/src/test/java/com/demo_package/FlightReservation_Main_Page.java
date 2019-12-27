package com.demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import junit.framework.Assert;

public class FlightReservation_Main_Page extends Launch_Browser {
	
	WebDriver driver=LaunchURL();
	
	public void Login(){
		 	driver.findElement(By.linkText("SIGN-ON")).click();
		 	driver.findElement(By.name("userName")).sendKeys("testing");
			driver.findElement(By.name("password")).sendKeys("testing");
			driver.findElement(By.name("login")).click();
		
	}
	public void Selection() throws InterruptedException
	{
		String str=driver.findElement(By.xpath("//input[@value='roundtrip']")).getAttribute("checked");
		if(str.equalsIgnoreCase("true"))
		{
			System.out.println("Roundtrip is selected");
		}
		
		//Radio button Oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//to verify whether oneway get selected or not post click
		WebElement ele=driver.findElement(By.xpath("//input[@value='oneway']"));
		Assert.assertEquals(ele.isSelected(), true);
		Thread.sleep(5000);
		
		//css selector radio button
		WebElement elem=driver.findElement(By.cssSelector("input[value='Business']"));
		Assert.assertEquals(elem.isSelected(), true);
		
		Select SelectPass = new Select(driver.findElement(By.name("passCount")));
		SelectPass.selectByValue("4");
		
		Select oselect=new Select(driver.findElement(By.name("fromPort")));
		oselect.selectByValue("London");
		//driver.findElement(By.xpath(("//input[@value='Business']"))
		//Continue button
		//driver.findElement(By.name(("findFlights")).click();

	}
	 @AfterTest
	  public void CloseBrowser() {
		  driver.quit();
	  }
}

