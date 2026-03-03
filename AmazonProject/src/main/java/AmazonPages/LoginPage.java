package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	By account = By.id("nav-link-accountList");
	 
	   By email = By.id("ap_email_login");
	    By continueBtn = By.id("continue");
	    By password = By.id("ap_password");
	    By signInSubmit = By.id("signInSubmit"); 
	    public void enterURL() throws InterruptedException{
	    	
	    	driver.get("https://www.amazon.in/");
	    	Thread.sleep(2000);
	    		
	    }
	    public void ClickOnSignInButton() {
	    	
	    	driver.findElement(account).click();
	    }

	    public void LoginDetails(String Username,String Password) throws InterruptedException {
	    	driver.findElement(email).sendKeys(Username);
	    	Thread.sleep(2000);
	    	driver.findElement(continueBtn).click();
	    	Thread.sleep(2000);
	    	driver.findElement(password).sendKeys(Password);
	    	Thread.sleep(1000);
	    	driver.findElement(signInSubmit).click();
	    	
	    	
	    	
	    }
}

