
package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
	   testCaseName="TC002";
	   testCaseDescription="To verify coach Booking registration for new user";
	   author="Siddu";
	   category="Regression";
	   browserName="chrome";
	   url="https://www.irctc.co.in/nget/train-search";
	   
	}
    
	
	@Test
	public void bookYourCoach() {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnMenu()
		.clickOnBookYourTrainOrCoach()
		.switchToNewWindow()
		.clickOnNewUserSignUP()
		.enterUserId("siddu12345")
		.enterPassword("Siddu@123")
		.enterConfirmPassword("Siddu@123")
		.selectSecurityQuestion("What was the name of your first school?")
		.enterSecurityAnswer("VBR")
		.clickOnDOB()
		.selectMonth("May")
		.selectYear("1995")
		.clickOnDate("11")
		.clickOnGender("Male")
		.clickOnMartialStatus("UnMarried")
		.enterEmailId("siddu123@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("siddu")
		.enterMiddleName("rami")
		.enterLastName("reddy")
		.selectNationality("Indian")
		.enterFlatNo("3-57")
		.enterStreet("mentay vari thota")
		.enterArea("bhimavaram")
		.pageDownAccess()
		.selectCountry("India")
		.enterMobileNo("8988897348")
		.enterPincode("534201")
		.pressTabKeyForCityAndState()
		.selectPostOffice("Bhimavaram H.O")
		.clickCommunicationAddressAsNo()
		.enterOfficeFlatNo("4-56")
		.enterOfficeStreet("semmanchery")
		.enterOfficeAreaName("tambaram")
		.selectOfficeCountry("India")
		.enterOfficeMobileNo("8789878709")
		.enterOfficePincode("600119")
		.pressTabKeyForCityAndState()
		.selectOfficePostOffice("Sathyabama University S.O");
	}
	
}
