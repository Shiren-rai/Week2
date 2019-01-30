
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

public class AdvertisementPOM {
	private WebDriver driver; 
	
	
	
	public AdvertisementPOM(WebDriver driver) {
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
	private WebElement MemberLogin;
	
	@FindBy(xpath="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/input")
	private WebElement SubmitBtn;
	
	@FindBy(id="newButton")
	private WebElement SubmitBtn1;
	
	@FindBy(name="ad(title)")
	private WebElement Title;
	
	@FindBy(name="ad(category)")
	private WebElement category;
	
	@FindBy(name="ad(price)")
	private WebElement Price;
	
	@FindBy(name="ad(permanent)")
	private WebElement checkbox;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/div[2]/div/span/span[2]/span/table/tbody/tr[2]/td/iframe")
	private WebElement Desc;
	
	@FindBy(xpath="//*[@id=\"saveButton\"]")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id=\"menu15\"]/span[2]")
	private WebElement logout;
	
	@FindBy(id="cyclosUsername")
	private WebElement userName1; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password1;
	
	@FindBy(xpath="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement loginBtn1;
	
	@FindBy(xpath="//*[@id=\"menu1\"]/span[2]")
	private WebElement Personal;

	@FindBy(xpath="//*[@id=\"submenu1.2\"]/span[2]")
	private WebElement Advertisement;
	
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
	
	public void sendMemberLogin(String MemberLogin) {
		this.MemberLogin.clear(); 
		this.MemberLogin.sendKeys(MemberLogin);
		
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click(); 
	}
	
	public void clickSubmitBtn1() {
		this.SubmitBtn1.click(); 
	}
	
	public void sendTitle(String Title) {
		this.Title.clear();
		this.Title.sendKeys(Title);
	}
	
	
	public void selectcategory() {
		WebElement dropdown = driver.findElement(By.name("ad(category)"));
		Select category1 = new Select(dropdown);
		dropdown.click();
		category1.selectByIndex(1);
	}
	
	public void sendPrice(String Price) {
		this.Price.clear();
		this.Price.sendKeys(Price);
	}
	
	public void clickcheckbox() {
		this.checkbox.click(); 
	}
	
	public void sendDesc(String Desc) {
		List<WebElement> descframe = driver.findElements(By.xpath("//iframe"));
		System.out.println(descframe.size());
		driver.switchTo().frame(0);
		WebElement Editor = driver.switchTo().activeElement();
		new Actions(driver).moveToElement(Editor).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys(Desc);
		//driver.switchTo().window(driver.getWindowHandle()); 
		driver.switchTo().defaultContent();
	}
	
	public void clicksubmit() {
	this.submit.click(); 
	}
	
	public void Alert() {
		   Alert alert = driver.switchTo().alert();
			alert.accept();
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
	public void clickPersonal() {
		this.Personal.click(); 
	}
	public void clickAdvertisement() {
		this.Advertisement.click(); 
	}
}



