package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify Php travels registration for new user";
		author="Siddu";
		category="Smoke";
		browserName="chrome";
		url="";
	}

	@Test
	public void pHPTravelsRegistration() {
		new RegistrationPage()
		.enterFirstName("siddu")
		.enterLastName("reddy")
		.enterEmailId("siddu123@gmail.com")
		.clickOnCountry()
		.selectCountryCode("+91")
		.enterPhoneNo("8989898878")
		.enterCompanyName("welfare association")
		.enterStreetAddress("bankcolony")
		.enterStreetAddress2("yousufguda")
		.enterCity("hyderabad")
		.enterState("telangana")
		.enterPostCode("500082")
		.tabAccess()
		.selectCountry("India")
		.enterMobileNo("8989798098")
		.enterPassword("Siddu@123")
		.enterConfirmPassword("Siddu@123")
		.clickOnGeneratePassword()
		.clickOnClose()
		.clickOnReceiveEmails();
		
	}
}
