package pom.userregformc.pages;
import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public RegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("HomePage.SignUp.Xpath"));
		return new RegistrationPage();
	}
}
