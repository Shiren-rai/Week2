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
	
	@FindBy(xpath="//*[@id=\"menu8\"]/span[2]")
	private WebElement Menu; 
	
	@FindBy(xpath="//*[@id=\"submenu8.0\"]/span[2]")
	private WebElement Menu1; 
	
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
	
	public void clickMenu() {
		this.Menu.click(); 
	}
	
	public void clickMenu1() {
		this.Menu1.click(); 
	}
	
	public void MoveToTrashBtn() {
		this.MoveToTrash.click(); 
		
	}
   public void Alert() {
   Alert alert = driver.switchTo().alert();
	alert.accept();
   }
}
