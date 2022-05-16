package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify irctc signup for new user registration";
		author="Siddu";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
	public void irctcSignUp() {
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()
		.enterUserName("Siddu123")
		.enterPassword("Siddu@123")
		.enterConfirmPassword("Siddu@123")
		.clickOnPreferredLanguage()
		.clickOnChooseLanguage()
		.clickOnSecurityQuestion()
		.clickOnChooseSecurityQuestion("What was the name of your first school?")
		.enterSecurityAnswer("VBR")
		.clickOnContinue()
		.enterFirstName("siddu")
		.enterMiddleName("rami")
		.enterLastName("reddy")
		.clickOnSelectOccupation()
		.clickToChooseSelectOccupation("PROFESSIONAL")
		.clickOnDOB()
		.selectMonth("May")
		.selectYear("1995")
		.clickOnDate("11")
		.clickOnMartialStatus("Unmarried")
		.selectCountry("India")
		.clickOnGender("Male")
		.enterEmail("siddu123@gmail.com")
		.enterISD("+91")
		.selectNationality("Indian")
		.clickOnContinue()
		.enterFlatNo("1-23")
		.enterStreetName("krr nagar")
		.enterAreaName("kovur")
		.enterPinCode("524137")
		.enterState("Andhra Pradesh")
		.enterCityName("Nellore")
		.enterPostOfficeName("Kovur S_O")
		.enterPhone("8121240963")
		.clickResidentialAddressAsNo()
		.enterOfficeFlatNo("2-12")
		.enterOfficeStreetName("Nts gate")
		.enterOfficeAreaName("Kovur")
		.clickOnSelectCountry()
		.clickToChooseSelectCountry("India")
		.enterOfficePincode("524137")
		.enterOfficeStateName("Andhra Pradesh")
		.enterOfficeCityName("Nellore")
		.enterOfficePostOfficeName("Kovur S_O")
		.pageDownAccess()
		.enterOfficePhoneNo("8121240963")
		.clickOnTermsAndConditions();
		
		
	}

}
