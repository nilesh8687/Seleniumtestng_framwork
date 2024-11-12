package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObjects {

	public WebDriver driver;
	
	private By firstname = By.xpath("//input[@id='input-firstname']");
	private By lastname = By.xpath("//input[@id='input-lastname']");
	private By email = By.xpath("//input[@id='input-email']");
	private By telephone = By.xpath("//input[@id='input-telephone']");
	private By password = By.xpath("//input[@id='input-password']");
	private By passwordconfirm = By.xpath("//input[@id='input-confirm']");
	private By Subscribeyes = By.xpath("(//input[@type='radio'])[2]");
	private By Subscribeno = By.xpath("(//input[@type='radio'])[3]");
	private By PrivacyPolicy  = By.xpath("//input[@name='agree']");
	private By cont  = By.xpath("//input[@value='Continue']");
	private By accountCreationSuccess =By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	private By firstnamewarning = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By lastnamewarning  = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By emailwarning  = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By telephonewarning  = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By passwordwarning  = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By passwordconfirmwarning  = By.xpath("//div[text()='Password confirmation does not match password!']");
	private By privacypolicywarning = By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");
	//--------------------------
	private By actualResult =By.xpath("//h1[text()='Your Account Has Been Created!']");
			
	public registerPageObjects(WebDriver driver) {
		this.driver =driver;
	}
	public WebElement accoutcreationsuccess() {
		return driver.findElement(accountCreationSuccess);
	}
	
	public WebElement getfirstname() {
		return driver.findElement(firstname);
		
	}
	public WebElement getlastname() {
		return driver.findElement(lastname);
		
	}
	public WebElement getemail() {
		return driver.findElement(email);
		
	}
	public WebElement gettelephone() {
		return driver.findElement(telephone);
		
	}
	public WebElement getpassword() {
		return driver.findElement(password);
		
	}
	public WebElement getpasswordconfirm() {
		return driver.findElement(passwordconfirm);
		
	}
	public WebElement getSubscribeyes() {
		return driver.findElement(Subscribeyes);
		
	}
	public WebElement getSubscribeno() {
		return driver.findElement(Subscribeno);
		
	}
	public WebElement getPrivacyPolicy() {
		return driver.findElement(PrivacyPolicy);
		
	}
	public WebElement getcont() {
		return driver.findElement(cont);
		
	}
	
	//================================
	public WebElement getfirstnamewarning() {
		return driver.findElement(firstnamewarning);
		
	}
	public WebElement getlastnamewarning() {
		return driver.findElement(lastnamewarning);
		
	}
	public WebElement getemailwarning() {
		return driver.findElement(emailwarning);
		
	}
	public WebElement gettelephonewarning() {
		return driver.findElement(telephonewarning);
		
	}
	public WebElement getpasswordwarning() {
		return driver.findElement(passwordwarning);
		
	}
	public WebElement getpasswordconfirmwarning() {
		return driver.findElement(passwordconfirmwarning);
		
	}
	public WebElement getprivacypolicywarning() {
		return driver.findElement(privacypolicywarning);
	
	}

}
