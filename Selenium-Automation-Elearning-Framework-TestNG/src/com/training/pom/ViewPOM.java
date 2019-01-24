package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPOM {
	public WebDriver driver; 
	
	
	
	public ViewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"menu1\"]/span[2]")
	private WebElement Personal; 
	
	@FindBy(xpath="//*[@id=\"submenu1.1\"]/span[2]")
	private WebElement Messages;  
	 
	@FindBy(linkText="Loan granted")
	private WebElement details; 
	
	

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
	
	public void clickPersonal() {
		this.Personal.click(); 
	}
	
	
	public void clickMessages() {
		this.Messages.click(); 
	}
	
	public void clickdetails() {
		this.details.click(); 
	}
}
	
