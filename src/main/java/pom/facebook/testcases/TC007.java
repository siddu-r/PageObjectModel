package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify Facebook Signup for new user registration";
		author="Siddu";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
	}
	
	@Test
	public void facebookSignUp() {
		new HomePage()
		.clickOnCreateNewAccount()
		.enterFirstName("siddu")
		.enterSurName("reddy")
		.enterEmailId("siddureddy05@gmail.com")
		.enterConfirmEmailId("siddureddy05@gmail.com")
		.enterNewPassword("siddu@123")
		.selectDate("11")
		.selectMonth("May")
		.selectYear("1995")
		.clickOnGender("Male");
	}
}
