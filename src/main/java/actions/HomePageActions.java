package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import elements.HomePageElements;

public class HomePageActions extends HomePageElements{
	
	public HomePageActions(WebDriver driver) {
		super(driver);
		
	}
	public CartPageActions addProductToCartAndNavegateToCart(int numOfProduct) throws InterruptedException {
		
		for(int i = 1;i<=numOfProduct;i++) {
			Actions actions = new Actions(driver);

		
		actions.moveToElement(product(i)).build().perform();
		Thread.sleep(2000);

		
		QuickView(i).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(iframeElement);
		Thread.sleep(2000);
		
		addToCart.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		if(i!=numOfProduct) {
			Thread.sleep(2000);
			CloseCartWidget.click();
			
		}else {
			Thread.sleep(2000);
			viewCartButton.click();
			
		}
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		}
		return new CartPageActions(driver);
		}

}
