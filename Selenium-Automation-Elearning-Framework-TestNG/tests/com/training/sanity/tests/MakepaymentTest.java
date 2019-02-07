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
import com.training.pom.MakepaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MakepaymentTest {

	private WebDriver driver;
	private String baseUrl;
	private MakepaymentPOM makepaymentPOM;
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
		makepaymentPOM = new MakepaymentPOM(driver); 
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
	public void validMakepaymentTest() throws InterruptedException {
		makepaymentPOM.sendUserName("manzoor");
		makepaymentPOM.sendPassword("manzoor");
		makepaymentPOM.clickLoginBtn(); 
		makepaymentPOM.clickAccount();
		makepaymentPOM.clickMemberpayment();
		makepaymentPOM.sendLogin("Shiren");
		Thread.sleep(5000);
		makepaymentPOM.sendAmount("5000");
		Thread.sleep(5000);
		makepaymentPOM.sendDesc("birth day gift");
		Thread.sleep(5000);
		makepaymentPOM.clickSubmit();
		makepaymentPOM.clickSubmit1();
		makepaymentPOM.clickLogout();
		makepaymentPOM.Alert();
		makepaymentPOM.sendUserName1("Shiren");
		makepaymentPOM.sendPassword1("Shiren");
		makepaymentPOM.clickLoginBtn1(); 
		makepaymentPOM.clickAccount1();
		makepaymentPOM.clickAccountinfo();
		makepaymentPOM.selectpaymenttype();
		makepaymentPOM.clickview();
		makepaymentPOM.clickBackBtn(); 
		
		
		
		
		screenShot.captureScreenShot("MemeberPayment");
		screenShot.captureScreenShot("AccountInfo");
		screenShot.captureScreenShot("PaymentType");
	}
}


