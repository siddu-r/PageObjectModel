package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FirstHotelPage extends GenericWrappers {
	
	public FirstHotelPage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
    
	public FirstHotelPersonalDetailsPage clickOnContinueToBook() {
		clickByExplicitWait(prop.getProperty("FirstHotelPage.ContinueToBook.Xpath"), 10);
		return new FirstHotelPersonalDetailsPage();
	}
}
