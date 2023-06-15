package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class bstacklogin {
	WebDriver driver;
	
  @Test
  public void testonchrome() {
	  //System.setProperty("webdriver.chrome.driver", "/Users/tarunamembal/Browser-drivers/chromedriver_mac_arm64/chromedriver");
	  ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
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
  public void testonfirefox()
  {
	  //System.setProperty("webdriver.firefox.driver", "/Users/tarunamembal/Browser-drivers/");
	  WebDriver driver = new FirefoxDriver();
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
  public void testonsafari()
  {
	  WebDriver driver = new SafariDriver();
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
