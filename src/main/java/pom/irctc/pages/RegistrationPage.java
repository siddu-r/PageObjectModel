package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
   
	public RegistrationPage enterUserName(String userName) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.Xpath"), userName);
		return this;
	}
	
	public RegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String confirmPassword) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnChooseLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.ChooseLanguage.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnChooseSecurityQuestion(String securityQuestion) {
		clickByXpath(prop.getProperty("RegistrationPage.ChooseSecurityQuestion.Xpath"));
		return this;
	}
	public RegistrationPage pageDownAccess() {
		pageScrollDown();
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
		return this;
	}
	
	public PersonalDetailsPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue.Xpath"));
		return new PersonalDetailsPage();
	}
}
