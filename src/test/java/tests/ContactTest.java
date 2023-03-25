package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.ContactPage;
import pages.HomePage;

public class ContactTest extends TestBase {


	HomePage homeObject ;
	ContactPage contactObject ;


	SHAFT.TestData.JSON contactUsData ;



	@Test (priority = 1)

	public void userCanContcatUs ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToContactUsPage();

		contactUsData = new JSON("UserData.json") ;

		contactObject = new ContactPage(driver) ;
		contactObject.userCanContactUs (contactUsData.getTestData("email") , 
		contactUsData.getTestData("name") , contactUsData.getTestData("msgtxt")) ;

	}
	
	
}
