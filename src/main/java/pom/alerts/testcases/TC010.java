package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.MainPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify the simple alert";
		author="Siddu";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}

	@Test
	public void simpleAlert() {
		new MainPage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.switchDefaultContent()
		.clickOnHome();
	}
}
