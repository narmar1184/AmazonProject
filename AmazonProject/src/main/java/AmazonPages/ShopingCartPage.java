package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopingCartPage {
	public WebDriver driver;
	By deleteItem=By.xpath("//input[@value='Delete' and @aria-label='Delete MOKOBARA Transit Backpack | Fits Laptop Up To 16 Inch, 30L Capacity, Water-Resistant Polyester, Vegan Leather Trims | Black,Money Moves - 2.0']");
	public ShopingCartPage(WebDriver driver) {
        this.driver = driver;
    }
	public void cart() throws InterruptedException {
		
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		Thread.sleep(2000);
		driver.findElement(deleteItem).click();
		
		
	}

}
	