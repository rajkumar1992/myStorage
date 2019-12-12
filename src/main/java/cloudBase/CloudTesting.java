 package cloudBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class CloudTesting {
 public static WebDriver driver;
 
 

public static final String USERNAME = "RajkumarTesting";
public static final String ACCESS_KEY = "cb33af1e-007b-4fab-989e-627e164e95a9";
public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	
	@Test
	public void start() throws MalformedURLException, InterruptedException
	{
		

		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 8");
		browserOptions.setCapability("browserVersion", "78.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		driver=new RemoteWebDriver(new URL(URL), browserOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.withTagName("input").below(By.id("txtUsername"))).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.withTagName("input").below(By.id("txtPassword"))).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Done with CloudTesting successfully");
	}
	
	
}
