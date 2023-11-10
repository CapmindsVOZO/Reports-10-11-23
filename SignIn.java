package com.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	public WebDriver driver;

	@FindBy(xpath  = "//input[@id='normal_login_username']")

	private WebElement username;

	public SignIn(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[2]/div[37]/div[2]/div[2]")

	private WebElement ClickAppoint;

	public WebElement getClickAppoint() {
		return ClickAppoint;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]")

	private WebElement ClickVital;

	public WebElement getClickVital() {
		return ClickVital;
	}
	@FindBy(xpath = "(//input[@id='vitalbpressure1'])[1]")

	private WebElement EnterPressure;

	public WebElement getEnterPressure() {
		return EnterPressure;
	}
	@FindBy(xpath = "(//input[@id='vitalbpressure2'])[1]")

	private WebElement EnterPressure1;

	public WebElement getEnterPressure1() {
		return EnterPressure1;
	}
	@FindBy(xpath = "//input[@id='vitaltemprature']")

	private WebElement vitaltemprature;

	public WebElement getvitaltemprature() {
		return vitaltemprature;
	}
	@FindBy(xpath = "//input[@id='vitalpulse']")

	private WebElement vitalpulse;

	public WebElement getvitalpulse() {
		return vitalpulse;
	}
	@FindBy(xpath = "//input[@id='vitalweight']")

	private WebElement vitalweight;

	public WebElement getvitalweight() {
		return vitalweight;
	}
	@FindBy(xpath = "//input[@id='vitalheight']")

	private WebElement vitalheight;

	public WebElement getvitalheight() {
		return vitalheight;
	}
	@FindBy(xpath = "//input[@id='vitalrespiration']")

	private WebElement vitalrespiration;

	public WebElement getvitalrespiration() {
		return vitalrespiration;
	}
	@FindBy(xpath = "//div[@id='rc-tabs-0-panel-4']//div//div[@class='client-app new_appt_detail_footer modal-footer']//div//button[@type='button'][normalize-space()='Done']")

	private WebElement ClickDone;

	public WebElement getClickDone() {
		return ClickDone;
	}
	@FindBy(xpath = "//div[@id='rc-tabs-0-panel-4']//div//div[@class='client-app new_appt_detail_footer modal-footer']//div//button[@type='button'][normalize-space()='Cancel']")

	private WebElement ClickCancel;

	public WebElement getClickCancel() {
		return ClickCancel;
	}
	@FindBy(xpath = "//div[@id='rc-tabs-0-panel-4']//div//div[@class='client-app new_appt_detail_footer modal-footer']//*[name()='svg']//*[name()='path' and contains(@d,'M19 6v14a2')]")

	private WebElement ClickDelete;

	public WebElement getClickDelete() {
		return ClickDelete;
	}
	
	
	
}
