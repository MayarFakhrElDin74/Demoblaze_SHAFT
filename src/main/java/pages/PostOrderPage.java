package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class PostOrderPage {


	private SHAFT.GUI.WebDriver driver ;


	public PostOrderPage (SHAFT.GUI.WebDriver driver) 

	{
		this.driver = driver ;
	}


	private final By purchaseOrderMsg = By.xpath("/html/body/div[10]/h2") ;
	private final By okBtn = By.cssSelector("button.confirm.btn.btn-lg.btn-primary") ;


	public void confirmSuccessfulPurchase ()

	{
		driver.element().click(okBtn) ;
	}


	public String purchaseOrderMsgTxt ()

	{
		return driver.element().getText(purchaseOrderMsg) ;
	}


	public By purchaseOrderMsgLocator ()

	{
		return purchaseOrderMsg ;
	}


}
