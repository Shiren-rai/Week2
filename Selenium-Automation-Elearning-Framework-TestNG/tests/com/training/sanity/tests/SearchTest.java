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
import com.training.pom.SearchPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SearchTest {

	private WebDriver driver;
	private String baseUrl;
	private SearchPOM searchPOM;
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
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		searchPOM = new SearchPOM(driver); 
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
	public void validSearchTest() throws InterruptedException {
		searchPOM.sendUserName("Shiren");
		searchPOM.sendPassword("Shiren");
		searchPOM.clickLoginBtn(); 
		searchPOM.clickAccount();
		searchPOM.clickAccountinfo();
		searchPOM.selectpaymenttype();
		searchPOM.clickAdvanced();
	}
		@Test(priority =2, dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
		public void Exceldata(String memlogin, String Fromdt,String Todt,String Desc) {
		
		searchPOM.sendmemlogin(memlogin);
		searchPOM.sendFromdt(Fromdt);
		searchPOM.sendTodt(Todt);
		searchPOM.sendDesc(Desc);
		searchPOM.clickSearchBtn();
		
	
		screenShot.captureScreenShot("BackButton");
	}
}


