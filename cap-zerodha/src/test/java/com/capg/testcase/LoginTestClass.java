package com.capg.testcase;

import java.io.IOException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.cap.page.LoginPage;

import utility.BaseTest;

public class LoginTestClass extends BaseTest {
	
@Test
	public void login() throws IOException, InterruptedException {
	
		LoginPage lp = new LoginPage(driver);
		lp.enterCred("UU6132","Shyam@74");
		lp.submitususer();
		WebDriverWait wt = new WebDriverWait(driver,10);
		lp.enterPincred("741333");
		lp.submitpin();
	}
}
