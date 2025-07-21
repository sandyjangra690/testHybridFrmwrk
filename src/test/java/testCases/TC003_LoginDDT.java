package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	WebDriver driver;
	
	@Test(dataProvider="LoginData", dataProviderClass= DataProviders.class, groups="DataDriven")// need to mention dataprovidersclass becoz the class is in other package.
	public void Verify_loginDDT(String email, String pwd, String exp)
	{
		
		//HomePage
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login
		LoginPage lp=new LoginPage(driver);
		lp.enterLoginEmail(email);
		lp.enterLoginPwd(pwd);
		lp.clickLoginButton();
		
		//My Account
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExists();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				Assert.assertTrue(true);  //success login case becomes pass
				macc.clickLogout();
			}
			else
			{
				Assert.assertFalse(false);
			}
		}
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);  //success login case becomes fail
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
		
		
		
		
	}

}
