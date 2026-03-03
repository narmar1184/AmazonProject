package testcases;

import org.testng.annotations.Test;

import AmazonPages.BaseClass;
import AmazonPages.BuyProductPage;
import AmazonPages.HomePage;
import AmazonPages.LoginPage;
import AmazonPages.LogoutPage;
import AmazonPages.ProductPage;
import AmazonPages.SearchProductPage;
import AmazonPages.ShopingCartPage;

public class AmazonEndEndTesting extends BaseClass {
	@Test
	
	public void AmazonEndToEnd() throws InterruptedException {
	LoginPage lg=new LoginPage(driver);
	HomePage hg=new HomePage(driver);
	SearchProductPage sg=new SearchProductPage(driver);
	ProductPage pg=new ProductPage(driver);
	BuyProductPage bb=new BuyProductPage(driver);
	LogoutPage lo=new LogoutPage(driver);
	ShopingCartPage sp=new ShopingCartPage(driver);
	
	lg.enterURL();
	lg.ClickOnSignInButton();
	lg.LoginDetails("7972252617", "Narendra@1184");
	Thread.sleep(5000);
	hg.ProductSearch("Bag");
	Thread.sleep(5000);
	sg.clickProduct();
	Thread.sleep(2000);
	pg.addItemToCart();
	Thread.sleep(2000);
	//Buy Product
	bb.ClickOnBuyProduct();
	Thread.sleep(2000);
	//Remove Product
	sp.cart();	
	hg.ClickOnAmazonLogo();
	//logout
    lo.logout();
	
	
	

	 
	 
	
	
	

}
}
