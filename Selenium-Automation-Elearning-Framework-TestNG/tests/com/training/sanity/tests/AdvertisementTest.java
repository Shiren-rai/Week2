
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdvertisementPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AdvertisementTest {

	private WebDriver driver;
	private String baseUrl;
	private AdvertisementPOM advertisementPOM;
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
		advertisementPOM = new AdvertisementPOM(driver); 
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
	public void validAdvertisementTest() throws InterruptedException {
		advertisementPOM.sendUserName("admin");
		advertisementPOM.sendPassword("12345");
		advertisementPOM.clickLoginBtn(); 
		advertisementPOM.sendMemberLogin("Shiren");
		advertisementPOM.clickSubmitBtn();
		advertisementPOM.clickSubmitBtn1();
		advertisementPOM.sendTitle("new offer");
		advertisementPOM.sendPrice("7");
		advertisementPOM.clickcheckbox();
		advertisementPOM.selectcategory();
		Thread.sleep(5000);
		advertisementPOM.sendDesc("new offer for member");
		Thread.sleep(5000);
		advertisementPOM.clicksubmit();
		advertisementPOM.Alert();
		advertisementPOM.clicklogout();
		Thread.sleep(5000);
		advertisementPOM.Alert1();
		Thread.sleep(5000);
		advertisementPOM.sendUserName1("Shiren");
		advertisementPOM.sendPassword1("Shiren");
		advertisementPOM.clickLoginBtn1(); 
		advertisementPOM.clickPersonal(); 
		advertisementPOM.clickAdvertisement(); 
		
		
		
		
		
	
		screenShot.captureScreenShot("Member");
		screenShot.captureScreenShot("Advertisements");
	}
}


