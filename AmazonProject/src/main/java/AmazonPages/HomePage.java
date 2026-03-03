package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    By searchInbox=By.id("twotabsearchtextbox");
    By searchClick=By.id("nav-search-submit-button");
    By AmazonLogo=By.id("nav-logo-sprites");

    public void ProductSearch(String product) throws InterruptedException {
        driver.findElement(searchInbox).sendKeys(product);
        Thread.sleep(5000);
        driver.findElement(searchClick).click();
        Thread.sleep(5000);
    }
    public void ClickOnAmazonLogo() {
    	driver.findElement(AmazonLogo).click();
    }

}
