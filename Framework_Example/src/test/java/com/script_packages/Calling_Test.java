package com.script_packages;

import org.testng.annotations.Test;

import com.demo_package.FlightReservation_Main_Page;

public class Calling_Test {
	FlightReservation_Main_Page CallMainPage=new FlightReservation_Main_Page();
	
	@Test
	public void Call_All_Test() throws InterruptedException
	{
		CallMainPage.Login();
		CallMainPage.Selection();
		CallMainPage.CloseBrowser();
	}

}
