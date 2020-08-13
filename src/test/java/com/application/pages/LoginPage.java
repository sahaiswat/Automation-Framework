package com.application.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	@FindBy(name="email")
	static WebElement uname;
	@FindBy(name="password")
	static WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	static WebElement loginButton;

	public static  void LoginToApplication () {
		uname.sendKeys("abc@gmail.com");
		password.sendKeys("abc6476");
		loginButton.click();
		
	}

	
}
