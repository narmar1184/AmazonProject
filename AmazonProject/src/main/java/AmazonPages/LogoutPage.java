package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LogoutPage {
	WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountMenu = By.id("nav-link-accountList");
    By signOutLink = By.xpath("//span[text()='Sign Out']");

    public void logout() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(accountMenu)).perform();
        driver.findElement(signOutLink).click();
    }


}
