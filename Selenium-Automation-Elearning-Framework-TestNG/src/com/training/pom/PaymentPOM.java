package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPOM {
	private WebDriver driver; 
	
	public PaymentPOM(WebDriver driver) {
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
	private WebElement Memberpay; 
	
	@FindBy(xpath="//*[@id=\"memberUsername\"]")
	private WebElement User; 
	
	@FindBy(xpath="//*[@id=\"amount\"]")
	private WebElement Amount;
	
	@FindBy(xpath="//*[@id=\"description\"]")
	private WebElement Desc;
	
	@FindBy(id="submitButton")
	private WebElement Sub;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[6]/td/input")
	private WebElement Sub1;
	
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
	
	
	public void clickAccount() {
		this.Account.click(); 
	}
	
	public void clickMemberpay() {
		this.Memberpay.click(); 
	}
	
	public void sendUser(String User) {
		this.User.clear(); 
		this.User.sendKeys(User); 
	}
	public void sendAmount(String Amount) {
		this.Amount.clear(); 
		this.Amount.sendKeys(Amount); 
	}
	
	public void sendDesc(String Desc) {
		this.Desc.clear(); 
		this.Desc.sendKeys(Desc); 
	}
	
	public void clickSub() {
		this.Sub.click(); 
	}
	public void clickSub1() {
		this.Sub1.click(); 
	}
	
	public void clickAccountinfo() {
		this.Accountinfo.click(); 
	}
	
	}





