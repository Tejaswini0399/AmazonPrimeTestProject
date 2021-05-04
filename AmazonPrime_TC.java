package com.qa.Testscript;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.Testngxml.Utilities;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;



public class AmazonPrime_TC extends AmazonPrimeTestBase{
	
	@Test(priority=1)
	public void Login(){
			prime.getSignInBtn().click();
			prime.getemailTextBox().sendKeys("9741053647");
		    prime.getPwdTextBox().sendKeys("Brijesh@19");
			prime.getKeepmeSignedIn().click();
			prime.getSignInBtn2().click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
		
		@Test(priority=2,dataProvider="supplydata")
	public void Login(String input1) throws InterruptedException
		{
			
			prime.getSearchBox().click();
			prime.getSearchBox().clear();
			prime.getSearchBox().sendKeys(input1,Keys.ENTER);
			Thread.sleep(5000);
			prime.getMovie().click();
			Thread.sleep(5000);
			 List<WebElement> titleoftheMovie = prime.getTitleoftheMovie();
			 for( WebElement ele:titleoftheMovie) {
				 String MovieName = ele.getText();
				 if(MovieName.equalsIgnoreCase(input1))
				 {
					//Select the Movie
					ele.click();
					Thread.sleep(5000);
					System.out.println(ele.getText());
				 }
				 }
			 }
			
		
		


		@DataProvider
		public String[][] supplydata() throws IOException
		{
			String xlPath="D:\\VirtusaIAT\\SeleniumAutomation1\\src\\test\\java\\com\\qa\\Testdata1\\Book2.xlsx";
			String xlSheet = "Sheet1";
			int rowCount = Utilities.getRowCount(xlPath,xlSheet);
			int cellCount = Utilities.getCellCount(xlPath, xlSheet, rowCount);
			String[][] data = new String[rowCount][cellCount];
			for(int i=1;i<=rowCount;i++)
			{
				for(int j=0;j<cellCount;j++)
				{
					data[i-1][j]=Utilities.getCellData(xlPath, xlSheet, i, j);
				}
			}
		
			return data;
		}
}

		
				
		
				


