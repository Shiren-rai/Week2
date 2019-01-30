package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PendingloanPOM {
	private WebDriver driver; 
	private WebDriverWait wait;
	
	public PendingloanPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"submenu2.3\"]/span[2]")
	private WebElement Loans; 
	   
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/img")
	private WebElement View; 
	
	@FindBy(id="amountText")
	private WebElement Amount;
	
    @FindBy(xpath="//*[@id=\"repayForm\"]/table/tbody/tr[3]/td/input")
	private WebElement RepayBtn;
    

    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/ul/li[7]/span[2]")
	private WebElement logout;
    
    @FindBy(id="cyclosUsername")
	private WebElement userName1; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password1;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn1; 
    
	  @FindBy(id="memberUsername")
		private WebElement Memlogin;
	  
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td/table/tbody/tr[8]/td/fieldset/table/tbody/tr[1]/td[2]/input")
	  private WebElement viewloansBtn; 
	  
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
	
	public void clickAccountBtn() {
		this.Account.click(); 
	}
	
	public void clickLoansBtn() {
		this.Loans.click(); 
	}
	
	public void clickViewBtn() {
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
	public void Alert1() {
		   Alert alert = driver.switchTo().alert();
			alert.accept();
			
		   }
	public void clicklogout() {
		this.logout.click(); 
	}
	public void Alert2() {
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
	public void sendMemlogin(String Memlogin) {
		this.Memlogin.clear();
		this.Memlogin.sendKeys(Memlogin);
	}
	
	public void clickviewloansBtn() {
		this.viewloansBtn.click(); 
	}
	 }
	 



