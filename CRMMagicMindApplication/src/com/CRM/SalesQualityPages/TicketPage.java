package com.CRM.SalesQualityPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.generics.WebDriverUtils;

public class TicketPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Ticket')]")
	private WebElement Ticket;
	

	@FindBy(xpath="//a[contains(text(),'          Add Ticket')]")
	private WebElement AddTicket;
	
	

	@FindBy(xpath="//input[contains(@name,'ticket_subject')]")
	private WebElement TicketSubject;
	
	
	@FindBy(xpath="//select[contains(@class,'select2 form-control select2-hidden-accessible')]/option[contains(text(),'Health Insurance for John')]")
	private WebElement BusinessName;
	
	
	@FindBy(id="tinymce")
	private WebElement Desc;
	
	

	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[2]")
	private WebElement AssignedTo;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement AssignSearch;
	
	
	@FindBy(xpath="//input[@class='btn btn-info btn-sm']")
	private WebElement submit;
	
	@FindBy(xpath="//a[contains(text(),'          Created by me')]")
	private WebElement createdbyme;
	
	@FindBy(xpath="//i[@class='fa fa-eye info']")
	private WebElement viewTicket;
	
	@FindBy(xpath="(//td[@class='ticket_td'])[1]/button[@class='btn btn-lg p-0']")
	private WebElement EditTicket;
	
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[3]")
	private WebElement status;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement SearchStatus;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-sm btn-info btn-md')]")
	private WebElement submitEdit;
	
	


	
	public TicketPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickonTicket()
	{
		Ticket.click();
		
	}
	public void clickaddticket()
	{
		AddTicket.click();
		
	}
	public void clickTicketsubject()
	{
		TicketSubject.sendKeys("check it Thank you");
	}
	
	public void clickBusinessName()
	{
		BusinessName.click();
	}
	public void clickdesc()
	{
		
		Desc.sendKeys("Some problem");
	}
	public void clickassSubmit()
	{
		AssignedTo.click();
		AssignSearch.sendKeys("tanushrirou",Keys.ENTER);
		//AssignSearch.click();
		//SelectVisible(AssignedTo,"tanushrirou195@gmail.com");
		//Select sel=new Select(AssignedTo);
        //System.out.println(sel.isMultiple());
		
	}
	public void clicksubmit()
	{
		submit.click();
	}
	
	public void clickcreatedByMe()
	{
		createdbyme.click();
	}
	
	public void clickViewTicket()
	{
		viewTicket.click();
	}
	public void clickEditTicket()
	{
		EditTicket.click();
	}
	
	public void clickStatus()
	{
		//SelectIndex(status,2);
		status.click();
		SearchStatus.sendKeys("op",Keys.ENTER);
		submitEdit.click();
	}

}
