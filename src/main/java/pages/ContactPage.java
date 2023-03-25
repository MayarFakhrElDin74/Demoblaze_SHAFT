package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ContactPage {


	private SHAFT.GUI.WebDriver driver ;


	public ContactPage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}



	private final By contactEmailTxtBox = By.id("recipient-email") ;
	private final By contactNameTxtBox = By.id("recipient-name") ;
	private final By msgTxtBox = By.id("message-text") ;
	private final By sendMsgBtn = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]") ;

	

	public void userCanContactUs (String email , String name , String msgtxt)

	{
		driver.element().type(contactEmailTxtBox, email) ;
		driver.element().type(contactNameTxtBox, name) ;
		driver.element().type(msgTxtBox, msgtxt) ;
		driver.element().click(sendMsgBtn) ;

		driver.element().performAlertAction().getAlertText() ;
		driver.element().performAlertAction().acceptAlert() ;

	}



}
