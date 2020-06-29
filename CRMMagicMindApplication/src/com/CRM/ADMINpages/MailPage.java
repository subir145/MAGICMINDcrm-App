package com.CRM.ADMINpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class MailPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Mail')]")
	private WebElement Mail;
	
	@FindBy(xpath="//tr[2]/td[3]/a[1]")
	private WebElement ActionView;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement Close;
	
	@FindBy(xpath="//tr[2]/td[3]/a[2]")
	private WebElement ActionEdit;
	
	public MailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickMail()
	{
		Mail.click();
	}
	public void clickActionView()
	{
		ActionView.click();
	}
    public void ClickClose()
    {
    	Close.click();
    }
    public void clickActionEdit()
    {
    	ActionEdit.click();
    }
}
