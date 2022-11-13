package com.pages.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span [text()='Sign in']")
	private WebElement signinbtn;
	
	@FindBy(xpath = "//span [@class='premium']")
	private WebElement premiumbtn;
	
	@FindBy(xpath = "//span [text()='Developer']")
	private WebElement developer;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div/div/div[1]/div/div/span")
	private WebElement logo;
	
	@FindBy(xpath = "//a[@class='btn sign-up-btn hover-panel round']")
	private WebElement createNewAcc;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonSigninbtn() {
		signinbtn.click();
	}
	public boolean visiabilityofsigninbtn() {
		boolean vs=signinbtn.isDisplayed();
		return vs;
	}
	public boolean visiabilityofCreatenewAcc() {
		boolean vd=createNewAcc.isDisplayed();
		return vd;
	}
	public void clickonCreateNewAccbtn() {
		createNewAcc.click();
	}
}
