package com.CRM.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	
	public void customWait(WebDriver driver,WebElement element)
	{
		new WebDriverWait(driver,IAutoConstant.ETO).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void customWaitPage(WebDriver driver,String etitle)
	{
		new WebDriverWait(driver,IAutoConstant.ETO).until(ExpectedConditions.titleContains(etitle));
	}
	
	public void Selectelmnt(WebElement element,String vText)
	{
		new Select(element).selectByValue(vText);
	}
	
	public void SelectVisible(WebElement element,String vText)
	{
		new Select(element).selectByVisibleText(vText);
	}
	
	public void SelectIndex(WebElement element,int index)
	{
		new Select(element).selectByIndex(index);
	}
	
	public void handlingframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handlingframeStr(WebDriver driver,String text)
	{
		driver.switchTo().frame(text);
	}
	
	public void handlingframebywebelement(WebDriver driver, String ele)
	{
		driver.switchTo().frame(ele);
	}
	
	public void mouseActions(WebDriver driver,WebElement targetelm)
	{
		new Actions(driver).moveToElement(targetelm).perform();
	}

}
