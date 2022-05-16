package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.MainPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify the confirmation alert";
		author="Siddu";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}

	@Test
	public void confirmationAlert() {
		new MainPage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyPrintedText("You pressed OK!")
		.refreshPage()
		.switchToFrame()
		.clickOnTryIt()
		.dismissTheAlert()
		.verifyPrintedText("You pressed Cancel!")
		.switchDefaultContent()
		.clickOnHome();
	}
}
