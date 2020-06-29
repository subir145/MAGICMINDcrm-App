package com.CRM.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;






public class BaseTest implements IAutoConstant
{
	static
	{
	 System.setProperty(Chrome_key,Chrome_value);
	 System.setProperty(gecko_key,gecko_value);
		
	}
	
	public static WebDriver driver;
	 public static FwUtils fu=new FwUtils();
	 public static int passCount=0,failCount=0;
	
	@BeforeClass
	@Parameters("sBrowser")
	public static void openBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}
	
     
 	 @AfterMethod
   		public void logoutApp(ITestResult res) throws IOException
    		{
    			int testStatus=res.getStatus();
    			  String nametest=res.getName();
    			  if(testStatus==1)
    			  {
    				  passCount++;
    			  }
    			  else
    			  {
    				  failCount++;
    				  String path=photo_path+nametest+"png";
    				  FwUtils.TakeScreenshot(driver,path);
    				  
   			  }
    			  
    }

//	@AfterClass
//	public void closeapp()
//	{
//		driver.close();
//		 
//	}
}
