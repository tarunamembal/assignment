package remotedriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.junit.Assert;

public class RemoteDriver {
	public static void main(String[] args) throws MalformedURLException{
		//Setting the driver path
		//System.setProperty("webdriver.chrome.driver", "/Users/tarunamembal/Browser-drivers/chromedriver_mac_arm64/chromedriver");
		
		//Creating WebDriver instance
		//WebDriver driver = new ChromeDriver();
		SafariOptions safariOptions = new SafariOptions();
		//chromeOptions.setCapability("browserVersion", "112");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.20.1.167:4444/"), safariOptions);
		
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
