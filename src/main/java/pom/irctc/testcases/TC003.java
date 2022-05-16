package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
    @BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify saloon mandatory check submission for new user";
		author="Siddu";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
    
    @Test
	public void saloonMandatoryCheck() {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnMenu()
		.clickOnCharter()
		.clickOnCloseMenu()
		.clickOnEnquiryForm()
		.enterNameOfApplicant("siddureddy")
		.enterNameOfOrganisation("IT Hub")
		.enterAddress("bangalore")
		.enterMobileNo("81212409")
		.enterEmail("siddu123@gmail.com")
		.selectRequestForSaloonCharter()
		.enterOriginatingStation("kovur")
		.enterDestinationStation("nellore")
		.clickOnDateOfDeparture()
		.selectDepartureYear("2022")
		.clickOnDepartureMonth()
		.clickOnDepartureDate("6")
		.clickOnDateOfArrival()
		.selectArrivalYear("2023")
		.clickOnArrivalMonth()
		.clickOnArrivalDate("20")
		.enterDurationOfTour("455")
		.enterNumberAndTypeOfCoaches("2 AC coaches")
		.enterNoOfPassengers("3")
		.enterPurposeOfCharter("occasional Tour")
		.enterAdditionalServicesRequired("daily full meals required")
		.clickOnSubmit()
		.verifyTextBelowMobileNoField("Mobile no. not valid");
	}
}
