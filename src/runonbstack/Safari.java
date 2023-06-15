package runonbstack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Assert;


public class Safari {

	public static void main(String[] args) throws MalformedURLException{
		final String USERNAME = "tarunamembal_CDoXUB";
		final String AUTOMATE_KEY = "8bqaB3AxsUBjeXbkUqxY";
		final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		//Setting the driver path
				//System.setProperty("webdriver.firefox.driver", "/Users/tarunamembal/Browser-drivers/");
				HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
				MutableCapabilities capabilities = new MutableCapabilities();
				browserstackOptions.put("platformName", "MAC");
				//browserstackOptions.put("osVersion", "16");
				//browserstackOptions.put("deviceName", "iPhone 14");
				browserstackOptions.put("browserName", "Safari");
						browserstackOptions.put("projectName", "onboarding");
						browserstackOptions.put("buildName", "1");
						browserstackOptions.put("sessionName", "test1");
						browserstackOptions.put("local", "false");
						capabilities.setCapability("bstack:options", browserstackOptions);
				WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
				//Creating WebDriver instance
				//WebDriver driver = new FirefoxDriver();
				//Navigate to web page
				driver.get("https://www.browserstack.com/users/sign_in");
		
		//Maximizing window
		driver.manage().window().maximize();
		
		//Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		//Locating web element
		WebElement uName = driver.findElement(By.id("user_email_login"));
		WebElement pswd = driver.findElement(By.id("user_password"));
		WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
		//WebElement loginBtn2 = driver.findElement(By.id("enterprise_user_submit"));
		//WebElement uName2 = driver.findElement(By.id("identifierId"));
		//WebElement pswd2 = driver.findElement(By.type("password"));

		//Peforming actions on web elements
		uName.sendKeys("tarun.amembal@hotmail.com");
		  pswd.sendKeys("Welcome2dworld");
				loginBtn1.click();
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
				//Putting implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//uName2.sendKeys("tarun@browserstack.com");
				//loginBtn2.click();
				//pswd2.sendKeys("~Welcome2dworld");
				
				String actualUrl="https://live.browserstack.com/dashboard";

				String expectedUrl= driver.getCurrentUrl();
				
				System.out.println("Resulting page is: " +expectedUrl);

				//Assert.assertEquals(expectedUrl,actualUrl);
				
				//Closing browser session
				driver.quit();
	}
}
