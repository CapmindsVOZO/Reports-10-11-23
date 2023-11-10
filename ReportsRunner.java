package com.Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

//	public static void main(String[] args) throws InterruptedException {
	
	@Test(priority = 0)

	public void Login() throws InterruptedException {
		
		// Step1: Set up physical report path
//	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ReportsModuleExtendReport.html");

		// to keep the report history
//		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
//		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
//		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription

//		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

//		test.assignCategory("smoke");
//		test.assignAuthor("capminds");

		System.out.println("Browser Launched Successfully");

//		test.pass("Browser Launched Successfully");

		// Driver Maximize and Url Launch
		
		geturl("https://mumbai.vozo.xyz");

		System.out.println("URL Launched Succsessfully");

//		test.pass("URL Launched Successfully");

		// Enter Username
		sendkeys(pom.getinstance().getUsername(), "mumbai");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click Signin Button '
		Clickonelement(pom.getinstance().getSigninbtn());

		System.out.println("SignIn Succsessfully");

//		test.pass("SignIn Successfully");

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(4000);
		
		Clickonelement(pom.getReports().getClickReport());

		System.out.println("Reports Module Navigated Succsessfully");

//		test.pass("Reports Module Navigated  Succsessfully");
	}
		
@Test(priority = 1)
//@Ignore
		public void billingsummary() throws InterruptedException {
	
///////////////// BILLIG SUMMARY //////////////////    

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// Clickonelement(pom.getReports().getClickReportmod());

		Thread.sleep(4000);

		// Clickonelement(pom.getReports().getbillsu());

		// cli mon

		Clickonelement(pom.getReports().getclimo());

		// cli mon

		Clickonelement(pom.getReports().getcliqu());

		// cli mon

		Clickonelement(pom.getReports().getcliyea());

		// cli mon

		Clickonelement(pom.getReports().getcliyea());

		System.out.println("Billing Summary Verified Succsessfully");

	//	test.pass("Billing Summary Verified Succsessfully");
		
		}
     ////////    payment analysis   /////////////
		
	@Test(priority = 2)
	//@Ignore
	public void Analysis() throws InterruptedException {

		// cli pay

		Thread.sleep(2000);
		
		Clickonelement(pom.getReports().getpayana());

		// cli pay
		Clickonelement(pom.getReports().getpayanasea());

		// cli pay
		sendkeys(pom.getReports().getpayanasea(), "ja");

		// cli pay
		Clickonelement(pom.getReports().getselepa());

		// cli pay
		Clickonelement(pom.getReports().getseleoff());
		
		Clickonelement(pom.getReports().getseleoff1());

		// stat da
		sendkeys(pom.getReports().getstarda(), "05/03/2023");

		// stat da
		sendkeys(pom.getReports().getenda(), "08/03/2022");

		// sele pos
		Clickonelement(pom.getReports().getposdat());

		Clickonelement(pom.getReports().getposdat1());

		// cli upd
		Clickonelement(pom.getReports().getcliupp());

		// cli crea
		Clickonelement(pom.getReports().getclicre());

		// cli crea
		Clickonelement(pom.getReports().getclipatpay());

		// cli crea
		Clickonelement(pom.getReports().getclich());

		System.out.println("Payment analysis Verified Succsessfully");

		//test.pass("Payment analysis Verified Succsessfully");
		
		}

	//	@Test(priority = 3)
		@Ignore
		public void Procedure() throws InterruptedException {
		
////////////////// PRODUCT PROCEDURE ////////////////

		Thread.sleep(4000);

		Clickonelement(pom.getReports().getproproc());

		// proce or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getprocor());

		// code or
		Thread.sleep(4000);

		sendkeys(pom.getReports().getcptco(), "CPT");

		// sele code
//		Thread.sleep(5000);
		Clickonelement(pom.getReports().getselecpt());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getfromda(), "2023-04-29");

		// code or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getselfromda());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getseltoda(), "2023-05-30");

		// code or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getseltodats());
		// code or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getclupd());

		System.out.println("Product Procedure Verified Succsessfully");

	//	test.pass("Product Procedure Verified Succsessfully");
		
		}
		
//////////////// Remittence Report /////////////////
		
		@Test(priority = 4)
		public void Remittence() throws InterruptedException {

		Thread.sleep(5000);

		// Click Remittence Report
		Clickonelement(pom.getReports().getClickRemittence());

		// Enter Username
//		sendkeys(pom.getReports().getEnterTrace(), "50212068");

		// Slect Trace
		Clickonelement(pom.getReports().getSelectTrace());

		// Click From Date
		Clickonelement(pom.getReports().getClickFromDate());

		Thread.sleep(3000);

		// Select From Date
		Clickonelement(pom.getReports().getSelectFromDate());

//		// Click To Dates
//		Clickonelement(pom.getReports().getClickToDate()); 
//		
//		Thread.sleep(2000);
//				
//		// Select To Date
	//	Clickonelement(pom.getReports().getSelectToDate()); 
		
		// Enter Username
		 sendkeys(pom.getReports().getEnterPatient(), "sa");
		 
		 Clickonelement(pom.getReports().getSelectpatient1());

		// Enter Username
		sendkeys(pom.getReports().getEnterInsurance(), "a");

		// select Optum Maryland
		Clickonelement(pom.getReports().getSelectOptumMaryland());

		// Click Search button
		Clickonelement(pom.getReports().getClickSearch());

		// Click ExportToCSV
		Clickonelement(pom.getReports().getClickExportToCSV());

		// Click Print
		// Clickonelement(pom.getReports().getClickPrint());

		// Click cancel
		// Clickonelement(pom.getReports().getClickCancel());

		System.out.println("Remittence Report Verified Succsessfully");

	//	test.pass("Remittence Report Verified Succsessfully");
		
		}

/////////////// APPOINTMENT REPORT /////////////////
	
		@Test(priority = 5)
		public void APPOINTMENT() throws InterruptedException {

		Thread.sleep(4000);

		// click Appointment Rerport
		Clickonelement(pom.getReports().getClickAppointmentReport());

		// click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll());

		// click UnCheckAll
		Clickonelement(pom.getReports().getClickUnCheckAll());

		// click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll1());

		// click UnCheckAll
		Clickonelement(pom.getReports().getClickUnCheckAll1());

		Thread.sleep(9000);
		
		// Search Patient Name
		sendkeys(pom.getReports().getSearchPatientName(),"ja");

		Clickonelement(pom.getReports().getselectNmae());
		
		// click All Office
		Clickonelement(pom.getReports().getClickAllOffice());

		// Select Test Facility Phar
		Clickonelement(pom.getReports().getSelectoemr());

//		// click From Date
//		 Clickonelement(pom.getReports().getclickFromdate());
//
//		// select date number 8
//		 Clickonelement(pom.getReports().getselectdatenumber8());
//
//		// click End Date
//		 Clickonelement(pom.getReports().getclickEndDate());
//
//		// select date number 15
//		 Clickonelement(pom.getReports().getselectdate15());

		// click Update Button
		Clickonelement(pom.getReports().getclickupdatebutton());

		// select Radio Button
//		Clickonelement(pom.getReports().getclickRadioButton());

		System.out.println("Appointment Report Verified Succsessfully");

	//	test.pass("Appointment Report Verified Succsessfully");
		
		}

		////////// REMAINDER REPORT ///////
		
		@Test(priority = 6)
		public void REMAINDER() throws InterruptedException {

		// code or
		Thread.sleep(5000);

		Clickonelement(pom.getReports().getremre());

		// code or
		Thread.sleep(5000);

		sendkeys(pom.getReports().getremresep(), "ja");
		
		Thread.sleep(3000);
		
		Clickonelement(pom.getReports().getselectremresep());

		// from or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getremrefrom(), "16/06/2023");

		// from or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getremreselto(), "18/06/2023");

		// from or
		Thread.sleep(2000);

		// Clickonelement(pom.getReports().getremreselto());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremreday());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremreweek());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremremon());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremreye());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getcliup());

		System.out.println("REMAINDER REPORT  Verified Succsessfully");

//		test.pass("REMAINDER REPORT  Verified Succsessfully");
		
		}

		/////////// PATIENT REPORT////////////
		
		@Test(priority = 7)
		public void PATIENTREPORT() throws InterruptedException {

		// click patient report
		Thread.sleep(5000);

		Clickonelement(pom.getReports().getClickpatientrep());

		Thread.sleep(5000);
		// select from date

			sendkeys(pom.getReports().getfromcalenderpr(), "16/06/2023");

			// Clickonelement(pom.getReports().getclfromcalenderpr());

			// select to date

			sendkeys(pom.getReports().gettocalenderpr(), "22/06/2023");

			// Clickonelement(pom.getReports().gettocalenderpr());

			// Clickonelement(pom.getReports().getcltocalenderpr());
			// select age
			Thread.sleep(2000);

			sendkeys(pom.getReports().getseleage(), "20");

			// select sex
			Thread.sleep(2000);

			// sendkeys(pom.getReports().getselectsex(), "Male");

			Selectone(pom.getReports().getselectsex(), "Male");

			// select sex

			Thread.sleep(2000);

			// Clickonelement(pom.getReports().getselesex());

			// click race

			Thread.sleep(2000);

			Selectone(pom.getReports().getselerace(), "American Indian");

			// sendkeys(pom.getReports().getselerace(), "American Indian or Alaska
			// Native");

			// Clickonelement(pom.getReports().getselectrace());

			// click ethn
			Thread.sleep(2000);

			Selectone(pom.getReports().getselectethn(), "Hispanic or Latino");

			// sendkeys(pom.getReports().getselectethn(), "");

			// search medi

			sendkeys(pom.getReports().getsearchmedi(), "v");

			Thread.sleep(6000);
			
			Clickonelement(pom.getReports().getselemedi());

			// search allergy

			sendkeys(pom.getReports().getsearchallergy(), "i");

			Thread.sleep(2000);
			
			Clickonelement(pom.getReports().getselealler());
			
			Clickonelement(pom.getReports().getClickicd());
			
			Clickonelement(pom.getReports().getselecticd());
			// search problem

//			sendkeys(pom.getReports().getsearchproblem(), "a");
//
//			Clickonelement(pom.getReports().getselepro());

			// click search

			Clickonelement(pom.getReports().getclicksearch());

	    	System.out.println("PATIENT REPORT Verified Succsessfully");

	//  	test.pass("PATIENT REPORT Verified Succsessfully");
		
		}

///////////// TELE HEALTH REPORT ////////////
		
		@Test(priority = 8)
		
		  @Ignore
		public void TELEHEALTHREPORT() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement fla3 = wait4
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Telehealth Report')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla3);

		// click the Tele Health Report
		 Clickonelement(pom.getReports().getclickTeleHealthReport());

		// click checkAll Radio button
		Clickonelement(pom.getReports().getclickCheckAll());

		// click checkAll Radio button
		Clickonelement(pom.getReports().getclickUnCheckAll());

		// click Occured Radio Button
		Clickonelement(pom.getReports().getclickOccuredRadioButton());

		// click Did notOccured Radio Button
		Clickonelement(pom.getReports().getclickDidnotOccuredRadioButton());

		// search the Patient Name
		// sendkeys(pom.getReports().getSearchThePatientName1(), "gunad");

		// Clickonelement(pom.getReports().getselectPatientname());

		// click Select office Option
		Clickonelement(pom.getReports().getClickOfficeOption());

		// click Select office Option
		Clickonelement(pom.getReports().getSelectclickTestFacilityPhar());

		// click Start date Option
		Clickonelement(pom.getReports().getclickStartDate());

		// Select Start date 16
		Clickonelement(pom.getReports().getSelectStartDate16());

		// click End date Option
		// Clickonelement(pom.getReports().getclickEndDateq());
//
//		// Select End date 31
		Clickonelement(pom.getReports().getSelectEndDateq());

		Thread.sleep(2000);
//
//		// Click Update Filter Option
		Clickonelement(pom.getReports().getclickUpdateFilterOption());
//
//		// Click Update Export to file
//		 Clickonelement(pom.getReports().getClickExportToFile());
//
//		// Click Update Export to file
//		 Clickonelement(pom.getReports().getClickLoadmore());

		System.out.println("TELE HEALTH REPORT Verified Succsessfully");

	//	test.pass("TELE HEALTH REPORT Verified Succsessfully");
		
		}

////////// Productivity Report //////////////////
		
@Test(priority = 9)

		public void Productivity() throws InterruptedException {

		Thread.sleep(5000);

		// Click Productivity Report
		Clickonelement(pom.getReports().getClickProductivityReport());

		// Click From Date
		Clickonelement(pom.getReports().getClickTheFromDate());

		// Select From Date 16
		Clickonelement(pom.getReports().getSelectTheFromDate16());

		// Click End Date
		Clickonelement(pom.getReports().getclickTheEndDate());

		// Select From Date 31
		Clickonelement(pom.getReports().getselectTheEndDate31());

		// Click The Provider option
		Clickonelement(pom.getReports().getClickProvider());

		// Select Provider
		Clickonelement(pom.getReports().getSelectProvider());

		// Click the Include Cancelled and NoShow Appointments
		
		Clickonelement(pom.getReports().getClickCheckBox());

		// click update button
		Clickonelement(pom.getReports().getClickUpdateButton());

		// click load more
		// Clickonelement(pom.getReports().getClickLoadMore());

		System.out.println("PRODUCTIVITY REPORT Verified Succsessfully");

	//	test.pass("PRODUCTIVITY REPORT Verified Succsessfully");
		
		}

		//////////// Outgoing Prescription ////////////////////
		
@Test(priority = 10)
public void Outgoing() throws InterruptedException {

		Thread.sleep(7000);
		// click Outgoing Prescription

		WebDriverWait wait90 = new WebDriverWait(driver, 10);
		WebElement fla90 = wait90.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Outgoing Prescriptions')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla90);

		// Clickonelement(pom.getReports().getClickOutgoingPrescription());

		// EnterPatientName
		sendkeys(pom.getReports().getEnterPatientName(),"ja");

		// SelectPatientName
	//	Clickonelement(pom.getReports().getselectremresep());
		
        Clickonelement(pom.getReports().getSelectPatientName());

		// EnterDescription
//		sendkeys(pom.getReports().getEnterDescription(), "ZOCOR");
//
//		// SelectDescription
//		Clickonelement(pom.getReports().getSelectDescription());

		// EnterPharmacy
		sendkeys(pom.getReports().getEnterPharmacy(), "B");
		
		Thread.sleep(7000);
		
//		WebDriverWait wait70 = new WebDriverWait(driver, 10);
//		WebElement fla70 = wait70.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'ALBERTSONS LLC')])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla70);

		// SlectPharmacy
		Clickonelement(pom.getReports().getSlectPharmacy());

		// ClickStartDate
		Clickonelement(pom.getReports().getClickStartDate());

//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		// ClickEndtDate
//		Clickonelement(pom.getReports().getClickEndtDate());
//
//		// SelectEndtDate
//		Clickonelement(pom.getReports().getSelectEndtDate());

		// ClickFilter
		// Clickonelement(pom.getReports().getClickFilter());

		System.out.println("Outgoing Prescription Verified Succsessfully");

//		test.pass("Outgoing Prescription Verified Succsessfully");
		
		}

///////// User Report //////////////////
		
@Test(priority = 11)
public void User() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait91 = new WebDriverWait(driver, 10);
		WebElement fla91 = wait91
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='rpt_nav-lnk_usrRpt']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla91);
		// click User Report
//		 Clickonelement(pom.getReports().getClickUserreport());

		Thread.sleep(5000);
		
		// Enter Search Username
		sendkeys(pom.getReports().getEnterSearchUsername(), "mu");

		Thread.sleep(2000);

		Clickonelement(pom.getReports().getSelectSearchUsername());

		// click Inactive
		// Clickonelement(pom.getReports().getclickInactiveRadioButton());

		// click Search Button
		Clickonelement(pom.getReports().getclickSearchButton());

		// click Staff Button
		Clickonelement(pom.getReports().getclickStaffButton());

		// Enter Search Username
		sendkeys(pom.getReports().getEnterUserName(), "Nurse");

		// click Inactive
		Clickonelement(pom.getReports().getselectstaff());

		// click Search Button
		Clickonelement(pom.getReports().getclickSearchButton1());

		System.out.println("User Report Verified Succsessfully");

	//	test.pass("User Report Verified Succsessfully");
		
		}

////////////////// Invoice ////////////////////
		
		@Test(priority = 12)

		public void Invoice() throws InterruptedException {

//		Thread.sleep(6000);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='rpt_nav-lnk_invo']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

		// click Invoices
		// Clickonelement(pom.getReports().getClickInvoices());

		// getEnterPatientName1
		sendkeys(pom.getReports().getEnterPatientName1(), "ja");

		// Clickonelement(pom.getReports().getEnterPatientName1());

		// SelectPatientName1
		Clickonelement(pom.getReports().getSelectPatientName1());

		// Click Invoices Status
		Clickonelement(pom.getReports().getClickInvoicesStatus());

		// EnterPharmacy
		Clickonelement(pom.getReports().getselectPaid());

		Thread.sleep(3000);
		
		// Enter Invoiceid
		sendkeys(pom.getReports().getEnterInvoiceid(), "2");

		// Clickonelement(pom.getReports().getEnterInvoiceid());

		Thread.sleep(3000);

		// selectInvoiceId
		Clickonelement(pom.getReports().getselectInvoiceId());
		
		Thread.sleep(3000);
		
		// Click Start Date
		Clickonelement(pom.getReports().getEnterStartdate());

		Clickonelement(pom.getReports().getClickFrv());

		// Select End Date
		Clickonelement(pom.getReports().getEnterEnddate());

		// SelectEndtDate
//		Clickonelement(pom.getReports().getEnterEnddate1());

		// clickSearch
		Clickonelement(pom.getReports().getclickSearch());

		System.out.println("Invoice Verified Succsessfully");

//		test.pass("Invoice Verified Succsessfully");

//////////////////// 		Clinical Report
	
		WebDriverWait wait91 = new WebDriverWait(driver, 10);
		WebElement fla91 = wait91
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Clinical Report')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla91);

//Flow 1		
		Thread.sleep(4000);
		sendkeys(pom.getReports().getClickFromDate(), "2022-11-09");

		Thread.sleep(4000);
		sendkeys(pom.getReports().getClickToDate(), "2022-11-14");

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickAllButton());

		Clickonelement(pom.getReports().getClickAll());
		
		Thread.sleep(4000);

		Clickonelement(pom.getReports().getClickAllnoteDrop());

		Clickonelement(pom.getReports().getClickAllnote());

		Thread.sleep(4000);
		
		Clickonelement(pom.getReports().getClickClientResponsDrop());

		Clickonelement(pom.getReports().getClickClientRespons());

		Clickonelement(pom.getReports().getClickUpdateFilter());

// Flow 2
		Thread.sleep(4000);
		sendkeys(pom.getReports().getClickFromDate(), "2023-03-28");

		Thread.sleep(4000);
		sendkeys(pom.getReports().getClickToDate(), "2023-03-29");

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickAllButton());

		Clickonelement(pom.getReports().getClickPaid());

		Clickonelement(pom.getReports().getClickAllnoteDrop());

		Clickonelement(pom.getReports().getClickNoNote());

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickClientResponsDrop());

		Clickonelement(pom.getReports().getClickInsuRespons());

		Clickonelement(pom.getReports().getClickUpdateFilter());

// Flow 3
		Thread.sleep(4000);
		sendkeys(pom.getReports().getClickFromDate(), "2023-03-28");

		Thread.sleep(4000);
		sendkeys(pom.getReports().getClickToDate(), "2023-03-29");

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickAllButton());

		Clickonelement(pom.getReports().getClickPartialPaid());

		Clickonelement(pom.getReports().getClickAllnoteDrop());

		Clickonelement(pom.getReports().getClickUnLocked());

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickClientResponsDrop());

		Clickonelement(pom.getReports().getClickInsuRespons());

		Clickonelement(pom.getReports().getClickUpdateFilter());
	
//// Flow 4
//		Thread.sleep(4000);
//		sendkeys(pom.getReports().getClickFromDate(), "2023-03-28");
//
//		Thread.sleep(4000);
//		sendkeys(pom.getReports().getClickToDate(), "2023-03-29");
//
//		Thread.sleep(4000);
//		Clickonelement(pom.getReports().getClickAllButton1());
//
//		Thread.sleep(4000);
////		WebDriverWait wait92 = new WebDriverWait(driver, 10);
////		WebElement fla92 = wait92
////				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'UnPaid')])[2]")));
////		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla92);
//
//		Clickonelement(pom.getReports().getClickUnPaid());
//
//		Clickonelement(pom.getReports().getClickAllnoteDrop());
//
//		Clickonelement(pom.getReports().getClickSupervision());
//
//		Thread.sleep(4000);
//		Clickonelement(pom.getReports().getClickClientResponsDrop());
//
//		Clickonelement(pom.getReports().getClickInsuRespons());
//
//		Clickonelement(pom.getReports().getClickUpdateFilter());

//Flow 5		
		Thread.sleep(4000);
		
		sendkeys(pom.getReports().getClickFromDate(), "2023-03-28");

		Thread.sleep(4000);
		
		sendkeys(pom.getReports().getClickToDate(), "2023-03-29");

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickAllButton1());

	//	Clickonelement(pom.getReports().getClickUnPaid());

		Clickonelement(pom.getReports().getClickAllnoteDrop());

		Clickonelement(pom.getReports().getClickSupervision());

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getClickClientResponsDrop());

		Clickonelement(pom.getReports().getClickInsuRespons());

		Clickonelement(pom.getReports().getClickUpdateFilter());

		
		// Final Report

		System.out.println("Reports Module Verified Succsessfully");

//		test.pass("Reports ModuleVerified Succsessfully");

		// step6: Mandatory step
//		extent.flush();
		}  
		
		
	}


