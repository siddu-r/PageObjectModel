package pom.userregformc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.userregformc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify form C new user registration";
		author="Siddu";
		category="Regression";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
	}
    @Test
	public void formC() {
		new HomePage()
		.clickOnSignUp()
		.enterUserId("siddu1105")
		.enterPassword("Siddu@123")
		.enterConfirmPassword("Siddu@123")
		.selectSecurityQuestion("where did you meet your spouse?")
		.enterSecurityAnswer("may be in hell")
		.enterName("siddureddy")
		.selectGender("Male")
		.enterDOB("11/05/1995")
		.enterDesignation("floorcleaner")
		.enterEmailId("siddu123@gmail.com")
		.enterMobile("8980897809")
		.enterPhoneNo("234524")
		.selectNationality("BELGIUM")
		.enterHotelName("greenfieldembankment")
		.enterCapacity("3000")
		.enterAddress("haryana")
		.selectState("KARNATAKA")
		.waitTime()
	    .selectCity("BELLARY")
		.selectAccomodationType("Guest House")
		.selectAccomodationGrade("Five Star")
		.enterHotelEmailId("gesthouse@gmail.com")
		.enterHotelMobileNo("7879707068")
		.enterPhoneNo("234594")
		.enterFirstOwnerName("yashu")
		.enterFirstOwnerAddress("bangalore")
		.selectFirstOwnerState("KARNATAKA")
		.selectFirstOwnerDistrict("KOLAR")
		.enterFirstOwnerEmailId("yashu123@gmail.com")
		.enterFirstOwnerPhoneNo("8769897078")
		.clickOnAdd()
		.enterSecondOwnerName("akhil")
		.enterSecondOwnerAddress("hyderabad")
		.selectSecondOwnerState("TELANGANA")
		.waitTime()
		.selectSecondOwnerDistrict("HYDERABAD")
		.enterSecondOwnerEmailId("akhil123@gmail.com")
		.enterSecondOwnerPhoneNo("8778909867")
		.clickOnAdd()
		.waitTime()
		.enterThirdOwnerName("nishu")
		.enterThirdOwnerAddress("hyderabad")
		.selectThirdOwnerState("TELANGANA")
		.waitTime()
		.selectThirdOwnerDistrict("HYDERABAD")
		.enterThirdOwnerEmailId("nishu@gmail.com")
		.enterThirdOwnerPhoneNo("8976905865")
		.clickOnAdd();
	}
}
