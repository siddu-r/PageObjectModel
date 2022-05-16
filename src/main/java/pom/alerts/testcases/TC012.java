package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.MainPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To verify the prompt alert";
		author="Siddu";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}

	@Test
	public void promptAlert() {
		new MainPage()
		.switchToFrame()
		.clickOnTryIt()
		.sendKeysInAlert("siddu")
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyText("siddu")
		.refreshPage()
		.switchToFrame()
		.clickOnTryIt()
		.sendKeysInAlert("reddy")
		.getTextFromAlert()
		.dismissTheAlert()
		.verifyText("cancelled")
		.switchDefaultContent()
		.clickOnHome();
	}
}
