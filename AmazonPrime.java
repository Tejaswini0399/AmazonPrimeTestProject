package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrime {
	
		WebDriver driver;
		@FindBy(linkText = "Sign In")
		WebElement SignInBtn;
		public WebElement getSignInBtn()
		{
			return  SignInBtn;
		}
		@FindBy(xpath="//input[@id='ap_email']")
		WebElement emailTextBox;
		public WebElement getemailTextBox()
		{
			return emailTextBox;
		}
		@FindBy(xpath = "//input[@id='ap_password']")
		WebElement pwdTextBox;
		public WebElement getPwdTextBox()
		{
			return pwdTextBox;
	
		}
		@FindBy(name ="rememberMe")
		WebElement KeepmeSignedIn;
		public WebElement getKeepmeSignedIn()
		{
			return KeepmeSignedIn;
		}
		@FindBy(id="signInSubmit")
		WebElement SignInBtn2;
		public WebElement getSignInBtn2()
		{
			return SignInBtn2;
		}
		@FindBy(xpath  = "//input[@id='pv-search-nav']")
		WebElement SearchBox;
		public WebElement getSearchBox()
		{
			return SearchBox;
		}
		@FindBy(id="pv-nav-sign-out")
		WebElement SignOut;
		public WebElement getSignOut()
		{
			return SignOut;
		}
		@FindBy(name ="reset")
		WebElement Reset;
		public WebElement getReset()
		{
			return Reset;
		}
		@FindAll(@FindBy(xpath="//span[contains(text(),'3 idiots')]"))
		List<WebElement> TitleoftheMovie;
		public List<WebElement> getTitleoftheMovie()
		{
			return TitleoftheMovie;
		}
		
		
		@FindBy(xpath="//div[@id=\"auth-error-message-box\"]")
		WebElement Errormsg;
		public WebElement getErrormsg()
		{
			return Errormsg;
		}
		@FindBy(xpath="//body/div[@id='a-page']/section[@id='av-search']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
		WebElement ClickonMovie;
		public WebElement getMovie()
		{
			return ClickonMovie;
		}

		public AmazonPrime(WebDriver driver)
		  {
			  this.driver = driver;
			  PageFactory.initElements(driver, this);
		  }

			  
		

}
