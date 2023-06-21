package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kdriver.KomalDriver;
import net.bytebuddy.implementation.bind.annotation.Super;

public class CartPageElements extends KomalDriver{
	
	//public WebDriver driver = null;
	
	public CartPageElements(WebDriver driver) {
		super(driver);
		
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}



	@FindBy(xpath = "//div[@class='apzZQq']")
	public List<WebElement> listOfE;
	
	
	@FindBy(xpath = "//dd[@data-hook='SubTotals.subtotalText']")
	public WebElement subtotalText;


}
