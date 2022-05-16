package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {

	public SignUpPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("SignUpPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public SignUpPage enterSurName(String surName) {
		enterByXpath(prop.getProperty("SignUpPage.SurName.Xpath"), surName);
		return this;
	}
	
	public SignUpPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("SignUpPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public SignUpPage enterConfirmEmailId(String emailId) {
		enterByXpath(prop.getProperty("SignUpPage.ConfirmEmailId.Xpath"), emailId);
		return this;
	}
	
	public SignUpPage enterNewPassword(String password) {
		enterByXpath(prop.getProperty("SignUpPage.NewPassword.Xpath"), password);
		return this;
	}
	
	public SignUpPage selectDate(String date) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.Date.Xpath"), date);
		return this;
	}
	
	public SignUpPage selectMonth(String month) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.Month.Xpath"), month);
		return this;
	}
	
	public SignUpPage selectYear(String year) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.Year.Xpath"), year);
		return this;
	}
	
	public SignUpPage clickOnGender(String gender) {
		clickByXpath(prop.getProperty("SignUpPage.Gender.Xpath"));
		return this;
	}
}
