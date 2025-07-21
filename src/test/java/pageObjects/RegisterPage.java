package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "#input-firstname")
	WebElement firstNameInputBox;
	
	@FindBy(css = "#input-lastname")
	WebElement lastNameInputBox;
	
	@FindBy(css = "#input-email")
	WebElement emailInputBox;
	
	@FindBy(css = "#input-password")
	WebElement passwordInputBox;
	
	@FindBy(css = "button[type='submit']")
	WebElement continueSubmitButton;
	
	@FindBy(css = "input[name='agree']")
	WebElement agreeRadioButton;
	
	@FindBy(css = "div[id=\"content\"]>h1")
	WebElement confirmMessage;
	
	@FindBy(css = ".text-end>a")
	WebElement continueButton;
	
	public void setfirstname(String fname)
	{
		firstNameInputBox.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		lastNameInputBox.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		emailInputBox.sendKeys(email);
	}
	
	public void setpassword(String pwd)
	{
		passwordInputBox.sendKeys(pwd);
	}
	
	public void chkPolicy()
	{
		agreeRadioButton.click();
	}
	
	public void btnContinueSubmit()
	{
		continueSubmitButton.click();
	}
	
	public String getconfirmMsg() {
	try {
		return confirmMessage.getText();
	}
	catch (Exception e){
		return e.getMessage();
	}
	}
	
	
}


