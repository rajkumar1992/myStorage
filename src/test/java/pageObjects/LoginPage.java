package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="txtUsername")
	public static WebElement uname;
	
	@FindBy(id="txtPassword")
	public static WebElement pass;
	
	@FindBy(id="btnLogin")
	public static WebElement login;
	
	@FindBy(id="welcome")
	public static WebElement moreOptions;
	
	@FindBy(xpath="//*[text()='Logout']")
	public static WebElement logout;
	
	
	public static void setUsername(String unamefield)
	{
		uname.sendKeys(unamefield);
		
	}
	
	public static void setPassword(String passwordfield)
	{
		pass.sendKeys(passwordfield);
	}
	
	public static void loginClick()
	{
		login.click();
	}
	
	public static void logOutClick() throws InterruptedException
	{
		moreOptions.click();
		Thread.sleep(2000);
		logout.click();
	}
	
	
}
