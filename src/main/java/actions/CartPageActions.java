package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.CartPageElements;
import kdriver.KomalDriver;

public class CartPageActions extends CartPageElements {
	
	public CartPageActions(WebDriver driver) {
		
		super(driver);
		
	}
public double getSubtotal() {
		
		double actualSubtotal = 0;
	
	
	for(WebElement webElement:listOfE) {
		actualSubtotal = actualSubtotal+gatePriceFromText(webElement);
	}
	return actualSubtotal;

}
	public double getSubTotalValue() {
		return gatePriceFromText(subtotalText);
	}
	

}
