package com.CRM.AMPages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.generics.WebDriverUtils;

public class CustomerPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Customer')]")
	private WebElement customer;
	
	@FindBy(xpath="//a[contains(text(),'Add Customer')]")
	private WebElement addcustomer;
	
	@FindBy(id="customer_name")
	private WebElement customerName;
	
	@FindBy(id="customerEmail")
	private WebElement customerEmail;
	
	@FindBy(id="customerPhone")
	private WebElement customerphone;
	
	@FindBy(id="address")
	private WebElement customeraddress;
	
	@FindBy(id="zip")
	private WebElement zipcode;
	
	@FindBy(id="country")
	private WebElement customercountry;
	
	
	@FindBy(id="website")
	private WebElement website;
	
	
	@FindBy(id="skype_id")
	private WebElement skypeid;
	
	
	@FindBy(id="country0")
	private WebElement packageType;
	
	@FindBy(id="state0")
	private WebElement packagelist;
	
	
	@FindBy(id="city0")
	private WebElement budget;
	
	
	@FindBy(className="//span[@class='slider round']")
	private WebElement manualbudjet;
	
	@FindBy(xpath="//iframe")
	private WebElement desc;
	
	@FindBy(id="tinymce")
	private WebElement wrte;
	
	
	
	
	@FindBy(xpath="(//span[@class='slider round'])[2]")
	private WebElement scrl;
	
	@FindBy(xpath="//span[contains(text(),'-- Select --')]")
	private WebElement currency;
	
	@FindBy(className="select2-search__field")
	private WebElement currencysearch;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submit;
	
	@FindBy(xpath="//a[contains(text(),'My Customer')]")
	private WebElement MyCustomer;
	
	@FindBy(xpath="//a[contains(text(),'All Customer')]")
	private WebElement AllCustomer;
	
	@FindBy(xpath="//div[contains(@class,'file-input')]/span[contains(text(),'Choose')]")
	private WebElement ChooseFile;
	
	
	
	
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clicksom()
	{
		customer.click();
		addcustomer.click();
		customerName.sendKeys("Bikash Kumar Samal");
		customerEmail.sendKeys("efg@gmail.com");
		customerphone.sendKeys("96312545");
		customeraddress.sendKeys("tripura");
		zipcode.sendKeys("799120");
		customercountry.sendKeys("India");
		
	}
	
	public void clickPackageType()
	{
		Select sel=new Select(packageType);
		sel.selectByVisibleText("Website");
	}
	
	public void clickpackageList()
	{
		Select sel=new Select(packagelist);
		sel.selectByIndex(1);
	}
	
	public void last()
	{
		wrte.sendKeys("I am assigned the business");
	
	}
	

	public void ClickCurrencycode()
	{
		
		scrl.click();
//		Select sel=new Select(currency);
//		sel.selectByVisibleText("Rupee(INR)");
		
		currency.click();
		currencysearch.sendKeys("Rupee",Keys.ENTER);
		//currencysearch.click();
	}
	
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	public void clickMyCustomer()
	{
		customer.click();
		MyCustomer.click();
	}
	
	public void clickAllCustomer()
	{
		customer.click();
		AllCustomer.click();
	}
	
	public void chooseFile()
	{
		ChooseFile.click();
//		String filepath="./Resume/SUBIR KUMAR RESUME";
//		ChooseFile.sendKeys(filepath);
	}

}
