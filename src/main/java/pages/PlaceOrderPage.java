package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class PlaceOrderPage {


	private SHAFT.GUI.WebDriver driver ;


	public PlaceOrderPage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}



	private final By nameTxtBox = By.id("name") ;
	private final By countryTxtBox = By.id("country") ;
	private final By cityTxtBox = By.id("city") ;
	private final By creditCardTxtBox = By.id("card") ;
	private final By monthTxtBox = By.id("month") ;
	private final By yearTxtBox = By.id("year") ;
	private final By purchaseBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]") ;



	public void userEntersDataToPlaceOrder
	(String name, String country , String city , String card , String month , String year)

	{   
		driver.element().type(nameTxtBox, name) ;
		driver.element().type(countryTxtBox, country) ;
		driver.element().type(cityTxtBox, city) ;
		driver.element().type(creditCardTxtBox, card) ;
		driver.element().type(monthTxtBox, month) ;
		driver.element().type(yearTxtBox, year) ;

		driver.element().click(purchaseBtn) ;	
		
	}

}
