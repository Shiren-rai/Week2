package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentdetailsPOM {
	private WebDriver driver; 
	
	public PaymentdetailsPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"submenu3.9\"]/span[2]")
	private WebElement ManageLoans; 
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td/input")
	private WebElement Search; 
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/img")
	private WebElement view; 
	
	@FindBy(id="backButton")
	private WebElement backbtn;

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
	
	public void clickAccountsBtn() {
		this.Accounts.click(); 
	}
	public void clickManageLoansBtn() {
		this.ManageLoans.click(); 
	}
	
	public void clickSearchBtn() {
		this.Search.click(); 
	
	}
	public void clickview() {
		this.view.click(); 
	
	}
	public void clickbackBtn() {
		this.backbtn.click(); 
	}
	
}



