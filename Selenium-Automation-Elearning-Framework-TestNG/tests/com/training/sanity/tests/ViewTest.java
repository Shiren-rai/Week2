package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ViewPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ViewTest {

	private WebDriver driver;
	private String baseUrl;
	private ViewPOM viewPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		viewPOM = new ViewPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void validViewTest() throws InterruptedException {
		viewPOM.sendUserName("manzoor");
		viewPOM.sendPassword("manzoor");
		viewPOM.clickLoginBtn(); 
		viewPOM.clickPersonal();
		viewPOM.clickMessages();
		Thread.sleep(2000);
		viewPOM.clickdetails();
		
		
		screenShot.captureScreenShot("Personal");
		screenShot.captureScreenShot("Messages");
		
	}
}


