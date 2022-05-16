package pom.panindia.page;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage selectTitle(String title) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Title.Xpath"), title);
		return this;
	}
	
	public RegistrationPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String middleName) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.Xpath"), middleName);
		return this;
	}
	
	public RegistrationPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public RegistrationPage enterFatherFirstName(String fatherFirstName) {
		enterByXpath(prop.getProperty("RegistrationPage.FatherFirstName.Xpath"), fatherFirstName);
		return this;
	}
	
	public RegistrationPage enterFatherMiddleName(String fatherMiddleName) {
		enterByXpath(prop.getProperty("RegistrationPage.FatherMiddleName.Xpath"), fatherMiddleName);
		return this;
	}
	
	public RegistrationPage enterFatherLastName(String fatherLastName) {
		enterByXpath(prop.getProperty("RegistrationPage.FatherLastName.Xpath"), fatherLastName);
		return this;
	}
	
	public RegistrationPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage selectSourceOfInCome(String incomeSource) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SourceOfInCome.Xpath"), incomeSource);
		return this;
	}
	
	public RegistrationPage clickOnOfficeForCommunicationAddress() {
		clickByXpath(prop.getProperty("RegistrationPage.OfficeForCommunicationAddress.Xpath"));
		return this;
	}
	
	public RegistrationPage enterDOB(String dOB) {
		enterByXpath(prop.getProperty("RegistrationPage.DOB.Xpath"), dOB);
		return this;
	}
	
	public RegistrationPage enterResidenceHouseNo(String houseNo) {
		enterByXpath(prop.getProperty("RegistrationPage.ResidenceHouseNo.Xpath"), houseNo);
		return this;
	}
	
	public RegistrationPage enterResidenceArea(String areaName) {
		enterByXpath(prop.getProperty("RegistrationPage.ResidenceArea.Xpath"), areaName);
		return this;
	}
	
	public RegistrationPage enterResidenceCity(String cityName) {
		enterByXpath(prop.getProperty("RegistrationPage.ResidenceCity.Xpath"), cityName);
		return this;
	}
	
	public RegistrationPage selectResidenceState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.ResidenceState.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage enterResidencePincode(String pincode) {
		enterByXpath(prop.getProperty("RegistrationPage.ResidencePincode.Xpath"), pincode);
		return this;
	}
	
	public RegistrationPage selectCountry(String countryName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Country.Xpath"), countryName);
		return this;
	}
	
	public RegistrationPage enterOfficeName(String officeName) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeName.Xpath"), officeName);
		return this;
	}
	
	public RegistrationPage enterOfficeHouseNo(String houseNo) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeHouseNo.Xpath"), houseNo);
		return this;
	}
	
	public RegistrationPage enterOfficeArea(String areaName) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.Xpath"), areaName);
		return this;
	}
	
	public RegistrationPage enterOfficeCity(String cityName) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeCity.Xpath"), cityName);
		return this;
	}
	
	public RegistrationPage selectOfficeState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficeState.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage enterOfficePincode(String pincode) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePincode.Xpath"), pincode);
		return this;
	}
	
	public RegistrationPage selectOfficeCountry(String countryName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficeCountry.Xpath"), countryName);
		return this;
	}
	
	public RegistrationPage selectIdentityProof(String idProof) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.IdentityProof.Xpath"), idProof);
		return this;
	}
	
	public RegistrationPage selectAddressProof(String addressProof) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.AddressProof.Xpath"), addressProof);
		return this;
	}
	
	public RegistrationPage selectDOBProof(String dOBProof) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.DOBProof.Xpath"), dOBProof);
		return this;
	}
	
	public RegistrationPage selectAdhaarProof(String adhaarProof) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.AdhaarProof.Xpath"), adhaarProof);
		return this;
	}
	
	public RegistrationPage selectOfficeAddressProof(String officeAddressProof) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficeAddressProof.Xpath"), officeAddressProof);
		return this;
	}
	
	public RegistrationPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("RegistrationPage.TermsAndConditions.Xpath"));
		return this;
	}
	
	public RegistrationPage pageScrollDownAccess() {
		pageScrollDown();
		return this;
	}
		
}
