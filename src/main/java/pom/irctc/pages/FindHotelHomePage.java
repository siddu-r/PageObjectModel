package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FindHotelHomePage extends GenericWrappers {
     
	public FindHotelHomePage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	public IRCTCLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("FindHotelHomePage.Login.Xpath"));
		return new IRCTCLoginPage();
	}
}
