package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AdminPage;
import pageObjects.LoginPage;

public class Steps {
	
	public static WebDriver driver;
	
	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) throws InterruptedException {
		driver.get(url);
	   Thread.sleep(3000);
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_Username_as_and_Password_as(String email, String password) throws InterruptedException {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.setUsername(email);
		LoginPage.setPassword(password);
		Thread.sleep(3000);
	   
	}

	@Then("Click on Login")
	public void click_on_Login() throws InterruptedException {
		LoginPage.loginClick();
		Thread.sleep(2000);
		
	}

	@Then("Click on logout")
	public void click_on_logout() throws InterruptedException {
		LoginPage.logOutClick();
		Thread.sleep(3000);
		driver.close();
	}

	//Add Admin Page
	
	@Then("Click on ADMIN Dashbord")
	public void click_on_ADMIN_Dashbord() throws InterruptedException {
	   
		PageFactory.initElements(driver, AdminPage.class);
		AdminPage.adminClick();
		Thread.sleep(2000);
		
	}

	@Then("User enter Username as {string}")
	public void user_enter_Username_as(String string) throws InterruptedException {
		AdminPage.setUserName(string);
		Thread.sleep(3000);
	}

	@Then("Select UserRole as Admin")
	public void select_UserRole_as_Admin() throws InterruptedException {
		AdminPage.userRole();
		Thread.sleep(3000);
	}

	@Then("User enters Employee name as {string}")
	public void user_enters_Employee_name_as(String string) throws InterruptedException {
		AdminPage.setEmployeeName(string);
		Thread.sleep(3000);
	}

	@Then("Select status as Enabled")
	public void select_status_as_Enabled() throws InterruptedException {
		AdminPage.statusDropDownField();
		Thread.sleep(3000);
	}

	@Then("Then Click on logout")
	public void then_Click_on_logout() throws InterruptedException {
		LoginPage.logOutClick();
	}

	
	
	
	
}
