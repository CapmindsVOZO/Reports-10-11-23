package com.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.dockerjava.api.model.Task;
//import com.page.Appointment_Profile;
//import com.page.Billing;
//import com.page.BillingNergativeCases1;

//import com.page.ChangePassword;
//import com.page.DenialAnalysis;
//import com.page.ERXPage;
//import com.page.PageTask;
//import com.page.Patient;
//import com.page.PatientModuleNegativeCases1;
//import com.page.PatientPortalSetting;
//import com.page.PatientSearch;
//import com.page.Payment;
//import com.page.PaymentNegativeCases1;
//import com.page.Provider_Availability;

//import com.page.ScheduleNegativeCases1;
//import com.page.Security;
//import com.page.Settings;
//import com.page.SettingsNegativeCases1;

//import com.page.TaskNegativeCases1;
//import com.paral.New_Appointment;

public class Pom_Class {


	public  static RemoteWebDriver driver;

	private SignIn sp;

	private Calender cp;
	
//	private Provider_Availability pA;
//
//	private Appointment_Profile ap;
//
//	private Patient pa;
//	
	private Reports rp;
//
//	private Settings st;
//    
//	private New_Appointment1 naa;

//	private Payment py;
//
//	private Billing BL;
//	
//	private PageTask TK;
//	
//	private ERXPage ERX;
//	
//	private PatientModuleNegativeCases1 PANE;
//	
//	private BillingNergativeCases1 BLNC;
//	
//	private SettingsNegativeCases1 STNC;
//	
//	private TaskNegativeCases1 TKNC;
//	
//	private PaymentNegativeCases1 PANC;
	
//	private ScheduleNegativeCases1 SCNC;
//	
//	private Security SECNC;
//	
//	private PatientSearch PASEar;
//	
//	private ChangePassword CHNGPASS;
//	
//	private PatientPortalSetting PPS;
//	
//	private DenialAnalysis DA;
//	
	public Pom_Class(WebDriver driver2) {
		
		this.driver = (RemoteWebDriver) driver2;

	}
//	public Provider_Availability getprovideravailability() {
//
//		if (pA == null) {
//
//			pA = new Provider_Availability(driver);
//
//		}
//		return pA;
//
//		}
//
//		public Appointment_Profile getappoAppointment_Profile() {
//
//		if (ap == null) {
//
//		ap = new Appointment_Profile(driver);
//
//		}
//		return ap;
//
//		}
//
//	public Settings getSettings() {
//	
//		if (st== null) {
//	
//			st = new Settings(driver);
//	
//		}
//		return st;
//	}

	public SignIn getinstance() {

		if (sp == null) {

			sp = new SignIn(driver);
   
		}
		return sp;
	}

	public Calender getCalender() {

		if (cp == null) {

			cp = new Calender(driver);

		}
		return cp;
	}
	
//	public Patient getPatient() {
//
//		if (pa== null) {
//
//			pa = new Patient(driver);
//
//		}
//		return pa;
//	}
	
	public Reports getReports() {

		if (rp== null) {

			rp = new Reports(driver);

		}
		return rp;
	}
	
//	public New_Appointment1 getnewappointment() {
//
//		if (naa == null) {
//
//			naa = new New_Appointment1(driver);
//
//		}
//		return naa;

//	}
	
//	public Payment getPayment() {
//
//		if (py== null) {
//
//			py = new Payment(driver);
//
//		}
//		return py;
//	}
//	
//	public Billing getBilling() {
//
//		if (BL== null) {
//
//			BL = new Billing(driver);
//
//		}
//		return BL;
//	}
//	public PageTask getPageTask() {
//
//		if (TK== null) {
//
//			TK = new PageTask(driver);
//
//		}
//		return TK;
//	}
//	public ERXPage getERXPage() {
//
//		if (ERX== null) {
//
//			ERX = new ERXPage(driver);
//
//		}
//		return ERX;
//	}
//	public PatientModuleNegativeCases1 getNegativeTestCase() {
//
//		if (PANE== null) {
//
//			PANE = new PatientModuleNegativeCases1(driver);
//
//		}
//		return PANE;
//	}
//	
//	public BillingNergativeCases1 getBillingNergativeCases() {
//
//		if (BLNC== null) {
//
//			BLNC = new BillingNergativeCases1(driver);
//
//		}
//		return BLNC;
//	}
//	public SettingsNegativeCases1 getSettingsNegativeCases() {
//
//		if (STNC== null) {
//
//			STNC = new SettingsNegativeCases1(driver);
//
//		}
//		return STNC;
//	}
//	public TaskNegativeCases1 getTaskNegativeCases() {
//
//		if (TKNC== null) {
//
//			TKNC = new TaskNegativeCases1(driver);
//
//		}
//		return TKNC;
//	}
//	public PaymentNegativeCases1 getPaymentNegativeCases() {
//
//		if (PANC== null) {
//
//			PANC = new PaymentNegativeCases1(driver);
//
//		}
//		return PANC;
//	}
//	public ScheduleNegativeCases1 getScheduleNegativeCases() {
//
//		if (SCNC== null) {
//
//			SCNC = new ScheduleNegativeCases1(driver);
//
//		}
//		return SCNC;
//	}
//	public Security getSecurity() {
//
//		if (SECNC== null) {
//
//			SECNC = new Security(driver);
//
//		}
//		return SECNC;
//	}
//	public PatientSearch getPatientSearch() {
//
//		if (PASEar== null) {
//
//			PASEar = new PatientSearch(driver);
//
//		}
//		return PASEar;
//	}
//	public ChangePassword getChangePassword() {
//
//		if (CHNGPASS== null) {
//
//			CHNGPASS = new ChangePassword(driver);
//
//		}
//		return CHNGPASS;
//	}
//	public PatientPortalSetting getPatientPortalSetting() {
//
//		if (PPS== null) {
//
//			PPS = new PatientPortalSetting(driver);
//
//		}
//		return PPS;
//	}
//	public DenialAnalysis getDenialAnalysis() {
//
//		if (DA== null) {
//
//			DA = new DenialAnalysis(driver);
//
//		}
//		return DA;
//	}
}
