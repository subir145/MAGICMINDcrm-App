package com.CRM.PMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class MilestonePage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),' Milestone')]")
	private WebElement Milestone;
	
	@FindBy(xpath="//a[contains(text(),'Milestone List')]")
	private WebElement MilestoneList;
	
	public MilestonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickMilestone()
	{
		Milestone.click();
	}
	public void clickMilestoneList()
	{
		MilestoneList.click();
	}

}
