package pack;


import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class GGR_Test1 {

	public RemoteWebDriver driver;
	public DesiredCapabilities capabilities = new DesiredCapabilities();
	
@Test
public void ggr_test1() throws MalformedURLException, InterruptedException
{

	DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
capabilities.setCapability(CapabilityType.PLATFORM, Platform.LINUX);
capabilities.setCapability("name", "GGR Google Test on Chrome-AM1");
capabilities.setCapability("recordVideo", false);
capabilities.setCapability("enableVNC", true);
   //driver = new RemoteWebDriver(URI.create("http://18.221.136.128:4444/wd/hub").toURL(), capabilities);
   //driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);    
  //The ipadress of the GGR Router
driver = new RemoteWebDriver(URI.create("http://test:password@13.59.122.218:4444/wd/hub").toURL(), capabilities);
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);  

Thread.sleep(1000);


// To Test Google Functionality

/*
driver.navigate().to("https://www.google.co.in/");
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='lst-ib']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Zalenium");
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@value='Google Search']")).click();
Thread.sleep(2000);

driver.quit();
*/

//To Test OrangeHR Live application Functionality

driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='txtUsername']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id='txtPassword']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
Thread.sleep(2000);



driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
Thread.sleep(2000);

driver.quit();





}

/*
@Test
public void ggr_test2() throws MalformedURLException, InterruptedException
{

	DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
capabilities.setCapability(CapabilityType.PLATFORM, Platform.LINUX);
capabilities.setCapability("name", "GGR Google Test on Chrome-AM2");
capabilities.setCapability("recordVideo", false);
   //driver = new RemoteWebDriver(URI.create("http://18.221.136.128:4444/wd/hub").toURL(), capabilities);
   //driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);    
driver = new RemoteWebDriver(URI.create("http://test:password@18.188.46.221:4444/wd/hub").toURL(), capabilities);
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);  

Thread.sleep(1000);

driver.navigate().to("https://www.google.co.in/");
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='lst-ib']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Selenium");
Thread.sleep(1000);

driver.quit();


}
*/


}
