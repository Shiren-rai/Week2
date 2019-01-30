package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MemberpayPOM {
	private WebDriver driver; 
	
	public MemberpayPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"menu3\"]/span[2]")
	private WebElement Accounts; 
	
	@FindBy(xpath="//*[@id=\"submenu3.6\"]/span[2]")
	private WebElement Memberpayment; 
	
	@FindBy(id="memberUsername")
	private WebElement Login1; 
	
	@FindBy(id="amount")
	private WebElement Amount1; 

	@FindBy(name="type")
	private WebElement transtype; 
	
	@FindBy(id="description")
	private WebElement Desc1; 
	
	@FindBy(id="submitButton")
	private WebElement Submit; 
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[6]/td/input")
	private WebElement Submit1;
	
	@FindBy(xpath="//*[@id=\"menu15\"]/span[2]")
	private WebElement Logout; 
	
	@FindBy(id="cyclosUsername")
	private WebElement userName1; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password1;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn1; 
	
	@FindBy(xpath="//*[@id=\"menu2\"]/span[2]")
	private WebElement Accounts1;
	
	@FindBy(xpath="//*[@id=\"submenu2.0\"]/span[2]")
	private WebElement Accountinfo;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickAccounts() {
		this.Accounts.click(); 
	}
	
	public void clickMemberpayment() {
		this.Memberpayment.click(); 
	}
	public void sendLogin1(String Login1) {
		this.Login1.clear(); 
		this.Login1.sendKeys(Login1); 
	}
	public void sendAmount1(String Amount1) {
		this.Amount1.clear(); 
		this.Amount1.sendKeys(Amount1); 
	}
	
	public void selecttranstype() {
		WebElement dropdown = driver.findElement(By.name("type"));
		Select transaction = new Select(dropdown);
		dropdown.click();
		transaction.selectByIndex(1);
	}
	public void sendDesc1(String Desc1) {
		this.Desc1.clear(); 
		this.Desc1.sendKeys(Desc1); 
	}
	
	public void clickSubmit() {
		this.Submit.click(); 
	}
	public void clickSubmit1() {
		this.Submit1.click(); 
	}
	public void clickLogout() {
		this.Logout.click(); 
	}
	public void Alert() {
		   Alert alert = driver.switchTo().alert();
			alert.accept();
		   }
	
	public void sendUserName1(String userName1) {
		this.userName1.clear();
		this.userName1.sendKeys(userName1);
	}
	
	public void sendPassword1(String password1) {
		this.password1.clear(); 
		this.password1.sendKeys(password1); 
	}
	
	public void clickLoginBtn1() {
		this.loginBtn1.click(); 
	}
	public void clickAccounts1() {
		this.Accounts1.click(); 
	}
	public void clickAccountinfo() {
		this.Accountinfo.click(); 
	}
}



