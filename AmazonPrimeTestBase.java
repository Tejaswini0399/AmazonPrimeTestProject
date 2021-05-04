package com.qa.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.Pages.AmazonPrime;

public class AmazonPrimeTestBase {
	
		WebDriver driver;
		AmazonPrime prime;
		
		@Parameters({"Browser","Url"})
		@BeforeClass
		public void setup(String Browser, String Url)
		{
			if(Browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\Selenium softwares\\tanu1\\chromedriver.exe");
				driver = new ChromeDriver();
				prime=new AmazonPrime(driver);
				
			}
			driver.get(Url);
		}
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}
		
		

	}
	

