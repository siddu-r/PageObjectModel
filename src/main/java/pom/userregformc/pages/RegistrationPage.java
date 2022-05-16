package pom.userregformc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
  
	public RegistrationPage enterUserId(String userId) {
		enterByXpath(prop.getProperty("RegistrationPage.UserId.Xpath"), userId);
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
	
	public RegistrationPage selectSecurityQuestion(String securityQuestion) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.Xpath"), securityQuestion);
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
		return this;
	}
	
	public RegistrationPage enterName(String name) {
		enterByXpath(prop.getProperty("RegistrationPage.Name.Xpath"), name);
		return this;
	}
	
	public RegistrationPage selectGender(String gender) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Gender.Xpath"), gender);
		return this;
	}
	
	public RegistrationPage enterDOB(String dob) {
		enterByXpath(prop.getProperty("RegistrationPage.DOB.Xpath"), dob);
		return this;
	}
	
	public RegistrationPage enterDesignation(String designation) {
		enterByXpath(prop.getProperty("RegistrationPage.Designation.Xpath"), designation);
		return this;
	}
	
	public RegistrationPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage enterMobile(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage enterPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public RegistrationPage selectNationality(String nationality) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public RegistrationPage enterHotelName(String hotelName) {
		enterByXpath(prop.getProperty("RegistrationPage.HotelName.Xpath"), hotelName);
		return this;
	}
	
	public RegistrationPage enterCapacity(String capacity) {
		enterByXpath(prop.getProperty("RegistrationPage.Capacity.Xpath"), capacity);
		return this;
	}
	
	public RegistrationPage enterAddress(String address) {
		enterByXpath(prop.getProperty("RegistrationPage.Address.Xpath"), address);
		return this;
	}
	
	public RegistrationPage selectState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.State.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage waitTime() {
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage selectCity(String district) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.City.Xpath"), district);
		return this;
	}  
	
	public RegistrationPage selectAccomodationType(String accomodationType) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.AccomodationType.Xpath"), accomodationType);
		return this;
	}
	
	public RegistrationPage selectAccomodationGrade(String grade) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.AccomodationGrade.Xpath"), grade);
		return this;
	}
	
	public RegistrationPage enterHotelEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.HotelEmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage enterHotelMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.HotelMobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage enterHotelPhoneNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.HotelPhoneNo.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage enterFirstOwnerName(String name) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstOwnerName.Xpath"), name);
		return this;
	}
	
	public RegistrationPage enterFirstOwnerAddress(String address) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstOwnerAddress.Xpath"), address);
		return this;
	}
	
	public RegistrationPage selectFirstOwnerState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.FirstOwnerState.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage selectFirstOwnerDistrict(String districtName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.FirstOwnerDistrict.Xpath"), districtName);
		return this;
	}
	
	public RegistrationPage enterFirstOwnerEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstOwnerEmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage enterFirstOwnerPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstOwnerPhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public RegistrationPage enterFirstOwnerMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstOwnerMobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("RegistrationPage.Add.Xpath"));
		return this;
	}
	
	public RegistrationPage enterSecondOwnerName(String name) {
		enterByXpath(prop.getProperty("RegistrationPage.SecondOwnerName.Xpath"), name);
		return this;
	}
	
	public RegistrationPage enterSecondOwnerAddress(String address) {
		enterByXpath(prop.getProperty("RegistrationPage.SecondOwnerAddress.Xpath"), address);
		return this;
	}
	
	public RegistrationPage selectSecondOwnerState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SecondOwnerState.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage selectSecondOwnerDistrict(String districtName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.SecondOwnerDistrict.Xpath"), districtName);
		return this;
	}
	
	public RegistrationPage enterSecondOwnerEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.SecondOwnerEmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage enterSecondOwnerPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("RegistrationPage.SecondOwnerPhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public RegistrationPage enterSecondOwnerMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.SecondOwnerMobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPage enterThirdOwnerName(String name) {
		enterByXpath(prop.getProperty("RegistrationPage.ThirdOwnerName.Xpath"), name);
		return this;
	}
	
	public RegistrationPage enterThirdOwnerAddress(String address) {
		enterByXpath(prop.getProperty("RegistrationPage.ThirdOwnerAddress.Xpath"), address);
		return this;
	}
	
	public RegistrationPage selectThirdOwnerState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.ThirdOwnerState.Xpath"), stateName);
		return this;
	}
	
	public RegistrationPage selectThirdOwnerDistrict(String districtName) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.ThirdOwnerDistrict.Xpath"), districtName);
		return this;
	}
	
	public RegistrationPage enterThirdOwnerEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPage.ThirdOwnerEmailId.Xpath"), emailId);
		return this;
	}
	
	public RegistrationPage enterThirdOwnerPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("RegistrationPage.ThirdOwnerPhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public RegistrationPage enterThirdOwnerMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPage.ThirdOwnerMobileNo.Xpath"), mobileNo);
		return this;
	}
	
	
}
