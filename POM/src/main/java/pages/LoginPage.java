package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	public LoginPage (ChromeDriver driver) {
		this.driver= driver;
	}
	
	
	
	public LoginPage enterUsername(String uname) {
		
		driver.findElementById("txtUsername").sendKeys(uname);
		
		return this;
	}
	
	
	
	public LoginPage enterPassword(String pword) {
		
		driver.findElementById("txtPassword").sendKeys(pword);
		
		return this;
	}
	
	
	public HomePage clickLoginButton() {
		
		driver.findElementById("btnLogin").click();
		
		return new HomePage(driver);
	}
	
	

}
