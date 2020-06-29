package com.CRM.SalesHeadPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement loginbutton;
	
	@FindBy(id="email")
	private WebElement email;
	
	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement log;
	
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickloginpage()
	{
		loginbutton.click();
		email.sendKeys("saleshead@test.com");
		password.sendKeys("123456");
		log.click();
		
		
	}

}