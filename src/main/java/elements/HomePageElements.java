package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kdriver.KomalDriver;


public class HomePageElements extends KomalDriver{
	//public WebDriver driver=null;
	
	public HomePageElements(WebDriver driver) {
		super(driver);
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public WebElement product(int indexOfProduct) {
		return driver.findElement(By.xpath("//div[@data-index=\"" + indexOfProduct +"\"]"));
		
	}
	
	public WebElement QuickView(int indexOfProduct) {
		return driver.findElement(By.xpath("(//button[text()='Quick View'])["+(indexOfProduct+2)+"]"));

	}
	
	@FindBy(xpath = "//iframe[@class='D3gDT9']")
	public WebElement iframeElement;
	
	@FindBy(xpath = "//*[text()='Add to Cart']")
	public WebElement addToCart;
	
	@FindBy(xpath = "//*[@title='Close cart widget']")
	public WebElement CloseCartWidget;
	
	@FindBy(id = "widget-view-cart-button")
	public WebElement viewCartButton;

	
	
	

}
