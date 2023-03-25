package tests;

import org.testng.annotations.BeforeSuite;

import com.shaft.driver.SHAFT;

public class TestBase {


	public static SHAFT.GUI.WebDriver driver ;


	@BeforeSuite

	public void startDriver ()

	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		driver = new SHAFT.GUI.WebDriver () ;
		driver.browser().navigateToURL("https://demoblaze.com/") ;	
	}

}
