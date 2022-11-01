package sanjeevacademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.ios.IOSDriver;


public class IOSBasetest {
	public static AppiumDriver<MobileElement> driver;
	//IOSDriver driver;
	@BeforeSuite
	 public void setUp() throws Exception {
		
	 
	  
	 //DesiredCapabilities capability = new DesiredCapabilities();
//	 capability.setCapability("device","Android");
//     capability.setCapability(CapabilityType.VERSION, "10");
//     capability.setCapability("app","/Users/bitbyte/Desktop/ApiDemos-debug.apk");
//     capability.setCapability("deviceName","Pixel 2");
//     capability.setCapability("platformName","Android");
//     capability.setCapability("app-package", "io.appium.android.apis");
//     capability.setCapability("app-activity", ".view.TextFields");
//    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
//    File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//     FileUtils.copyFile(file, new File("Screenshot.jpg"));
////      Thi is for the Tab
//		XCUITestOptions options=new XCUITestOptions();
//		options.setDeviceName("iPhone 12 pro");
//	   options.setApp("/Users/bitbyte/Desktop/BizGrab.app");
//	   options.setPlatformVersion("14.5");
//	   options.setWdaLaunchTimeout(Duration.ofSeconds(20));
//	   
//	
	 //options.setAppActivity("com.bizgrab.MainActivity");
	 
	 
	 
//    capability.setCapability("device","Android");
//	 
//	//Mobile OS version. In My case its running on Android 4.2
//    capability.setCapability(CapabilityType.VERSION, "9.0");
//	
//    capability.setCapability("app","/Users/bitbyte/Desktop/bizgrab.apk");
// 
// 
//    capability.setCapability("deviceName","Android Emulator");
//    capability.setCapability("platformName","Android");
//
//    capability.setCapability("app-package", "io.appium.android.apis");
//  
//	 capability.setCapability("app-activity", "com.bizgrab.MainActivity");
// 
//
//	  driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  //Thread.sleep(3000);
//   
//  File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  FileUtils.copyFile(file, new File("Screenshot.jpg"));
  //Thread.sleep(5000);
//  driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//  
// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
//  driver.findElement(By.id("android:id/checkbox")).click();
//  
//  Thread.sleep(2000);
//  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
//  String alerttitle=driver.findElement(By.id("android:id/alertTitle")).getText();
//  Assert.assertEquals(alerttitle,"WiFi settings" );
//  
//  driver.findElement(By.id("android:id/edit")).sendKeys("Testing");
//  driver.findElement(By.id("android:id/button1")).click();
//    driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("sanjeevk@bitbyteitservices.com");
//    Thread.sleep(3000);
//   
//    //driver.findElement(By.xpath("ewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
//  
//    driver.findElement(By.xpath("//*[@text='Next']")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.className("android.view.ViewGroup")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//*[@text='Password']")).sendKeys("Password");
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//*[@text='Login']")).click();
//    Thread.sleep(30000);
//    File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(file, new File("homeScreenshot.jpg"));
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("//*[@text='Setting']")).click();
//    Thread.sleep(3000);
//    File file1  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(file1, new File("settingScreenshot.jpg"));
//    
//    driver.findElement(By.xpath("//*[@text='Home']")).click();
//       Thread.sleep(3000);
//       
//       
//   driver.findElement(By.xpath("//*[@text='Scan On']")).click();
//   Thread.sleep(3000);
//   File file4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//   FileUtils.copyFile(file4, new File("searchrunScreenshot.jpg"));
//   Thread.sleep(2000);
////   File file2  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////  FileUtils.copyFile(file2, new File("searchrunScreenshot.jpg"));
////  driver.findElement(By.className("android.widget.ImageView")).click();
////  Thread.sleep(10000);
////  driver.findElement(By.xpath("//*[@text='Allow']")).click();
////  driver.findElement(By.xpath("//*[@text='Allow']")).click();
////  File file3  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////  FileUtils.copyFile(file3, new File("searchiconScreenshot.jpg"));
////  Thread.sleep(3000);
////  driver.findElement(By.className("android.widget.TextView")).click();
//// // driver.findElement(By.xpath("//*[@text='Search']")).clear();
////  //driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("ref20964");
////  driver.findElement(By.xpath("//*[text='PENDING DELIVERY']")).click();
//   driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("ref20964");
//   driver.findElement(By.xpath("//*[@text='SUMMARY']")).click();
//   Thread.sleep(3000);
//   
//   File file5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//   FileUtils.copyFile(file5, new File("runsmmeryScreenshot.jpg"));
//   Thread.sleep(3000);
//   driver.navigate().back() ;
//   
//   //driver.findElement(AppiumBy.className("android.view.ViewGroup")).click();
//   
//   Thread.sleep(3000);
//   
//   driver.findElement(By.xpath("//*[@text='Processed By: Jaswinder']")).click();
//   
//   
// File file6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// FileUtils.copyFile(file6, new File("runScreenshot.jpg"));
// Thread.sleep(3000);
// 
// driver.findElement(By.xpath("//*[@text='PENDING DELIVERY']")).click();
// Thread.sleep(3000);
////  driver.findElement(By.xpath("//*[@text='ALLOW']")).click();  //tab
////  Thread.sleep(3000);
////  driver.findElement(By.xpath("//*[@text='ALLOW']")).click();// tab
////
// driver.findElement(By.xpath("//*[@text='Allow']")).click();
// Thread.sleep(3000);
// driver.findElement(By.xpath("//*[@text='Allow']")).click();
// Thread.sleep(3000);
// File file7  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// FileUtils.copyFile(file7, new File("InvScreenshot.jpg"));
// //Thread.sleep(30000);
// //driver.findElement(By.className("android.widget.TextView")).click();
// 
// 
//   
//  
//   
//   
//  
  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
  desiredCapabilities.setCapability("platformName", "iOS");
  desiredCapabilities.setCapability("platformVersion", "14.5");
  desiredCapabilities.setCapability("deviceName", "iPhone 12 Pro");
  desiredCapabilities.setCapability("automationName","XCUITest");
  //desiredCapabilities.setCapability("appPackage", "");
  desiredCapabilities.setCapability("app", "/Users/bitbyte/Desktop/BizGrab.app");

  URL url = new URL("http://127.0.0.1:4723/wd/hub");

  //driver = new AppiumDriver(url, desiredCapabilities);
  //AndroidDriver androidDriver = new AndroidDriver(url, desiredCapabilities);
  driver = new AppiumDriver(url, desiredCapabilities);
  //desiredCapabilities.set

 }

		   
		 
		    
		 
		  
		  //"appium:automationName": "UiAutomator2",
		  
		
	 
	
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		//UiAutomator2Options options=new UiAutomator2Options(); 
		//options.setDeviceName("Android Device");
		//options.setApp("//Users//bitbyte//eclipse-workspace//AppiumAutomation//src//test//java//resources//ApiDemos-debug.apk");
		//Actual Automation
		//xpath,id,accessibilityid,classname,androiduiautomater
		
		System.out.println("HelloTest");
		
		
		
		
		
		
		//AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		//driver.quit();

		//System.out.println("firstappium TestHelloTest");
		//System.out.println("firstappium TestHelloTest1");
		

}
	@AfterSuite
    public void tearDown() {
        //driver.close();
        driver.quit();
    }
	}

