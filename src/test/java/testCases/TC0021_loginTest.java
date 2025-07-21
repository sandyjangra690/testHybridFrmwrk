package testCases;

import org.openqa.selenium.WebDriver;

public class TC0021_loginTest {

	WebDriver driver;
	
	public void SimpleLoginTest()
	{	
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
	}
}
