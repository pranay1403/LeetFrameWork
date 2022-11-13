package com.pages.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ReadProp;

public class SignupPage {
	ReadProp prop =new ReadProp();
	String user=prop.user();
	String pass=prop.passw();
	String confpass=prop.confpass();
	String email1=prop.email();

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password1")
	private WebElement password;

	@FindBy(name = "password2")
	private WebElement confirmpass;

	@FindBy(xpath = "//span[text()='Sign Up']")
	private WebElement signupbtn;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(xpath = "//span[text()='Sign In']")
	private WebElement signin;

	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean visiabilityofUser() {

		boolean v = username.isDisplayed();
		return v;
	}

	public boolean visiabilityofPass() {
		boolean v = password.isDisplayed();
		return v;
	}

	public boolean visiabilityofConfirmpass() {
		boolean v = confirmpass.isDisplayed();
		return v;
	}

	public boolean visiabilityofEmail() {
		boolean v = email.isDisplayed();
		return v;
	}

	public boolean visiabilityofSignupbtn() {
		boolean v = signupbtn.isDisplayed();
		return v;
	}

	public boolean visiabilityofSignIn() {
		boolean v = signin.isDisplayed();
		return v;
	}

	public void enterCridential() {
		
		
		username.sendKeys(user);
		password.sendKeys(pass);
		confirmpass.sendKeys(confpass);
		email.sendKeys(email1);
	}
	public void clickonSignupbtn() throws InterruptedException {
		Thread.sleep(5000);
		signupbtn.click();
	}
}
