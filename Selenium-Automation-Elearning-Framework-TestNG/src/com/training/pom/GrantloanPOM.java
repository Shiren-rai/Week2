package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GrantloanPOM {
	private WebDriver driver; 
	
	public GrantloanPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn; 
	
	@FindBy(id="memberUsername")
	private WebElement Memeberlogin;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[8]/td/fieldset/table/tbody/tr[1]/td[4]/input")
	private WebElement SubmitBtn;
	
	@FindBy(id="amount")
	private WebElement Amount;
	
	@FindBy(id="description")
	private WebElement Desc;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[17]/td/input")
	private WebElement SubmitBtn1;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[7]/td/input")
	private WebElement SubmitBtn2;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[8]/td/fieldset/table/tbody/tr[1]/td[2]/input")
	private WebElement Viewsubmit;

	@FindBy(xpath="//*[@id=\"menu15\"]/span[2]")
	private WebElement logout;
	
	@FindBy(id="cyclosUsername")
	private WebElement userName1; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password1;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn1; 
	
	@FindBy(xpath="//*[@id=\"menu2\"]/span[2]")
	private WebElement Account;
	
	@FindBy(xpath="//*[@id=\"submenu2.3\"]/span[2]")
	private WebElement Loans;
	
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
	public void sendMemberlogin(String  Memeberlogin) {
		this. Memeberlogin.clear();
		this. Memeberlogin.sendKeys( Memeberlogin);
	}
	
		public void clickSubmitBtn() {
			this.SubmitBtn.click(); 
		}
		public void sendAmount(String Amount) {
			this.Amount.clear(); 
			this.Amount.sendKeys(Amount); 
		}
	
		public void sendDesc(String Desc) {
			this.Desc.clear(); 
			this.Desc.sendKeys(Desc); 
		}
		public void clickSubmitBtn1() {
			this.SubmitBtn1.click(); 
		}
		public void clickSubmitBtn2() {
		this.SubmitBtn2.click(); 
		}
		public void Alert() {
			   Alert alert = driver.switchTo().alert();
				alert.accept();
			   }
		public void clickViewsubmit() {
			this.Viewsubmit.click(); 
			}
		public void clicklogout() {
			this.logout.click(); 
			}
		
		public void Alert1() {
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
		
		public void clickAccount() {
			this.Account.click(); 
		}
		public void clickLoans() {
			this.Loans.click(); 
		}
	}




