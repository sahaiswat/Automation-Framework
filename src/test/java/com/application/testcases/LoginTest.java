package com.application.testcases;

import org.testng.annotations.Test;


import com.application.pages.LoginPage;

public class LoginTest extends LoginPage{
	
	@Test
	public void Login()
	{
			LoginPage.LoginToApplication();
		
	}

}
