package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginLogout extends ProjectSpecificMethods {
	
	
	
	
	
	
	@Test(dataProvider="fetchData")
	public void runLogin(String uname, String pword) {
		
		
		new LoginPage(driver).enterUsername(uname).enterPassword(pword).clickLoginButton();
	}

}
