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
import com.training.pom.RemovePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RemoveTest {

	private WebDriver driver;
	private String baseUrl;
	private RemovePOM removePOM;
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
		removePOM = new RemovePOM(driver); 
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
	public void validRemoveTest() {
		removePOM.sendUserName("admin");
		removePOM.sendPassword("12345");
		removePOM.clickLoginBtn(); 
		removePOM.clickMenu();
		removePOM.clickMenu1();
		removePOM.MoveToTrashBtn();
		removePOM.Alert();
		
		
		screenShot.captureScreenShot("Accounts");
		
	}
}


