package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
    public RegistrationPage clickOnRegister() {
    	clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
    	return new RegistrationPage();
    }
    
    public HomePage mouseHoverOnHolidays() {
    	mouseHoverByXpath(prop.getProperty("HomePage.Holidays.Xpath"));
    	return this;
    }
    
    public HomePage mouseHoverOnStays() {
    	mouseHoverByXpath(prop.getProperty("HomePage.Stays.Xpath"));
    	return this;
    }
    
    public AccomodationPage clickOnLounge() {
    	clickByXpath(prop.getProperty("HomePage.Lounge.Xpath"));
    	return new AccomodationPage();
    }
}
