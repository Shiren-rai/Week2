package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchPOM {
	
	private WebDriver driver; 
	
	public SearchPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"submenu2.0\"]/span[2]")
	private WebElement Accountinfo; 
	
	@FindBy(id="filterSelect")
	private WebElement paymenttype; 
	
	@FindBy(id="modeButton")
	private WebElement Advanced; 
	
	@FindBy(id="memberUsername")
	private WebElement memlogin; 
	
	@FindBy(name="query(period).begin")
	private WebElement Fromdt; 
		  
	@FindBy(name="query(period).end")
	private WebElement Todt; 
	
	@FindBy(name="query(description)")
	private WebElement Desc; 
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
	private WebElement SearchBtn; 
	

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
	public void clickAccountinfo() {
		this.Accountinfo.click(); 
	}
	public void selectpaymenttype() {
		WebElement payment = driver.findElement(By.id("filterSelect"));
		Select type1 = new Select(payment);
		payment.click();
		type1.selectByIndex(0);
	}
	public void clickAdvanced() {
		this.Advanced.click(); 
	}
	
		  //@Test(dataProvider = "member-inputs")
		  public void sendmemlogin(String memlogin) {
			this.memlogin.clear();
			this.memlogin.sendKeys(memlogin);
			}
		  public void sendFromdt(String Fromdt) {
				this.Fromdt.clear();
				this.Fromdt.sendKeys(Fromdt);
				}
		  public void sendTodt(String Todt) {
				this.Todt.clear();
				this.Todt.sendKeys(Todt);
				}
		  public void sendDesc(String Desc) {
				this.Desc.clear();
				this.Desc.sendKeys(Desc);
				}
		  public void clickSearchBtn() {
				this.SearchBtn.click(); 
			}
		 
		    }
		  







