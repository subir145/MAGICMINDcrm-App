package com.CRM.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class FwUtils {
	
	public static void verifypage(WebDriver driver,String ExpectedTitle)
	{
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		Reporter.log("The title of the page is:"+ExpectedTitle,true);
	}
  
	
	
	
	public static void TakeScreenshot(WebDriver driver,String path) throws IOException
	{
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		FileUtils.copyFile(src, des);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	
	
	
	public static String read_xl_data(String path,String sheet,int row,int cell)
	{
		String data=" ";
		try
		{
		Workbook wb=  WorkbookFactory.create(new FileInputStream(path));
		data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
		}
	
	
	
	public static int row_count(String path,String sheet, int row)
	{
		int row_number=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			row_number=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return row_number;
		
	}
	
	public static String write_XL_data(String sheet,String path,int row,int cell)
	{
		String data=" ";
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			data=wb.getSheet(sheet).createRow(row).createCell(cell).toString();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
		
	}
	
	
	
}
