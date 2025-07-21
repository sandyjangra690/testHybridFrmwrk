package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	//WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")  //or css - div[class='nav float-end'] li[class='list-inline-item'] li:nth-child(1) a:nth-child(1)
	WebElement lnkRegister;
	
	@FindBy(css="body > nav:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
	WebElement lnkLogin;
	
	public void clickMyAccount()
	{
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//		wait.until(ExpectedConditions.visibilityOf(lnkMyAccount));
		lnkMyAccount.click();
	}
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	
}
