package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyProductPage {
	public WebDriver driver;
	By BuyNowToProceed=By.xpath("//input[@name='proceedToRetailCheckout']");

    public BuyProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickOnBuyProduct() {
    	
    	driver.findElement(BuyNowToProceed).click();
    	 System.out.println("proceeded to Buy!");
    	
    }

}
