package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify hotel booking gst validation";
		author="Siddu";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in";
	}

	@Test
	public void bookHotelsGSTValidation() {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnHotelsIcon()
		.switchToNewWindow()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail("siddu123@gmail.com")
		.enterMobileNo("8121240963")
		.clickOnLogin()
		.enterCityOrHotelName("Hyderabad")
		.waitTime()
		.clickOnDestination()
		.clickCheckInDate()
		.clickOnselectYear()
		.clickOnCheckInYear("2022")
		.clickOnCheckInMonth("Jun")
		.clickOnCheckInDate("25")
		.clickCheckOutDate()
		.clickOnselectYear()
		.clickOnCheckOutYear("2022")
		.clickOnCheckOutMonth("Jul")
		.clickOnCheckOutDate("13")
		.clickOnRoomAndGuest()
		.selectGuestAs3()
		.clickOnDone()
		.clickOnFindHotel()
		.getNameOfFirstHotel()
		.getPriceOfFirstHotel()
		.clickOnFirstHotel()
		.switchToNewWindow()
		.clickOnContinueToBook()
		.selectTitle("Mr")
		.enterFirstName("siddu")
		.enterLastName("reddy")
		.selectState("HARYANA")
		.selectGst("Yes")
		.enterGstNumber("798690")
		.enterCompanyName("internatonal space technology")
		.enterCompanyAddress("bangalore")
		.clickContinueForGstYes()
		.verifyTextOfgstNumber("Please Enter Valid GSt number");
	}
}
