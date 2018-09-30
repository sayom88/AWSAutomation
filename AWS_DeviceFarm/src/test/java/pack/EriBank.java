package pack;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class EriBank {
	WebDriver driver;
	private static AndroidDriver driver1;
	String device;
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		//device=deviceid;
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "9"); 
		capabilities.setCapability("deviceName","Google Pixel 2");
		capabilities.setCapability("platformName","Android");
	 	  
	               capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
	               capabilities.setCapability("appActivity","com.experitest.ExperiBank.LoginActivity");
	
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

	}

	
	@Test
	public void testCal() throws Exception {
	
		
		 Thread.sleep(20000);
		  
		 //System.out.println("Device:"+device);

	    	  driver.findElement(By.xpath("//*[@resource-id='com.experitest.ExperiBank:id/usernameTextField']")).click();
                                  driver.findElement(By.xpath("//*[@resource-id='com.experitest.ExperiBank:id/usernameTextField']")).sendKeys("company");
	    	  
                                  driver.findElement(By.xpath("//*[@resource-id='com.experitest.ExperiBank:id/passwordTextField']")).click();
                                  driver.findElement(By.xpath("//*[@resource-id='com.experitest.ExperiBank:id/passwordTextField']")).sendKeys("company");

                                  driver.findElement(By.xpath("//*[@resource-id='com.experitest.ExperiBank:id/loginButton']")).click();

	  
	}

	
	@AfterClass
	public void teardown(){
		
		
		//close the app
	//	driver.quit();
		
	}
	
	
}

