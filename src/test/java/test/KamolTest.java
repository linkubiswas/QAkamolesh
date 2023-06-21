package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import actions.CartPageActions;
import base.BaseTest;

public class KamolTest extends BaseTest{
	
	CartPageActions cartPageActions=null;
	
	@Test
	
	public void verifyCartPageAfterAddingAndNavigateToCartPage() throws InterruptedException {
		cartPageActions=homePageActions.addProductToCartAndNavegateToCart(3);
		
		Assert.assertEquals(homePageActions.getTitle(),"Cart Page | Kamolini" );
		
		
		
	}
	@Test(dependsOnMethods = "verifyCartPageAfterAddingAndNavigateToCartPage")
	public void verifySubTotal() {
		double actualSubtotal = cartPageActions.getSubtotal();
		
		double expSubtotal = cartPageActions.getSubTotalValue();


		
		Assert.assertEquals(expSubtotal,actualSubtotal);
		
	}

}
