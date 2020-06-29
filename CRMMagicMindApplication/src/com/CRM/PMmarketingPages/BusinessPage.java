package com.CRM.PMmarketingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class BusinessPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Business')]")
	private WebElement Business;
	
	@FindBy(xpath="//a[contains(text(),'Project(Assigned to me)')]")
	private WebElement ProjectAssignedToMe;
	
	
	
   public BusinessPage(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void clickBusiness()
   {
	   Business.click();
   }
   public void clickProjectAssignedToMe()
   {
	   ProjectAssignedToMe.click();
   }
   

}
