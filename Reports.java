package com.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {

	public WebDriver driver;

	public Reports(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement ClickReportsModule;

	public WebElement getClickReportsModule() {
		return ClickReportsModule;
	}

	@FindBy(xpath = "(//a[normalize-space()='Reports'])[1]")
	private WebElement ClickReportmod;

	public WebElement getClickReportmod() {
		return ClickReportmod;
	}

	@FindBy(xpath = "(//a[normalize-space()='Patient Report'])[1]")
	private WebElement Clickpatientrep;

	public WebElement getClickpatientrep() {

		return Clickpatientrep;
	}

             ////////BILLING SUMMARY////////

	@FindBy(xpath = "(//a[normalize-space()='Billing Summary'])[1]")
	private WebElement billsu;

	public WebElement getbillsu() {

		return billsu;
	}

	@FindBy(xpath = "(//span[normalize-space()='Month'])[1]")
	private WebElement climo;

	public WebElement getclimo() {

		return climo;
	}

	@FindBy(xpath = "(//span[normalize-space()='Quarter'])[1]")
	private WebElement cliqu;

	public WebElement getcliqu() {

		return cliqu;
	}

	@FindBy(xpath = "(//span[normalize-space()='Year'])[1]")
	private WebElement cliyea;

	public WebElement getcliyea() {

		return cliyea;
	}

	    /////// //// ////////// payment analysis    /////////////
	
	@FindBy(xpath = "(//a[normalize-space()='Payment Analysis'])[1]")
	private WebElement payana;

	public WebElement getpayana() {

		return payana;
	}

	@FindBy(xpath = "//input[@id='search-btn-hover']")
	private WebElement payanasea;

	public WebElement getpayanasea() {

		return payanasea;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Janan19 et18']")
	private WebElement selepa;

	public WebElement getselepa() {

		return selepa;
	}

	@FindBy(xpath = "//div[@class='daysheet-snd-layer rep-flex-align-center backgr-chng']//div[2]//select[1]")
	private WebElement seleoff;

	public WebElement getseleoff() {

		return seleoff;
	}

	@FindBy(xpath = "//option[@value='1']")
	private WebElement seleoff1;

	public WebElement getseleoff1() {

		return seleoff1;
	}

	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
	private WebElement starda;

	public WebElement getstarda() {

		return starda;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")
	private WebElement enda;

	public WebElement getenda() {

		return enda;
	}

	@FindBy(xpath = "//option[@value='PosDate']")
	private WebElement posdat;

	public WebElement getposdat() {

		return posdat;
	}

	@FindBy(xpath = "//div[@class='daysheet-snd-layer rep-flex-align-center backgr-chng']//div[2]//select[1]")
	private WebElement posdat1;

	public WebElement getposdat1() {

		return posdat1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement cliupp;

	public WebElement getcliupp() {

		return cliupp;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement clicre;

	public WebElement getclicre() {

		return clicre;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-4'])[1]")
	private WebElement clich;

	public WebElement getclich() {

		return clich;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")
	private WebElement clipatpay;

	public WebElement getclipatpay() {

		return clipatpay;
	}

            /////////////PRODUCT PROCEDURE ////////////////

	@FindBy(xpath = "(//input[@placeholder='Code (CPT/HCPSCS/Custom)'])[1]")
	private WebElement cptco;

	public WebElement getcptco() {

		return cptco;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement selecpt;

	public WebElement getselecpt() {

		return selecpt;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
	private WebElement fromda;

	public WebElement getfromda() {

		return fromda;
	}

	@FindBy(xpath = "(//div[normalize-space()='22'])[1]")
	private WebElement selfromda;

	public WebElement getselfromda() {

		return selfromda;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")
	private WebElement seltoda;

	public WebElement getseltoda() {

		return seltoda;
	}

	@FindBy(xpath = "(//div[contains(text(),'22')])[2]")
	private WebElement seltodats;

	public WebElement getseltodats() {

		return seltodats;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement clupd;

	public WebElement getclupd() {

		return clupd;
	}

                  //////////////////////  Remittance Report  ///////////////////////

	@FindBy(xpath = "//a[normalize-space()='Remittance Report']")
	private WebElement ClickRemittence;

	public WebElement getClickRemittence() {

		return ClickRemittence;
	}

	@FindBy(xpath = "//input[@placeholder='Trace#']")
	private WebElement EnterTrace;

	public WebElement getEnterTrace() {

		return EnterTrace;
	}

	@FindBy(xpath = "//div[@value='2']")
	private WebElement SelectTrace;

	public WebElement getSelectTrace() {

		return SelectTrace;
	}

	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement ClickFromDate;

	public WebElement getClickFromDate() {

		return ClickFromDate;
	}

	@FindBy(xpath = "//td[contains(@title,'2022-08-31')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='31']")
	private WebElement SelectFromDate;

	public WebElement getSelectFromDate() {

		return SelectFromDate;
	}

	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement ClickToDate;

	public WebElement getClickToDate() {

		return ClickToDate;
	}

	@FindBy(xpath = "//td[contains(@class,'ant-picker-cell ant-picker-cell-start ant-picker-cell-in-view ant-picker-cell-today')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='1']")
	private WebElement SelectToDate;

	public WebElement getSelectToDate() {

		return SelectToDate;
	}

	@FindBy(xpath = "//input[@placeholder='Patient']")
	private WebElement EnterPatient;

	public WebElement getEnterPatient() {

		return EnterPatient;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Saran sad Test']")
	private WebElement Selectpatient1;

	public WebElement getSelectpatient1() {

		return Selectpatient1;
	}
	@FindBy(xpath = "//input[@placeholder='Insurance']")
	private WebElement EnterInsurance;

	public WebElement getEnterInsurance() {

		return EnterInsurance;
	}

	@FindBy(xpath = "//div[contains(text(),'Optum Maryland')]")
	private WebElement SelectOptumMaryland;

	public WebElement getSelectOptumMaryland() {

		return SelectOptumMaryland;
	}

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement ClickSearch;

	public WebElement getClickSearch() {

		return ClickSearch;
	}

	@FindBy(xpath = "//button[contains(text(),'Export To CSV')]")
	private WebElement ClickExportToCSV;

	public WebElement getClickExportToCSV() {

		return ClickExportToCSV;
	}

	@FindBy(xpath = "//button[normalize-space()='Print']")
	private WebElement ClickPrint;

	public WebElement getClickPrint() {

		return ClickPrint;
	}

	@FindBy(xpath = "")
	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {

		return ClickCancel1;
	}

            //////////////////APPOINTMENT REPORT

	@FindBy(xpath = "//a[normalize-space()='Reports']")
	private WebElement ClickReport;

	public WebElement getClickReport() {
		return ClickReport;
	}

	@FindBy(xpath = "//a[normalize-space()='Appointment Report']")
	private WebElement ClickAppointmentReport;

	public WebElement getClickAppointmentReport() {
		return ClickAppointmentReport;
	}

	@FindBy(xpath = "(//button[text()='Check All'])[2]")
	private WebElement ClickCheckAll1;

	public WebElement getClickCheckAll() {
		return ClickCheckAll1;
	}

	@FindBy(xpath = "//button[text()='UncheckAll']")
	private WebElement ClickUnCheckAll1;

	public WebElement getClickUnCheckAll() {
		return ClickUnCheckAll1;
	}

	@FindBy(xpath = "(//button[text()='Check All'])[1]")
	private WebElement ClickCheckAll;

	public WebElement getClickCheckAll1() {
		return ClickCheckAll;
	}

	@FindBy(xpath = "(//button[text()='Uncheck All'])[1]")
	private WebElement ClickUnCheckAll;

	public WebElement getClickUnCheckAll1() {
		return ClickUnCheckAll;
	}

	@FindBy(xpath = "//input[@id='search-btn-hover']")
	private WebElement SearchPatientName;

	public WebElement getSearchPatientName() {
		return SearchPatientName;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Janan19 et18']")
	private WebElement selectNmae;

	public WebElement getselectNmae() {
		return selectNmae;
	}

	@FindBy(xpath = "//select[@class='appt_rep_sel_ofc_alt form-control']")
	private WebElement ClickAllOffice;

	public WebElement getClickAllOffice() {
		return ClickAllOffice;
	}

	@FindBy(xpath = "//option[@id='rpt_aptrpt-opt_ofcs1']")
	private WebElement Selectoemr;

	public WebElement getSelectoemr() {
		return Selectoemr;
	}

	@FindBy(xpath = "(//input[@placeholder='From-'])[1]")
	private WebElement clickFromdate;

	public WebElement getclickFromdate() {
		return clickFromdate;
	}

	@FindBy(xpath = "//input[@value=\"2022-05-12\"]")
	private WebElement selectdate8;

	public WebElement getselectdatenumber8() {
		return selectdate8;
	}

	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement clickEndDate;

	public WebElement getclickEndDate() {
		return clickEndDate;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[3]/div[1]")
	private WebElement selectdate15;

	public WebElement getselectdate15() {
		return selectdate15;
	}

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement clickupdatebutton;

	public WebElement getclickupdatebutton() {
		return clickupdatebutton;
	}

	@FindBy(xpath = "//input[@name='ShowICD9']")
	private WebElement clickRadioButton;

	public WebElement getclickRadioButton() {
		return clickRadioButton;
	}

               //////REMAINDER REPORT ///////

	@FindBy(xpath = "//a[contains(text(),'Reminder Report')]")
	private WebElement remre;

	public WebElement getremre() {

		return remre;
	}

	@FindBy(xpath = "//input[@id='search-btn-hover']")
	private WebElement remresep;

	public WebElement getremresep() {

		return remresep;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Janan19 et18']")
	private WebElement selectremresep;

	public WebElement getselectremresep() {

		return selectremresep;
	}
	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
	private WebElement remrefrom;

	public WebElement getremrefrom() {

		return remrefrom;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")
	private WebElement remreselto;

	public WebElement getremreselto() {

		return remreselto;
	}

	@FindBy(xpath = "(//span[normalize-space()='Day'])[1]")
	private WebElement remreday;

	public WebElement getremreday() {

		return remreday;
	}

	@FindBy(xpath = "(//span[normalize-space()='Week'])[1]")
	private WebElement remreweek;

	public WebElement getremreweek() {

		return remreweek;
	}

	@FindBy(xpath = "(//span[normalize-space()='Month'])[1]")
	private WebElement remremon;

	public WebElement getremremon() {

		return remremon;
	}

	@FindBy(xpath = "(//span[normalize-space()='Year'])[1]")
	private WebElement remreye;

	public WebElement getremreye() {

		return remreye;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement cliup;

	public WebElement getcliup() {

		return cliup;
	}

	@FindBy(xpath = "(//a[normalize-space()='Product & Procedures'])[1]")
	private WebElement proproc;

	public WebElement getproproc() {

		return proproc;
	}
                /////////// PATIENT REPORT////////////

	@FindBy(xpath = "//input[@id='rpt_ptRpt-inp_frdt']")
	private WebElement fromcalenderpr;

	public WebElement getfromcalenderpr() {

		return fromcalenderpr;
	}

	@FindBy(xpath = "//td[@title='2022-03-01']//div[@class='ant-picker-cell-inner'][normalize-space()='1']")
	private WebElement clfromcalenderpr;

	public WebElement getclfromcalenderpr() {

		return clfromcalenderpr;
	}

	@FindBy(xpath = "//input[@id='rpt_ptRpt-inp_todt']")
	private WebElement tocalenderpr;

	public WebElement gettocalenderpr() {

		return tocalenderpr;
	}

	@FindBy(linkText = "Today")
	private WebElement cltocalenderpr;

	public WebElement getcltocalenderpr() {

		return cltocalenderpr;
	}

	@FindBy(xpath = "//input[@class='ant-input patient-age pat-rep-age-box']")
	private WebElement seleage;

	public WebElement getseleage() {

		return seleage;
	}

	@FindBy(xpath = "(//select[@name='sex'])[1]")
	private WebElement selectsex;

	public WebElement getselectsex() {

		return selectsex;
	}

	@FindBy(xpath = "//div[contains(text(),'Male')]")
	private WebElement selesex;

	public WebElement getselesex() {

		return selesex;
	}

	@FindBy(xpath = "(//select[@name='race'])[1]")
	private WebElement selerace;

	public WebElement getselerace() {

		return selerace;
	}

	@FindBy(xpath = "(//div[contains(text(),'American Indian or Alaska Native')])[1]")
	private WebElement selectrace;

	public WebElement getselectrace() {

		return selectrace;
	}

	@FindBy(xpath = "(//select[@name='ethnicity'])[1]")
	private WebElement selectethn;

	public WebElement getselectethn() {

		return selectethn;
	}

	@FindBy(xpath = "//div[contains(text(),'Hispanic or Latino')]")
	private WebElement clickethn;

	public WebElement getclickethn() {

		return clickethn;
	}

	@FindBy(xpath = "//div[@class='autoCompleteSearch SearchUIPatRep p-t-0']//input[@id='search-btn-hover']")
	private WebElement searchmedi;

	public WebElement getsearchmedi() {

		return searchmedi;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Penicillin V potassium (Oral Pill)']")
	private WebElement selemedi;

	public WebElement getselemedi() {

		return selemedi;
	}

	@FindBy(xpath = "//div[@class='autoCompleteSearch p-t-0 SearchUIPatRep']//div[@class='ant-select ant-select-auto-complete remainderWidthSheet ant-select-single ant-select-show-search']//input[@id='search-btn-hover']")
	private WebElement searchallergy;

	public WebElement getsearchallergy() {

		return searchallergy;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='PROAIR (Inhalant)']")
	private WebElement selealler;

	public WebElement getselealler() {

		return selealler;
	}
	@FindBy(xpath = "//select[@id='adPro_opt-icdVers']")
	private WebElement Clickicd;

	public WebElement getClickicd() {

		return Clickicd;
	}
	
	@FindBy(xpath = "//option[contains(text(),'ICD10')]")
	private WebElement selecticd;

	public WebElement getselecticd() {

		return selecticd;
	}

	@FindBy(xpath = "//div[@class='m-l-20 _pat-rep-tab pat-report-search pat-rep-serch-res-box']//div[@class='autoCompleteSearch p-t-0 SearchUIPatRep']//input[@id='search-btn-hover']")
	private WebElement searchproblem;

	public WebElement getsearchproblem() {

		return searchproblem;
	}

	@FindBy(xpath = "//div[contains(@class,'ant-select-item-option-content')][contains(text(),'002.1 --')]")
	private WebElement selepro;

	public WebElement getselepro() {

		return selepro;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	private WebElement clicksearch;

	public WebElement getclicksearch() {

		return clicksearch;
	}

	@FindBy(xpath = "(//a[normalize-space()='Product Procedures'])[1]")
	private WebElement procor;

	public WebElement getprocor() {

		return procor;
	}

            ///////////TeleHealth Report

	@FindBy(xpath = "//a[contains(text(),'Telehealth Report')]")
	private WebElement clickTeleHealthReport;

	public WebElement getclickTeleHealthReport() {
		return clickTeleHealthReport;
	}

	@FindBy(xpath = "//button[contains(text(),'Check All')]")
	private WebElement clickCheckAll;

	public WebElement getclickCheckAll() {
		return clickCheckAll;
	}

	@FindBy(xpath = "//button[contains(text(),'UncheckAll')]")
	private WebElement clickUnCheckAll;

	public WebElement getclickUnCheckAll() {
		return clickUnCheckAll;
	}

	@FindBy(xpath = "//input[@name='Occured']")
	private WebElement clickOccuredRadioButton;

	public WebElement getclickOccuredRadioButton() {
		return clickOccuredRadioButton;
	}

	@FindBy(xpath = "//input[@name='DidNotOccured']")
	private WebElement clickDidnotOccuredRadioButton;

	public WebElement getclickDidnotOccuredRadioButton() {
		return clickDidnotOccuredRadioButton;
	}

	@FindBy(xpath = "(//input[@placeholder='Patient Search'])[2]")
	private WebElement SearchThePatientName;

	public WebElement getSearchThePatientName1() {
		return SearchThePatientName;
	}

	@FindBy(xpath = "//div[contains(text(),'gunad')]")
	private WebElement selectPatientname;

	public WebElement getselectPatientname() {
		return selectPatientname;
	}

	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement ClickOfficeOption;

	public WebElement getClickOfficeOption() {
		return ClickOfficeOption;
	}

	@FindBy(xpath = "//option[@value='3']")
	private WebElement SelectclickTestFacilityPhar;

	public WebElement getSelectclickTestFacilityPhar() {
		return SelectclickTestFacilityPhar;
	}

	@FindBy(xpath = "//input[@placeholder='Start date']")
	private WebElement clickStartDate;

	public WebElement getclickStartDate() {
		return clickStartDate;
	}

	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='18'])[1]")
	private WebElement SelectStartDate16;

	public WebElement getSelectStartDate16() {
		return SelectStartDate16;
	}

	@FindBy(xpath = "//td[@title='2022-06-14']//div[@class='ant-picker-cell-inner'][normalize-space()='14']")
	private WebElement clickEndDateq;

	public WebElement getclickEndDateq() {
		return clickEndDateq;
	}

	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/div[1]")
	private WebElement SelectEndDate16;

	public WebElement getSelectEndDateq() {
		return SelectStartDate16;
	}

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement clickUpdateFilterOption;

	public WebElement getclickUpdateFilterOption() {
		return clickUpdateFilterOption;
	}

	@FindBy(xpath = "//button[contains(text(),'Export To File')]")
	private WebElement ClickExportToFile;

	public WebElement getClickExportToFile() {
		return ClickExportToFile;
	}

	@FindBy(xpath = "//button[contains(text(),'Load more...')]")
	private WebElement ClickLoadmore;

	public WebElement getClickLoadmore() {
		return ClickLoadmore;
	}

        ///////////////////// Productivity Report ///////////////

	@FindBy(xpath = "//a[@id='rpt_nav-lnk_prRpt']")
	private WebElement ClickProductivityReport;

	public WebElement getClickProductivityReport() {
		return ClickProductivityReport;
	}

	@FindBy(xpath = "//input[@placeholder='Start date']")
	private WebElement ClickTheFromDate;

	public WebElement getClickTheFromDate() {
		return ClickTheFromDate;
	}

	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='16'])[1]")
	private WebElement SelectTheFromDate16;

	public WebElement getSelectTheFromDate16() {
		return SelectTheFromDate16;
	}

	@FindBy(xpath = "//input[@placeholder='End date']")
	private WebElement clickTheEndDate;

	public WebElement getclickTheEndDate() {
		return clickTheEndDate;
	}

	@FindBy(xpath = "(//div[contains(text(),'31')])[2]")
	private WebElement selectTheEndDate31;

	public WebElement getselectTheEndDate31() {
		return selectTheEndDate31;
	}

	@FindBy(xpath = "//select[@id='b-l-34']")
	private WebElement ClickProvider;

	public WebElement getClickProvider() {
		return ClickProvider;
	}

	@FindBy(xpath = "//option[@value='1']")
	private WebElement SelectProvider;

	public WebElement getSelectProvider() {
		return SelectProvider;
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement ClickCheckBox;

	public WebElement getClickCheckBox() {
		return ClickCheckBox;
	}

	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement ClickUpdateButton;

	public WebElement getClickUpdateButton() {
		return ClickUpdateButton;
	}

	@FindBy(xpath = "//button[@id='load-data']")
	private WebElement ClickLoadMore;

	public WebElement getClickLoadMore() {
		return ClickLoadMore;
	}

       //////////////Outgoing Prescription   ///////////////////////  

	@FindBy(xpath = "//a[normalize-space()='Outgoing Prescriptions']")
	private WebElement ClickOutgoingPrescription;

	public WebElement getClickOutgoingPrescription() {
		return ClickOutgoingPrescription;
	}

	@FindBy(xpath = "//div[@class='appt-block-main schedule-comp1 vozo_margin']//div//div[1]//div[1]//div[1]//span[1]//input[1]")
	private WebElement EnterPatientName;

	public WebElement getEnterPatientName() {
		return EnterPatientName;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Janan19 et18']")
	private WebElement SelectPatientName;

	public WebElement getSelectPatientName() {
		return SelectPatientName;
	}

	@FindBy(xpath = "//div[@class='d-flex rep-scnd-layer rep-flex-align-center weno-erx-btn-disbled']//div[2]//div[1]//div[1]//span[1]//input[1]")
	private WebElement EnterDescription;

	public WebElement getEnterDescription() {
		return EnterDescription;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement SelectDescription;

	public WebElement getSelectDescription() {
		return SelectDescription;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/input[1]")
	private WebElement EnterPharmacy;

	public WebElement getEnterPharmacy() {
		return EnterPharmacy;
	}

	@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']//div[@class='ant-select-item-option-content'][normalize-space()='ALBERTSONS LLC']")
	private WebElement SlectPharmacy;

	public WebElement getSlectPharmacy() {
		return SlectPharmacy;
	}

	@FindBy(xpath = "//input[@placeholder='From Date']")
	private WebElement ClickStartDate;

	public WebElement getClickStartDate() {
		return ClickStartDate;
	}

	@FindBy(xpath = "(//div[contains(text(),'24')])[2]")
	private WebElement SelectStartDate;

	public WebElement getSelectStartDate() {
		return SelectStartDate;
	}

	@FindBy(xpath = "//div[@class='ant-picker date-input ant-picker-focused']")
	private WebElement ClickEndtDate;

	public WebElement getClickEndtDate() {
		return ClickEndtDate;
	}

	@FindBy(xpath = "(//div[contains(text(),'31')])[2]")
	private WebElement SelectEndtDate;

	public WebElement getSelectEndtDate() {
		return SelectEndtDate;
	}

	@FindBy(xpath = "//button[normalize-space()='Update Filter']")
	private WebElement ClickFilter;

	public WebElement getClickFilter() {
		return ClickFilter;
	}

	////////////////////// User Report  /////////////////////////
	
	@FindBy(xpath = "//a[@id='rpt_nav-lnk_usrRpt']")
	private WebElement ClickUserreport;

	public WebElement getClickUserreport() {
		return ClickUserreport;
	}

	@FindBy(xpath = "//input[@id='search-btn-hover']")
	private WebElement EnterSearchUsername;

	public WebElement getEnterSearchUsername() {
		return EnterSearchUsername;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
	private WebElement SelectSearchUsername;

	public WebElement getSelectSearchUsername() {
		return SelectSearchUsername;
	}

	@FindBy(xpath = "//input[@id='inactivedoctor']")
	private WebElement clickInactiveRadioButton;

	public WebElement getclickInactiveRadioButton() {
		return clickInactiveRadioButton;
	}

	@FindBy(xpath = "(//button[text()='Search'])[1]")
	private WebElement clickSearchButton;

	public WebElement getclickSearchButton() {
		return clickSearchButton;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement clickStaffButton;

	public WebElement getclickStaffButton() {
		return clickStaffButton;
	}

	@FindBy(xpath = "//div[@class='d-flex p-t-20 p-b-20']//input[@id='search-btn-hover']")
	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}
	@FindBy(xpath = "//div[text()='Nurse h']")
	private WebElement selectstaff;

	public WebElement getselectstaff() {
		return selectstaff;
	}
	@FindBy(xpath = "//input[@id='inactivestaff']")
	private WebElement ClickInactive;

	public WebElement getClickInactive() {
		return ClickInactive;
	}

	@FindBy(xpath = "(//button[text()='Search'])[2]")
	private WebElement clickSearchButton1;

	public WebElement getclickSearchButton1() {
		return clickSearchButton1;
	}

             /////////////  Invoices  /////////////////

	@FindBy(xpath = "//a[normalize-space()='Invoices']")
	private WebElement ClickInvoices;

	public WebElement getClickInvoices() {
		return ClickInvoices;
	}

	@FindBy(xpath = "//div[@class='autoComplete34Search UIinvoicePatSearch']//input[@id='search-btn-hover']")
	private WebElement EnterPatientName1;

	public WebElement getEnterPatientName1() {
		return EnterPatientName1;
	}

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Janan19 et18']")
	private WebElement SelectPatientName1;

	public WebElement getSelectPatientName1() {
		return SelectPatientName1;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/select[1]")
	private WebElement ClickInvoicesStatus;

	public WebElement getClickInvoicesStatus() {
		return ClickInvoicesStatus;
	}

	@FindBy(xpath = "//option[@value='Paid']")
	private WebElement selectPaid;

	public WebElement getselectPaid() {
		return selectPaid;
	}

	@FindBy(xpath = "//div[@class='autoComplete34Search UIinvoiceIdSearch m-l-20']//input[@id='search-btn-hover']")
	private WebElement EnterInvoiceid;

	public WebElement getEnterInvoiceid() {
		return EnterInvoiceid;
	}

	@FindBy(xpath = "(//div[text()='vozoinv#2'])[2]")
	private WebElement selectInvoiceId;

	public WebElement getselectInvoiceId() {
		return selectInvoiceId;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Start date')]")
	private WebElement EnterStartdate;

	public WebElement getEnterStartdate() {
		return EnterStartdate;
	}
	@FindBy(xpath = "//td[@title='2023-06-06']//div[@class='ant-picker-cell-inner'][normalize-space()='6']")
	private WebElement ClickFrv;

	public WebElement getClickFrv() {
		return ClickFrv;
	}

	@FindBy(xpath = "(//div[contains(text(),'8')])[7]")
	private WebElement EnterEnddate;

	public WebElement getEnterEnddate() {
		return EnterEnddate;
	}
	@FindBy(xpath = "//td[@title='2023-07-25']")
	private WebElement EnterEnddate1;

	public WebElement getEnterEnddate1() {
		return EnterEnddate1;
	}


	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement clickSearch;

	public WebElement getclickSearch() {
		return clickSearch;
	}
	
	@FindBy(xpath = "//input[@id='allDrop']")
	private WebElement ClickAllButton;

	public WebElement getClickAllButton() {
		return ClickAllButton;
	}
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	private WebElement ClickAllButton1;

	public WebElement getClickAllButton1() {
		return ClickAllButton1;
	}
	@FindBy(xpath = "//div[contains(text(),'All')]")
	private WebElement ClickAll;

	public WebElement getClickAll() {
		return ClickAll;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Paid']")
	private WebElement ClickPaid;

	public WebElement getClickPaid() {
		return ClickPaid;
	}
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='PartialPaid']")
	private WebElement ClickPartialPaid;

	public WebElement getClickPartialPaid() {
		return ClickPartialPaid;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'UnPaid')])[2]")
	private WebElement ClickUnPaid;

	public WebElement getClickUnPaid() {
		return ClickUnPaid;
	}
	@FindBy(xpath = "//input[@id='allNoteDrop']")
	private WebElement ClickAllnoteDrop;

	public WebElement getClickAllnoteDrop() {
		return ClickAllnoteDrop;
	}
	@FindBy(xpath = "//div[contains(text(),'All Note')]")
	private WebElement ClickAllnote;

	public WebElement getClickAllnote() {
		return ClickAllnote;
	}
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='No Note']")
	private WebElement ClickNoNote;

	public WebElement getClickNoNote() {
		return ClickNoNote;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Unlocked']")
	private WebElement ClickUnLocked;

	public WebElement getClickUnLocked() {
		return ClickUnLocked;
	}
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Supervision']")
	private WebElement ClickSupervision;

	public WebElement getClickSupervision() {
		return ClickSupervision;
	}
	
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='UnInvoiced/UnBilled']")
	private WebElement ClickUnInvoiced;

	public WebElement getClickUnInvoiced() {
		return ClickUnInvoiced;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Locked']")
	private WebElement ClickLocked;

	public WebElement getClickLocked() {
		return ClickLocked;
	}
	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	private WebElement ClickClientResponsDrop;

	public WebElement getClickClientResponsDrop() {
		return ClickClientResponsDrop;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Client Responsibility']")
	private WebElement ClickClientRespons;

	public WebElement getClickClientRespons() {
		return ClickClientRespons;
	}
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Insurance Responsibility']")
	private WebElement ClickInsuRespons;

	public WebElement getClickInsuRespons() {
		return ClickInsuRespons;
	}
	@FindBy(xpath = "//button[normalize-space()='Update Filters']")
	private WebElement ClickUpdateFilter;

	public WebElement getClickUpdateFilter() {
		return ClickUpdateFilter;
	}
	

}