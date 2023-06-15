package remotedrivergrid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

public class RemoteTestng {
	WebDriver driver;
	
  @Test
  public void testonchrome() throws MalformedURLException {
	  //System.setProperty("webdriver.chrome.driver", "/Users/tarunamembal/Browser-drivers/chromedriver_mac_arm64/chromedriver");
	  //ChromeOptions option = new ChromeOptions();
		//option.addArguments("incognito");
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/"), option);
	  FirefoxOptions option = new FirefoxOptions();
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/"), option);
	  //WebDriver driver = new ChromeDriver();
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
	  String actualUrl="https://live.browserstack.com/dashboard";
	  String expectedUrl= driver.getCurrentUrl();
	  System.out.println("Resulting page on Chrome is: " +expectedUrl);

		//Assert.assertEquals(expectedUrl,actualUrl);
		
		//Closing browser session
		//driver.quit();
  }
  
  @Test()
  public void testonfirefox() throws MalformedURLException
  {
	  //System.setProperty("webdriver.firefox.driver", "/Users/tarunamembal/Browser-drivers/");
	  //WebDriver driver = new FirefoxDriver();
	  FirefoxOptions option = new FirefoxOptions();
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/"), option);
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
	  String actualUrl="https://live.browserstack.com/dashboard";
	  String expectedUrl= driver.getCurrentUrl();
	  System.out.println("Resulting page on Firefox is: " +expectedUrl);

		//Assert.assertEquals(expectedUrl,actualUrl);
		
		//Closing browser session
		//driver.quit();

  }
  
  @Test()
  public void testonsafari() throws MalformedURLException
  {
	  //WebDriver driver = new SafariDriver();
	  //SafariOptions option = new SafariOptions();
	  //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/"), option);
	  FirefoxOptions option = new FirefoxOptions();
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/"), option);
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
	  String actualUrl="https://live.browserstack.com/dashboard";
	  String expectedUrl= driver.getCurrentUrl();
	  System.out.println("Resulting page on Safari is: " +expectedUrl);

		//Assert.assertEquals(expectedUrl,actualUrl);
		
		//Closing browser session
		//driver.quit();

  }

  @AfterClass
  public void close()
  {
  driver.quit();
  }

}
