package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class LoginPage {


	private SHAFT.GUI.WebDriver driver ;

	public LoginPage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By loginUserNameTxtBox = By.id("loginusername") ;
	private final By loginPasswordTxtBox = By.id("loginpassword") ;
	private final By loginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]") ;	



	public void registeredUserLogin (String username , String password)

	{
		driver.element().click(loginUserNameTxtBox) ;
		driver.element().type(loginUserNameTxtBox, username) ;

		driver.element().click(loginPasswordTxtBox) ;
		driver.element().type(loginPasswordTxtBox, password) ;

		driver.element().waitToBeReady(loginBtn) ;
		driver.element().click(loginBtn) ;	

	}



}
