package sanjeevacademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.options.XCUITestOptions;

public class scrollDemo {
	
	
	WebDriver driver;
	//AndroidDriver driver;
	@BeforeClass
	 public void setUp() throws Exception {
	 
	  
	 DesiredCapabilities capability = new DesiredCapabilities();
//	 c
    capability.setCapability("device","Android");
	 
	//Mobile OS version. In My case its running on Android 4.2
    capability.setCapability(CapabilityType.VERSION, "9.0");
	
    capability.setCapability("app","/Users/bitbyte/Desktop/ApiDemos-debug.apk");
    XCUITestOptions options=new XCUITestOptions();
 
 
    capability.setCapability("deviceName","Android Emulator");
    capability.setCapability("platformName","Android");

    capability.setCapability("app-package", "io.appium.android.apis");
  
	 capability.setCapability("app-activity", ".view.TextFields");
 

   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
   driver.findElement(AppiumBy.accessibilityId("Views")).click();
//   driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
//   driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
   driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
   Thread.sleep(2000);
     
     
	 }
	
		   
		 
		    
		 
		  
		  //"appium:automationName": "UiAutomator2",
		  
		
	 
	
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		System.out.println("HelloTest");
		
		
		
		
		
		
		//AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		//driver.quit();

		//System.out.println("firstappium TestHelloTest");
		//System.out.println("firstappium TestHelloTest1");
		
	}
	
	

}
