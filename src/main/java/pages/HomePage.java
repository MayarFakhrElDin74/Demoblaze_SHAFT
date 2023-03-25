package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {


	private SHAFT.GUI.WebDriver driver ;

	public HomePage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}


	private final By signUpLink = By.id("signin2") ;
	private final By loginLink = By.id("login2") ;
	private final By logoutLink = By.id("logout2") ;

	private final By contactUsLink = By.linkText("Contact") ;
	private final By laptopsIcon = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]") ;
	private final By productLink = By.linkText("Sony vaio i7") ;
	private final By cartLink = By.linkText("Cart") ;



	public void goTosignUpPage ()

	{
		driver.element().click(signUpLink) ;
	}


	public void goToLoginPage ()

	{
		driver.element().click(loginLink) ;
	}



	public void registeredUserCanLogout ()

	{
		driver.element().click(logoutLink) ;
	}


	public String getLoginLinkTxt ()

	{
		return driver.element().getText(loginLink) ;

	}


	public By loginLinkLocator ()

	{
		return loginLink ;
	}


	public String getLogoutLinkTxt ()

	{
		return driver.element().getText(logoutLink) ;
	}


	public By logoutLinkLocator ()

	{
		return logoutLink ;
	}


	public void goToContactUsPage ()


	{	
		driver.element().click(contactUsLink) ;
	}



	public void goToProductDetailsPage ()

	{
		driver.element().click(laptopsIcon) ;
		driver.element().click(productLink) ;	
	}


	public void goToCartPage ()

	{
		driver.element().click(cartLink) ;
	}


}
