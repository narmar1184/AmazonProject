package AmazonPages;

import org.openqa.selenium.WebDriver;

public class SearchProductPage {
	
	WebDriver driver;

    public SearchProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //By firstProduct = By.cssSelector("div.s-main-slot div[data-component-type='s-search-result'] h2 a");

    public void clickProduct() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.get("https://www.amazon.in/MOKOBARA-Transit-Backpack-Laptop-Crypto/dp/B0B6CM781M/ref=sr_1_1_sspa?crid=1CNECBLDD1S7G&dib=eyJ2IjoiMSJ9.LC7OO9cSAPOsjYPSG_Cm4wWDpqqnW5c5SaKttGQqPFwwAJSKyqbAcxBbbFCa2pEIWYKOqTd5DJtcvo2h0llodSrozg2sXCbWrCg5bRGWU2L09cV5M6ET42giimC7u439iOdr_HkqIlI8jRRtsup5wSy3MrmP3kWQxlm9pp0IsDi2vgOWwauzI7Ro606ixwkGEzakSgrow6tQ0YNsvPOOiVtgCDrtnY4O0cBrRCq6gQM.ZgjhJWOSuF-gPMBm02H8dh_lYw_tvdFchQFDjDhwusM&dib_tag=se&keywords=Bag&qid=1764854698&sprefix=bag%2Caps%2C273&sr=8-1-spons&aref=U5aTtTNdbP&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
        //driver.findElement(firstProduct).click();
    }


}
