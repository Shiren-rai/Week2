package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemovePOM {
	private WebDriver driver; 
	
	public RemovePOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form[2]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/img")
	private WebElement MoveToTrash; 


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
	
	public void MoveToTrashBtn() {
		this.MoveToTrash.click(); 
		
	}
   public void Alert() {
   Alert alert = driver.switchTo().alert();
	alert.accept();
   }
}
