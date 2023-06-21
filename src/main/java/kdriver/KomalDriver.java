package kdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class KomalDriver {
	
	public WebDriver driver=null;
	
	public KomalDriver(WebDriver driver) {
		this.driver=driver;
	
		
		
	}
	

		public  double gatePriceFromText(WebElement element) {
			return Double.parseDouble(element.getText().replace("$", ""));
		
		
	}
		public String getTitle() {
			return driver.getTitle();
		}
		

}
