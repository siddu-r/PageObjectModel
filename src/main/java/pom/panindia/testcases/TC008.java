package pom.panindia.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.page.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify the new Pan registration";
		author="Siddu";
		category="Smoke";
		browserName="chrome";
		url="https://panind.com/india/new_pan/";
	}

	
	@Test
	public void panIndApplication() {
		new RegistrationPage()
		.selectTitle("MR.")
		.enterFirstName("siddu")
		.enterMiddleName("reddy")
		.enterLastName("rami")
		.enterFatherFirstName("subba")
		.enterFatherMiddleName("reddy")
		.enterFatherLastName("rami")
		.enterMobileNo("8121240963")
		.enterEmailId("siddu123@gmail.com")
		.pageScrollDownAccess()
		.selectSourceOfInCome("No Income")
		.clickOnOfficeForCommunicationAddress()
		.enterDOB("11051995")
		.pageScrollDownAccess()
		.enterResidenceHouseNo("5-56")
		.enterResidenceArea("kattavaripalem")
		.enterResidenceCity("chennai")
		.selectResidenceState("Tamil Nadu")
		.enterResidencePincode("600119")
		.selectCountry("INDIA")
		.enterOfficeName("panlinkingHub")
		.enterOfficeHouseNo("6-65")
		.enterOfficeArea("newvalley")
		.enterOfficeCity("bangalore")
		.selectOfficeState("Karnataka")
		.enterOfficePincode("560002")
		.selectOfficeCountry("INDIA")
		.pageScrollDownAccess()
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectDOBProof("Matriculation certificate or mark sheet of recognised board (In Copy)")
		.selectAdhaarProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Bank statement carrying Office Address")
		.clickOnTermsAndConditions();
	}
}
