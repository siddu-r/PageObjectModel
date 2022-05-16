package pom.alerts.pages;

import wrappers.GenericWrappers;

public class MainPage extends GenericWrappers {

	public MainPage switchToFrame() {
		switchToFrameByWebElement(prop.getProperty("MainPage.switchToFrame.Xpath"));
		return this;
	}
	
	public AlertPage clickOnTryIt() {
		clickByXpath(prop.getProperty("MainPage.TryIt.Xpath"));
		return new AlertPage();
	}
	
	public MainPage switchDefaultContent() {
		switchToDefaultContent();
		return this;
	}
	
	public HomePage clickOnHome() {
		clickByXpath(prop.getProperty("MainPage.Home.Xpath"));
		return new HomePage();
	}
	
	public MainPage verifyPrintedText(String text) {
		verifyTextByXpath(prop.getProperty("MainPage.PrintedText.Xpath"), text);
		return this;
	}
	
	public MainPage refreshPage() {
		refreshThePage();
		return new MainPage();
	}
	
	public MainPage verifyText(String text) {
		verifyTextContainsByXpath(prop.getProperty("MainPage.Text.Xpath"), text);
		return this;
	}
}
