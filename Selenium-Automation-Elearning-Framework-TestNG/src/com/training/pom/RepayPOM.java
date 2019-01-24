package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RepayPOM {
	private WebDriver driver; 
	
	public RepayPOM(WebDriver driver) {
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
	private WebElement Accounts; 
	
	@FindBy(xpath="//*[@id=\"submenu2.3\"]/span[2]")
	private WebElement Loans; 
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/img")
	private WebElement View; 
	
	@FindBy(id="amountText")
	private WebElement Amount;
	
	@FindBy(xpath="//*[@id=\"repayForm\"]/table/tbody/tr[3]/td/input")
	private WebElement RepayBtn; 

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
	public void clickLoansBtn() {
		this.Loans.click(); 
	}
	
	public void clickView() {
		this.View.click(); 
	}
	
	public void sendAmount(String Amount) {
		this.Amount.clear();
		this.Amount.sendKeys(Amount);
	}
	
	public void clickRepayBtn() {
		this.RepayBtn.click(); 
}
	public void Alert() {
		   Alert alert = driver.switchTo().alert();
			alert.accept();
		   }
}


