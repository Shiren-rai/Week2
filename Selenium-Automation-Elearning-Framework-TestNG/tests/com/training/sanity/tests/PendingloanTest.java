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
import com.training.pom.PendingloanPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PendingloanTest {

	private WebDriver driver;
	private String baseUrl;
	private PendingloanPOM pendingloanPOM;
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
		pendingloanPOM = new PendingloanPOM(driver); 
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
	public void validPendingloanTest() throws InterruptedException  {
		pendingloanPOM.sendUserName("Shiren");
		pendingloanPOM.sendPassword("Shiren");
		pendingloanPOM.clickLoginBtn(); 
		pendingloanPOM.clickAccountBtn();
		pendingloanPOM.clickLoansBtn();
		pendingloanPOM.clickViewBtn();
		pendingloanPOM.sendAmount("500");
		pendingloanPOM.clickRepayBtn(); 
		pendingloanPOM.Alert(); 
		Thread.sleep(5000);
		pendingloanPOM.Alert1();
		Thread.sleep(5000);
		pendingloanPOM.clicklogout();
		pendingloanPOM.Alert2();
		pendingloanPOM.sendUserName1("admin");
		pendingloanPOM.sendPassword1("12345");
		pendingloanPOM.clickLoginBtn1();
		pendingloanPOM.sendMemlogin("Shiren");
		pendingloanPOM.clickviewloansBtn(); 
		
		screenShot.captureScreenShot("Accounts");
		screenShot.captureScreenShot("ManageLoans");
		screenShot.captureScreenShot("BackButton");
	}
}


