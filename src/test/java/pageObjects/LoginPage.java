package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(css="#input-email")
	WebElement emailInputBox;
	
	@FindBy(css="#input-password")
	WebElement PasswordInputBox;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	
	public void enterLoginEmail(String loginEmail)
	{
			emailInputBox.sendKeys(loginEmail);	
	}
	
	public void enterLoginPwd(String loginPwd)
	{
		PasswordInputBox.sendKeys(loginPwd);	
	}
	
	public void clickLoginButton(){
		loginButton.click();	
	}
	
	
	
	
	
	
	
	
}
