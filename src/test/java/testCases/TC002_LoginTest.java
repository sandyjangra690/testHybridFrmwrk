package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	//public WebDriver driver;
	@Test(groups={"Sanity", "Master"})  //when there is single group there is no need of curly braces.
	public void VerifyLogin() {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage loginObj = new LoginPage(driver);
		loginObj.enterLoginEmail("sandy@yopmail.com");
		loginObj.enterLoginPwd("sandy@78");
		loginObj.clickLoginButton();
		
		MyAccountPage macc = new MyAccountPage(driver);
		macc.isMyAccountPageExists();
				
	}

}
