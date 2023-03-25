package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class CartPage {


	private SHAFT.GUI.WebDriver driver ;


	public CartPage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}


	private final By placeOrderBtn = By.cssSelector("button.btn.btn-success") ;


	public void placeOrder ()

	{
		driver.element().click(placeOrderBtn) ;
	}



}
