package sanjeevacademy;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class s21ultra {
	AndroidDriver driver;
	@BeforeClass
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
//      Thi is for the Tab
	 UiAutomator2Options options=new UiAutomator2Options();
	 options.setDeviceName("Sanjeeviphone");
	 options.setApp("/Users/bitbyte/Desktop/13.apk");
	 options.setAppActivity("com.bizgrab.MainActivity");
	 
	 
	 
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

	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	  //Thread.sleep(3000);
//   
//  File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  FileUtils.copyFile(file, new File("Screenshot.jpg"));
  Thread.sleep(5000);
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
    driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("sanjeevk@bitbyteitservices.com");
    Thread.sleep(3000);
   
    //driver.findElement(By.xpath("ewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
  
    driver.findElement(By.xpath("//*[@text='Next']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@text='Aberdeen Paper Sandbox']")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//*[@text='Password']")).sendKeys("Password");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@text='Login']")).click();
    Thread.sleep(30000);
//  File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//   FileUtils.copyFile(file, new File("homeScreenshot.png"));
//   Thread.sleep(4000);
    UiAutomator2Options option10 = new UiAutomator2Options();
    option10.setNativeWebScreenshot(true);
    screenshot("/Users/bitbyte/Desktop/screenshot/1");
    
    driver.findElement(By.xpath("//*[@text='Setting']")).click();
   Thread.sleep(3000);
//    File file1  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(file1, new File("settingScreenshot.jpg"));
    UiAutomator2Options option11 = new UiAutomator2Options();
    option11.setNativeWebScreenshot(true);
    screenshot("/Users/bitbyte/Desktop/screenshot/2");
    
    
//    
    driver.findElement(By.xpath("//*[@text='Home']")).click();
       Thread.sleep(3000);
       
         
   driver.findElement(By.xpath("//*[@text='Scan On']")).click();
   Thread.sleep(3000);
   UiAutomator2Options option12 = new UiAutomator2Options();
   option12.setNativeWebScreenshot(true);
   screenshot("/Users/bitbyte/Desktop/screenshot/3");
//   File file4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//   FileUtils.copyFile(file4, new File("searchrunScreenshot.jpg"));
//   Thread.sleep(2000);
//   File file2  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  FileUtils.copyFile(file2, new File("searchrunScreenshot.jpg"));
//  driver.findElement(By.className("android.widget.ImageView")).click();
//  Thread.sleep(10000);
//  driver.findElement(By.xpath("//*[@text='Allow']")).click();
//  driver.findElement(By.xpath("//*[@text='Allow']")).click();
//  File file3  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  FileUtils.copyFile(file3, new File("searchiconScreenshot.jpg"));
//  Thread.sleep(3000);
//  driver.findElement(By.className("android.widget.TextView")).click();
// // driver.findElement(By.xpath("//*[@text='Search']")).clear();
//  //driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("ref20964");
//  driver.findElement(By.xpath("//*[text='PENDING DELIVERY']")).click();
   driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("ref20911");
   driver.findElement(By.xpath("//*[@text='SUMMARY']")).click();
   Thread.sleep(3000);
   UiAutomator2Options option13 = new UiAutomator2Options();
   option13.setNativeWebScreenshot(true);
   screenshot("/Users/bitbyte/Desktop/screenshot/4");
  Thread.sleep(3000);
//   
//   File file5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//   FileUtils.copyFile(file5, new File("runsmmeryScreenshot.jpg"));
//   Thread.sleep(3000);
   driver.navigate().back() ;
  
   driver.findElement(By.className("android.widget.ImageView")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@text='While using the app']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@text='While using the app']")).click();
   Thread.sleep(3000);
   UiAutomator2Options option15 = new UiAutomator2Options();
   option15.setNativeWebScreenshot(true);
   screenshot("/Users/bitbyte/Desktop/screenshot/6");

   
    driver.navigate().back() ;
   
   
   //driver.findElement(AppiumBy.className("android.view.ViewGroup")).click();
   
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@text='PARTIALLY SCANNED ON']")).click();
   UiAutomator2Options option14 = new UiAutomator2Options();
   option14.setNativeWebScreenshot(true);
   screenshot("/Users/bitbyte/Desktop/screenshot/5");
   Thread.sleep(3000);
   
//   
// File file6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// FileUtils.copyFile(file6, new File("runScreenshot.jpg"));
// Thread.sleep(3000);

   
   UiAutomator2Options option17 = new UiAutomator2Options();
   option17.setNativeWebScreenshot(true);
   screenshot("/Users/bitbyte/Desktop/screenshot/6");
 driver.findElement(By.xpath("//*[@text='PENDING DELIVERY']")).click();
 Thread.sleep(3000);
// 
// driver.findElement(By.xpath("//*[@text='While using the app']")).click();  //tab
// Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@text='While using the app']")).click();// tab
//
// driver.findElement(By.xpath("//*[@text='Allow']")).click();
// Thread.sleep(3000);
// driver.findElement(By.xpath("//*[@text='Allow']")).click();
Thread.sleep(3000);
UiAutomator2Options option16 = new UiAutomator2Options();
option16.setNativeWebScreenshot(true);
screenshot("/Users/bitbyte/Desktop/screenshot/6");

// File file7  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// FileUtils.copyFile(file7, new File("InvScreenshot.jpg"));
 //Thread.sleep(30000);
 //driver.findElement(By.className("android.widget.TextView")).click();
 
 
   
  
   
   
     
	 }
	public void screenshot(String path_screenshot) throws IOException{
	    File srcFile=driver.getScreenshotAs(OutputType.FILE);
	    String filename=UUID.randomUUID().toString(); 
	    File targetFile=new File(path_screenshot + filename +".jpg");
	    FileUtils.copyFile(srcFile,targetFile);
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
	
	

}
