package com.pages.classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.ReadProp;

 public class LoginPage {
 
	ReadProp prop = new ReadProp();
	public String user = prop.username();
	public String pass = prop.password();

	@FindBy(name = "login")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(id =  "signin_btn")
	private WebElement signbtn;

	@FindBy(xpath = "//a [text()='Forgot Password?']")
	private WebElement forgotpass;

	@FindBy(xpath = "//span [text()='Sign Up']")
	private WebElement signup;
    public WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	public boolean visiabilityOfusername() {
		boolean b = username.isDisplayed();
		return b;
	}

	public boolean visiabilityOfpassword() {
		boolean c = password.isDisplayed();
		return c;
	}

	public boolean visiabilityOfsignbtn() {
		boolean d = signbtn.isDisplayed();
		return d;
	}

	public boolean visiabilityOfforgotpass() {
		boolean e = forgotpass.isDisplayed();
		return e;
	}

	public boolean visiabilityOfsignup() {
		boolean f = signup.isDisplayed();
		return f;
	}

	public void enterCridentials() {
		username.sendKeys(user);
		password.sendKeys(pass);
	}

	public void clickonSigninbtn() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	wait.until(ExpectedConditions.elementToBeClickable(signbtn));
//	wait.withTimeout(Duration.ofSeconds(2000));
//	wait.until(ExpectedConditions.elementToBeClickable(signbtn));	
	signbtn.click();
	}
	public void clickonSignup() {
		
		signup.click();
	}

}
