package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_AccountRegister extends BaseClass{

			
	@Test(groups={"Regression", "Master"})
	public void AccountRegistration()
	{
		HomePage homeObj = new HomePage(driver);
		homeObj.clickMyAccount();
		homeObj.clickRegister();
		
		RegisterPage RegisterObj = new RegisterPage(driver);
		RegisterObj.setfirstname("Jack");
		RegisterObj.setlastname("Watson");
		RegisterObj.setemail("jackWatson@yopmail.com");
		RegisterObj.setpassword("Watson78@");
		RegisterObj.chkPolicy();
		RegisterObj.btnContinueSubmit();
		RegisterObj.getconfirmMsg();
			
		
	}
	
	
}
