package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IRCTCLoginPage extends GenericWrappers {
    
	public IRCTCLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("IRCTCLoginPage.GuestUserLogin.Xpath"));
		return this;
	}
	
	public IRCTCLoginPage enterEmail(String emailId) {
		enterByXpath(prop.getProperty("IRCTCLoginPage.Email.Xpath"), emailId);
		return this;
	}
	
	public IRCTCLoginPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("IRCTCLoginPage.MobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public ChooseHotelCityPage clickOnLogin() {
		clickByXpath(prop.getProperty("IRCTCLoginPage.Login.Xpath"));
		return new ChooseHotelCityPage();
	}
}
