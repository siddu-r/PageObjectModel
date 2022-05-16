package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public RegistrationPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public RegistrationPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage clickOnCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.Country.Xpath"));
		return this;
	}
	
	public RegistrationPage selectCountryCode(String code) {
		clickByXpath(prop.getProperty("RegistrationPage.CountryCode.Xpath"));
		return this;
	}
	
	public RegistrationPage enterPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public RegistrationPage enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("RegistrationPage.CompanyName.Xpath"), companyName);
		return this;
	}
	
	public RegistrationPage enterStreetAddress(String streetAddress) {
		enterByXpath(prop.getProperty("RegistrationPage.StreetAddress.Xpath"), streetAddress);
		return this;
	}
	
	public RegistrationPage enterStreetAddress2(String streetAddress) {
		enterByXpath(prop.getProperty("RegistrationPage.StreetAddress2.Xpath"), streetAddress);
		return this;
	}
	
	public RegistrationPage enterCity(String cityName) {
		enterByXpath(prop.getProperty("RegistrationPage.City.Xpath"), cityName);
		return this;
	}
	
	public RegistrationPage enterState(String stateName) {
		enterByXpath(prop.getProperty("RegistrationPage.State.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage enterPostCode(String postCode) {
		enterByXpath(prop.getProperty("RegistrationPage.PostCode.Xpath"), postCode);
		return this;
	}
	
	public RegistrationPage tabAccess() {
		tabKey();
		return this;
	}
	
	public RegistrationPage selectCountry(String countryName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Country.Xpath"), countryName);
		return this;
	}
	
	public RegistrationPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), password);
		return this;
	}
	
	public GeneratePasswordPage clickOnGeneratePassword() {
		clickByXpath(prop.getProperty("RegistrationPage.GeneratePassword.Xpath"));
		return new GeneratePasswordPage();
	}
	
	public RegistrationPage clickOnReceiveEmails() {
		clickByXpath(prop.getProperty("RegistrationPage.ReceiveEmails.Xpath"));
		return this;
	}
		
}
