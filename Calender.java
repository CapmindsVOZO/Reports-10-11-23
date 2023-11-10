package com.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calender {
	public WebDriver driver;

	@FindBy(xpath = "(//span[@class='e-tbar-btn-text'])[1]")
	private WebElement month;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMonth() {
		return month;
	}

	public Calender(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "//tbody/tr[1]/td[6]")
	private WebElement monthcalender;

	public WebElement getMonthcalender() {
		return monthcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'�')]")
	private WebElement Cancel1;

	public WebElement getCancel1() {
		return Cancel1;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement Visibletext1;

	public WebElement getVisibletext1() {
		return Visibletext1;
	}

	@FindBy(xpath = "//span[contains(text(),'Work Week')]")
	private WebElement Workweek;

	public WebElement getWorkweek() {
		return Workweek;
	}

	@FindBy(xpath = "//tbody/tr[5]/td[2]")
	private WebElement Wwcalender;

	public WebElement getWwcalender() {
		return Wwcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'�')]")
	private WebElement Cancel2;

	public WebElement getCancel2() {
		return Cancel2;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement Visibletext2;

	public WebElement getVisibletext2() {
		return Visibletext2;

	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/span[2]")
	private WebElement week;

	public WebElement getweek() {
		return week;
	}

	@FindBy(xpath = "//tbody/tr[6]/td[5]")
	private WebElement wcalender;

	public WebElement getwcalender() {
		return wcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'�')]")
	private WebElement Cancel3;

	public WebElement getCancel3() {
		return Cancel3;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement Visibletext3;

	public WebElement getVisibletext3() {
		return Visibletext3;

	}

	@FindBy(xpath = "(//span[text()='Day'])[1]")
	private WebElement Day;

	public WebElement getDay() {
		return Day;

	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody[1]/tr[6]/td[1]")
	private WebElement Daycalender;

	public WebElement getDaycalender() {
		return Daycalender;

	}

	@FindBy(xpath = "//span[contains(text(),'�')]")
	private WebElement Cancel4;

	public WebElement getCancel4() {
		return Cancel4;

	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement Visibletext4;

	public WebElement getVisibletext4() {
		return Visibletext4;

	}

	@FindBy(xpath = "(//span[@class='e-tbar-btn-text'])[5]")
	private WebElement CenterCalender;

	public WebElement getCenterCalender() {
		return CenterCalender;

	}

	@FindBy(xpath = "//button[contains(text(),'Today')]")
	private WebElement Today;

	public WebElement getToday() {
		return Today;

	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]/span[1]")
	private WebElement Right;

	public WebElement getRight() {
		return Right;

	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]")
	private WebElement Left;

	public WebElement getLeft() {
		return Left;

	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement Providerselect;

	public WebElement getProviderselect() {
		return Providerselect;

	}
	
	@FindBy(xpath = "//div[@label='padmin']")
	private WebElement selectProvider;

	public WebElement getselectProvider() {
		return selectProvider;

	}
	
	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement FacilitySelect;

	public WebElement getFacilitySelect() {
		return FacilitySelect;

	}
	
	@FindBy(xpath = "//div[@label='Test Facility2']")
	private WebElement SelectFacility;

	public WebElement getSelectFacility() {
		return SelectFacility;

	}
	
	@FindBy(xpath = "//span[contains(text(),'Today')]")
	private WebElement Todayoption;

	public WebElement getTodayoption() {
		return Todayoption;

	}
	
	
	@FindBy(xpath = "(//td[@class='e-work-cells e-alternate-cells'])[2]")
	private WebElement Appointmentoption;

	public WebElement getAppointmentoption() {
		return Appointmentoption;

	}
}
