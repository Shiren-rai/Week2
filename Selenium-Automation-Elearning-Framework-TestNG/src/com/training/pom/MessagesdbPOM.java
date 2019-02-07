package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessagesdbPOM {
	private WebDriver driver; 
	
	public MessagesdbPOM(WebDriver driver) {
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
	private WebElement Messages1; 
	
	@FindBy(xpath="//*[@id=\"submenu8.0\"]/span[2]")
	private WebElement Messages2; 
	
	@FindBy(name="query(messageBox)")
	private WebElement Messagebox; 
	
	@FindBy(id="newButton")
	private WebElement Submit; 

	@FindBy(id="memberUsername")
	private WebElement Memlogin;
	
	@FindBy(name="message(subject)")
	private WebElement Subject;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td/input")
	private WebElement Submit1;
	
	
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
	
	
	public void clickMessages1() {
		this.Messages1.click(); 
	}
	
	public void clickMessages2() {
		this.Messages2.click(); 
	}
	public void selectMessagebox() {
		WebElement box = driver.findElement(By.name("query(messageBox)"));
		Select type1 = new Select(box);
		box.click();
		type1.selectByIndex(1);
	}
	public void clickSubmit() {
		this.Submit.click(); 
	}
	public void sendMemlogin(String Memlogin) {
		this.Memlogin.clear();
		this.Memlogin.sendKeys(Memlogin);
	}
	public void sendSubject(String Subject) {
		this.Subject.clear();
		this.Subject.sendKeys(Subject);
	}
	public void sendBodytxt(String Bodytxt) {
		List<WebElement> textframe = driver.findElements(By.xpath("//iframe"));
		System.out.println(textframe.size());
		driver.switchTo().frame(0);
		WebElement Editor = driver.switchTo().activeElement();
		new Actions(driver).moveToElement(Editor).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys(Bodytxt); 
		driver.switchTo().defaultContent();
	}
	public void clickSubmit1() {
		this.Submit1.click(); 
}
	public void Alert() {
		   Alert alert = driver.switchTo().alert();
			alert.accept();
		   }
}

