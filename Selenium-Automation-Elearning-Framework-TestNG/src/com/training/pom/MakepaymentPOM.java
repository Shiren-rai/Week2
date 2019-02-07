package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MakepaymentPOM {
	private WebDriver driver; 
	
	public MakepaymentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"menu2\"]/span[2]")
	private WebElement Account;
	
	@FindBy(xpath="//*[@id=\"submenu2.5\"]/span[2]")
	private WebElement Memberpayment;

	@FindBy(id="memberUsername")
	private WebElement Login;
	
	@FindBy(id="amount")
	private WebElement Amount;
	
	@FindBy(id="description")
	private WebElement Desc;
	

	@FindBy(id="submitButton")
	private WebElement Submit; 
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[6]/td/input")
	private WebElement Submit1; 
	
	@FindBy(xpath="//*[@id=\"menu6\"]/span[2]")
	private WebElement Logout; 
	
	@FindBy(id="cyclosUsername")
	private WebElement userName1; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password1;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn1;
	
	@FindBy(xpath="//*[@id=\"menu2\"]/span[2]")
	private WebElement Account1;
	
	@FindBy(xpath="//*[@id=\"submenu2.0\"]/span[2]")
	private WebElement Accountinfo;
	

	@FindBy(id="filterSelect")
	private WebElement paymenttype;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[5]/img")
	private WebElement view;
	
	@FindBy(id="backButton")
	private WebElement BackBtn;
	
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
	
	public void clickAccount() {
		this.Account.click(); 
	}
	
	public void clickMemberpayment() {
		this.Memberpayment.click(); 
	}
	
	public void sendLogin(String Login) {
		this.Login.clear(); 
		this.Login.sendKeys(Login); 
	}
	
	public void sendAmount(String Amount) {
		this.Amount.clear(); 
		this.Amount.sendKeys(Amount); 
	}
	
	public void sendDesc(String Desc) {
		this.Desc.clear(); 
		this.Desc.sendKeys(Desc); 
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
	public void clickAccount1() {
		this.Account1.click(); 
	}
	public void clickAccountinfo() {
		this.Accountinfo.click(); 
	}
	
	public void selectpaymenttype() {
		WebElement dropdown = driver.findElement(By.id("filterSelect"));
		Select type = new Select(dropdown);
		dropdown.click();
		type.selectByIndex(3);
	}
	public void clickview() {
		this.view.click(); 
	}
	public void clickBackBtn() {
		this.BackBtn.click(); 
	}
	}
	




