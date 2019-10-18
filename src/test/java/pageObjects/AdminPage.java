package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement admin;
	
	@FindBy(id="searchSystemUser_userName")
	public static WebElement uname;
	
	@FindBy(xpath="//*[@id='searchSystemUser_userType']")
	public static WebElement userRoleDropDown;
	 
	@FindBy(id="searchSystemUser_employeeName_empName")
	public static WebElement empName;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement statusDropDown;
	
	public static void adminClick()
	{
		admin.click();
	}
	
	public static void setUserName(String usernamefield)
	{
		uname.sendKeys(usernamefield);
	}
	
	public static void userRole()
	{
		Select s=new Select(userRoleDropDown);
		s.selectByIndex(1);
	}
	
	
	public static void setEmployeeName(String employeeName )
	{
		empName.sendKeys(employeeName);
	}
	
	
	public static void statusDropDownField()
	{
		Select s=new Select(statusDropDown);
		s.selectByIndex(1);
	}
	
}
