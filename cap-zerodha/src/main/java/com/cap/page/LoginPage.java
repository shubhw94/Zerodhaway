package com.cap.page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id = "userid")
	private WebElement uid;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement pin;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement pinbtn;

	public LoginPage(WebDriver driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterCred(String usename, String passw) {

		uid.sendKeys(usename);
		pass.sendKeys(passw);

	}

	public void submitususer() {

		loginbtn.click();
	}

	public void enterPincred(String peen) {

		pin.sendKeys(peen);
	}

	public void submitpin() {

		pinbtn.click();
	}

}
