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
import com.training.pom.MemberpayPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemberpayTest {

	private WebDriver driver;
	private String baseUrl;
	private MemberpayPOM memberpayPOM;
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
		memberpayPOM = new MemberpayPOM(driver); 
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
	public void validMemberpayTest() throws InterruptedException {
		memberpayPOM.sendUserName("admin");
		memberpayPOM.sendPassword("12345");
		memberpayPOM.clickLoginBtn(); 
		memberpayPOM.clickAccounts();
		memberpayPOM.clickMemberpayment();
		memberpayPOM.sendLogin1("Shiren");
		Thread.sleep(5000);
		memberpayPOM.sendAmount1("500");
		memberpayPOM.selecttranstype();
		memberpayPOM.sendDesc1("welcome");
		memberpayPOM.clickSubmit();
		Thread.sleep(5000);
		memberpayPOM.clickSubmit1();
		Thread.sleep(5000);
		memberpayPOM.clickLogout();
		Thread.sleep(5000);
		memberpayPOM.Alert();
		memberpayPOM.sendUserName1("Shiren");
		memberpayPOM.sendPassword1("Shiren");
		memberpayPOM.clickLoginBtn1(); 
		Thread.sleep(5000);
		memberpayPOM.clickAccounts1();
		Thread.sleep(5000);
		memberpayPOM.clickAccountinfo();
		
		screenShot.captureScreenShot("Accounts");
		screenShot.captureScreenShot("Amount");
		screenShot.captureScreenShot("Logout");
		screenShot.captureScreenShot("Accountinfo");
	}
}


