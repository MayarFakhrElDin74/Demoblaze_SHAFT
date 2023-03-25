package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ProductDetailsPage {


	private SHAFT.GUI.WebDriver driver ;


	public ProductDetailsPage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}



	private final By addToCartBtn = By.cssSelector("a.btn.btn-success.btn-lg") ;



	public void addProductToCart ()

	{
		driver.element().click(addToCartBtn) ;

		driver.element().performAlertAction().getAlertText() ;
		driver.element().performAlertAction().acceptAlert() ;

	}



}
