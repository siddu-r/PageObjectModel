package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify hotel booking by otp validation";
		author="Siddu";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in";
		
	}
	
	@Test
	public void bookHotelsOTPValidation() {
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
		.waitTime()
		.enterCityOrHotelName("Chennai")
		.clickOnDestination()
		.clickCheckInDate()
		.clickOnselectYear()
		.clickOnCheckInYear("2022")
		.clickOnCheckInMonth("Jun")
		.clickOnCheckInDate("15")
		.clickCheckOutDate()
		.clickOnselectYear()
		.clickOnCheckOutYear("2023")
		.clickOnCheckOutMonth("Aug")
		.clickOnCheckOutDate("14")
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
		.selectState("CHHATTISGARH")
		.selectGst("No")
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueForGstNo()
		.clickOnTermsAndConditions()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOtpRequiredText("otp is required.");
		
	}
}
