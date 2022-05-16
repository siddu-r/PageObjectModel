package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class GeneratePasswordPage extends GenericWrappers {

	public RegistrationPage clickOnClose() {
		clickByXpath(prop.getProperty("GeneratePasswordPage.Close.Xpath"));
		return new RegistrationPage();
	}
}
