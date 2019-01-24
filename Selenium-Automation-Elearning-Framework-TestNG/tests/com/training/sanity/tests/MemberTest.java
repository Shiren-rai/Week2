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
import com.training.pom.MemberPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemberTest {

	private WebDriver driver;
	private String baseUrl;
	private MemberPOM memberPOM;
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
		memberPOM = new MemberPOM(driver); 
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
	public void validMemberTest() throws InterruptedException {
		memberPOM.sendUserName("manzoor");
		memberPOM.sendPassword("manzoor");
		memberPOM.clickLoginBtn(); 
		memberPOM.clickAccountBtn();
		memberPOM.clickMemberPayBtn();
		memberPOM.sendLogin("Soumita123");
		Thread.sleep(5000);
		memberPOM.sendAmount("2000");
		memberPOM.sendDesc("birthday gift");
		memberPOM.clickSubmitBtn();
		memberPOM.clickSubmit1Btn();
		
		screenShot.captureScreenShot("Submit");
		
		
	}
}


