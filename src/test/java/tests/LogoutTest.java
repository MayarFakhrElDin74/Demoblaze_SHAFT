package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.LoginPage;

public class LogoutTest extends TestBase {

	
	HomePage homeObject ;
	LoginPage loginObject ;

	SHAFT.TestData.JSON loginData ;

	

	@Test (priority = 1)

	public void registeredUserCanLogin ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToLoginPage();

		loginData = new JSON("UserData.json") ;

		loginObject = new LoginPage(driver) ;
		loginObject.registeredUserLogin(loginData.getTestData("username"), loginData.getTestData("password")) ;

		driver.assertThat().element(homeObject.logoutLinkLocator()).text().contains("Log out") ;

	}



	@Test (priority = 2)

	public void registeredUserCanLogout ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.registeredUserCanLogout();

		driver.assertThat().element(homeObject.loginLinkLocator()).text().contains("Log in").perform();
	}



}
