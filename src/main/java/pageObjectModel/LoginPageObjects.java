package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageObjects {
	
	public WebDriver driver;
	
	private By email =By.xpath("//input[@name='email']");
	private By loginPassword = By.xpath("//input[@name='password']");
	private By submit = By.xpath("//input[@value='Login']");
	private By actualresultlogin =By.xpath("//h2[text()='My Account']");
	private By loginfail=By.xpath("//div[text()=' Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.']");
	
	 
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement enterEmail() {
		return  driver.findElement(email);	
	}
	
	public WebElement enterLoginPassword() {
		return  driver.findElement(loginPassword);	
	}
	
	
	public WebElement clickOnSubmit() {
		return  driver.findElement(submit);	
	}
	public WebElement actualresultlogin() {
		return  driver.findElement(actualresultlogin);	
}
	public WebElement loginfailmsg() {
		return driver.findElement(loginfail);
	}
	
}
