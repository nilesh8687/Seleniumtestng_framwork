package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageObjects {
	
	public WebDriver driver;
	
	private By myAccount = By.xpath("//a[@title='My Account']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");
	
  
	
	public HomePageObjects(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement clickonmyAccount() {
		return driver.findElement(myAccount);
		
	}
	
	public WebElement clickonRegsiter() {
		return driver.findElement(register);
		
	}
	public WebElement clickonlogin() {
		return driver.findElement(login);
	

}
}
