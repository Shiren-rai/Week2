package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.GrantloanPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GrantloanTest {

	private WebDriver driver;
	private String baseUrl;
	private GrantloanPOM grantloanPOM;
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
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		grantloanPOM = new GrantloanPOM(driver); 
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
	public void validGrantloanTest() throws InterruptedException {
		grantloanPOM.sendUserName("admin");
		grantloanPOM.sendPassword("12345");
		grantloanPOM.clickLoginBtn(); 
		grantloanPOM.sendMemberlogin("Shiren");
		Thread.sleep(5000);
		grantloanPOM.clickSubmitBtn(); 
		grantloanPOM.sendAmount("100000");
		grantloanPOM.sendDesc("Homeloan");
		grantloanPOM.clickSubmitBtn1();
		Thread.sleep(5000);
		grantloanPOM.clickSubmitBtn2();
		grantloanPOM.Alert();
		Thread.sleep(5000);
		grantloanPOM.clickViewsubmit(); 
		Thread.sleep(5000);
		grantloanPOM.clicklogout();
		grantloanPOM.Alert1();
		grantloanPOM.sendUserName1("Shiren");
		grantloanPOM.sendPassword1("Shiren");
		grantloanPOM.clickLoginBtn1(); 
		grantloanPOM.clickAccount(); 
		Thread.sleep(5000);
		grantloanPOM.clickLoans();
		
		screenShot.captureScreenShot("Accounts");
		screenShot.captureScreenShot("ManageLoans");
		screenShot.captureScreenShot("BackButton");
	}
}


