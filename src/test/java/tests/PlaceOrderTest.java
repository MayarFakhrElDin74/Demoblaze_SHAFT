package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.CartPage;
import pages.HomePage;
import pages.PlaceOrderPage;
import pages.PostOrderPage;
import pages.ProductDetailsPage;

public class PlaceOrderTest extends TestBase {

	HomePage homeObject ;
	ProductDetailsPage productdetailsObject ;
	CartPage cartObject ;
	PlaceOrderPage placeorderObject ;
	PostOrderPage postorderObject ;


	SHAFT.TestData.JSON placeOrderData ;



	@Test (priority = 1)

	public void UserCanAddProductToCart ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToProductDetailsPage();

		productdetailsObject = new ProductDetailsPage(driver) ;
		productdetailsObject.addProductToCart();

	}



	@Test (priority = 2)

	public void userCanPlaceOrder () 

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToCartPage();

		cartObject = new CartPage(driver) ;
		cartObject.placeOrder();

		placeOrderData = new JSON("UserData.json") ;

		placeorderObject = new PlaceOrderPage(driver) ;

		placeorderObject.userEntersDataToPlaceOrder(placeOrderData.getTestData("name") ,
		placeOrderData.getTestData("country") , placeOrderData.getTestData("city") ,placeOrderData.getTestData("card") ,
		placeOrderData.getTestData("month") , placeOrderData.getTestData("year")) ;

		postorderObject = new PostOrderPage(driver) ;
		postorderObject.confirmSuccessfulPurchase();

		driver.assertThat().element(postorderObject.purchaseOrderMsgLocator()).text().
		contains("Thank you for your purchase!") ;

	}
	


}
