package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class SignUpPage {


	private SHAFT.GUI.WebDriver driver ;


	public SignUpPage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}


	private final By userNameTxtBox = By.xpath("//*[@id=\"sign-username\"]") ;
	private final By passwordTxtBox = By.xpath("//*[@id=\"sign-password\"]") ;
	private final By signUpBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]") ;



	public void UserCanSignUp (String username , String password)

	{

		driver.element().click(userNameTxtBox) ;
		driver.element().type(userNameTxtBox, username) ;

		driver.element().click(passwordTxtBox) ;
		driver.element().type(passwordTxtBox, password) ;

		driver.element().click(signUpBtn) ;

		driver.element().performAlertAction().getAlertText() ;
		driver.element().performAlertAction().acceptAlert() ;

	}


}
