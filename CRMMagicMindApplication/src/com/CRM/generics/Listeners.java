package com.CRM.generics;

//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

//public class Listeners extends TestListenerAdapter {
//	
//	public void onTestStart(ITestResult tr)
//	{
//		System.out.println("Test started");
//	}
//	
//	public void onTestSuccess(ITestResult tr)
//	{
//		System.out.println("Test success");
//	}	
//	public void onTestFailure(ITestResult tr)
//	{
//		System.out.println("Test Failure");
//	}	
//	public void onTestSkipped(ITestResult tr)
//	{
//		System.out.println("Test skipped");
//	}
//	
public class Listeners  extends TestListenerAdapter{      //Reporting=Listener
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
@BeforeTest	
public void onStart(ITestContext testcontext)
{
	System.out.println("Test started");
	String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); //time stamp
	String repName="Test-Report-"+timeStamp+".html";
	
	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+repName);//specify location
	htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	
	extent =new ExtentReports();
	
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Host name","localhost");
	extent.setSystemInfo("Environment","QA");
	extent.setSystemInfo("user","subir");
	
	htmlReporter.config().setDocumentTitle("Magicmind CRM Project");  //	Title of report
	htmlReporter.config().setReportName("Functional Test Automation Report");   //name of the Report
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
	htmlReporter.config().setTheme(Theme.DARK);
	
}
@Test
  public void onTestSuccess(ITestResult tr)
  {
	System.out.println("Test success");
	  logger=extent.createTest(tr.getName()); //create new entry in the report
	  logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); //send the passed information
  }
  @AfterTest
  public void onTestFailure(ITestResult tr)
  {
	  System.out.println("Test Failure");
	  logger=extent.createTest(tr.getName()); //create new entry in the report
	  logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); //send the passed information
	  
	  String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
      
      File f = new File(screenshotPath);
      
      if(f.exists())
      {
    	  try
    	  {
    		  logger.fail("Screenshot is below:"+logger.addScreenCaptureFromPath(screenshotPath));
    		  
    	  }
    	  catch(IOException e)
    	  {
    		 e.printStackTrace(); 
    	  }
      }
      
  }
  @AfterTest
  public void onTestSkipped(ITestResult tr)
  {
	  System.out.println("Test Skipped");
	  logger=extent.createTest(tr.getName());  //create new entry in the report
	  logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
  }
  @AfterClass
  public void onFinish(ITestContext testcontext)
  {
	  System.out.println("Test Finish");
	  extent.flush();
  }
  
	
	

}
