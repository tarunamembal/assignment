package runonbstack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class bstacklogin {
	WebDriver driver;
	final String USERNAME = "tarunamembal_CDoXUB";
	final String AUTOMATE_KEY = "8bqaB3AxsUBjeXbkUqxY";
	
	final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	
  @Test
  public void testonchrome() throws MalformedURLException {
	  //System.setProperty("webdriver.chrome.driver", "/Users/tarunamembal/Browser-drivers/chromedriver_mac_arm64/chromedriver");
	 // ChromeOptions option = new ChromeOptions();
		//option.addArguments("incognito");
		//WebDriver driver = new ChromeDriver(option);
	  //WebDriver driver = new ChromeDriver();
	  HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		
		MutableCapabilities capabilities = new MutableCapabilities();
		browserstackOptions.put("platformName", "Windows");
		//browserstackOptions.put("osVersion", "16");
		//browserstackOptions.put("deviceName", "iPhone 14");
		browserstackOptions.put("browserName", "Chrome");
		browserstackOptions.put("projectName", "onboarding");
		browserstackOptions.put("buildName", "6");
		browserstackOptions.put("sessionName", "test1");
		browserstackOptions.put("local", "false");
		capabilities.setCapability("bstack:options", browserstackOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
		
	  driver.get("https://www.browserstack.com/users/sign_in");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  	System.out.println("The page title on Chrome is : " +title);
	  WebElement uName = driver.findElement(By.id("user_email_login"));
	  WebElement pswd = driver.findElement(By.id("user_password"));
	  WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
	  //WebElement loginBtn2 = driver.findElement(By.id("enterprise_user_submit"));
	  uName.sendKeys("tarun.amembal@hotmail.com");
	  pswd.sendKeys("Welcome2dworld");
	  loginBtn1.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //loginBtn2.click();
	  //WebElement uName2 = driver.findElement(By.id("identifierId"));
		//pswd2.sendKeys("~Welcome2dworld");
		//uName2.sendKeys("tarun@browserstack.com");
	  String actualUrl="https://www.browserstack.com/users/sign_in";
	  String expectedUrl= driver.getCurrentUrl();
	  System.out.println("Resulting page on Chrome is: " +expectedUrl);

		Assert.assertEquals(expectedUrl,actualUrl);
		
		//Closing browser session
		driver.quit();
  }
  
  @Test()
  public void testonfirefox() throws MalformedURLException
  {
	  //System.setProperty("webdriver.firefox.driver", "/Users/tarunamembal/Browser-drivers/");
	  //WebDriver driver = new FirefoxDriver();
	  HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		MutableCapabilities capabilities = new MutableCapabilities();
		browserstackOptions.put("platformName", "MAC");
		//browserstackOptions.put("osVersion", "16");
		//browserstackOptions.put("deviceName", "iPhone 14");
		browserstackOptions.put("browserName", "Firefox");
				browserstackOptions.put("projectName", "onboarding");
				browserstackOptions.put("buildName", "6");
				browserstackOptions.put("sessionName", "test1");
				browserstackOptions.put("local", "false");
				capabilities.setCapability("bstack:options", browserstackOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
	  driver.get("https://www.browserstack.com/users/sign_in");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  	System.out.println("The page title on Firefox is : " +title);
	  WebElement uName = driver.findElement(By.id("user_email_login"));
	  WebElement pswd = driver.findElement(By.id("user_password"));
	  WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
	  //WebElement loginBtn2 = driver.findElement(By.id("enterprise_user_submit"));
	  uName.sendKeys("tarun.amembal@hotmail.com");
	  pswd.sendKeys("Welcome2dworld");
	  loginBtn1.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //loginBtn2.click();
	  String actualUrl="https://www.browserstack.com/users/sign_in";
	  String expectedUrl= driver.getCurrentUrl();
	  System.out.println("Resulting page on Firefox is: " +expectedUrl);

		Assert.assertEquals(expectedUrl,actualUrl);
		
		//Closing browser session
		driver.quit();

  }
  
  @Test()
  public void testonsafari() throws MalformedURLException
  {
	  //WebDriver driver = new SafariDriver();
	  HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		MutableCapabilities capabilities = new MutableCapabilities();
		browserstackOptions.put("platformName", "MAC");
		//browserstackOptions.put("osVersion", "16");
		//browserstackOptions.put("deviceName", "iPhone 14");
		browserstackOptions.put("browserName", "Safari");
				browserstackOptions.put("projectName", "onboarding");
				browserstackOptions.put("buildName", "6");
				browserstackOptions.put("sessionName", "test1");
				browserstackOptions.put("local", "false");
				capabilities.setCapability("bstack:options", browserstackOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
		
	  driver.get("https://www.browserstack.com/users/sign_in");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  	System.out.println("The page title on Safari is : " +title);
	  WebElement uName = driver.findElement(By.id("user_email_login"));
	  WebElement pswd = driver.findElement(By.id("user_password"));
	  WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
	  //WebElement loginBtn2 = driver.findElement(By.id("enterprise_user_submit"));
	  uName.sendKeys("tarun.amembal@hotmail.com");
	  pswd.sendKeys("Welcome2dworld");
	  loginBtn1.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //loginBtn2.click();
	  String actualUrl="https://www.browserstack.com/users/sign_in";
	  String expectedUrl= driver.getCurrentUrl();
	  System.out.println("Resulting page on Safari is: " +expectedUrl);

		Assert.assertEquals(expectedUrl,actualUrl);
		
		//Closing browser session
		driver.quit();

  }

  @AfterClass
  public void close()
  {
  //driver.quit();
  }

}
