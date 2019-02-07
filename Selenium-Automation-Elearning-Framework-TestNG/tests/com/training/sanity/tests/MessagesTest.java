package com.training.sanity.tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.MessagesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MessagesTest {

	private WebDriver driver;
	private String baseUrl;
	private MessagesPOM messagesPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		messagesPOM = new MessagesPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	@Test(priority =1)
	public void validMessagesTest() throws InterruptedException {
		messagesPOM.sendUserName("admin");
		messagesPOM.sendPassword("12345");
		messagesPOM.clickLoginBtn(); 
		messagesPOM.clickMessages(); 
		messagesPOM.clickMessages1(); 
		messagesPOM.selectMessagebox(); 
		 
		
	}
		@Test(priority =2, dataProvider = "excel-inputs2", dataProviderClass = LoginDataProviders.class)
		public void Exceldata(String Memlogin, String Subject,String Bodytxt) throws InterruptedException {
		messagesPOM.clickSubmit(); 
		messagesPOM.sendMemlogin(Memlogin);
		Thread.sleep(5000);
		messagesPOM.sendSubject(Subject);
		messagesPOM.sendBodytxt(Bodytxt);
		messagesPOM.clickSubmitBtn();
		Thread.sleep(5000);
		messagesPOM.Alert();
		}
		
		
		
	
		
	}



