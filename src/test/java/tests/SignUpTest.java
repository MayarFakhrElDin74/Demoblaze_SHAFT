package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.SignUpPage;

public class SignUpTest extends TestBase {


	HomePage homeObject ;
	SignUpPage signupObject ;

	SHAFT.TestData.JSON signupData;



	@Test (priority = 1)

	public void userCanSignUp ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goTosignUpPage();

		signupData = new JSON("UserData.json") ;

		signupObject = new SignUpPage(driver) ;
		signupObject.UserCanSignUp(signupData.getTestData("username"), signupData.getTestData("password")) ;

		driver.assertThat().element(homeObject.loginLinkLocator()).text().contains("Log in").perform();

	}

}
