package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.HomePageObjects;
import pageObjectModel.registerPageObjects;

public class registerTestCases extends baseClass {

	@Test
	public void verifyRegsiterationWithValidData() throws IOException, InterruptedException {
		
				
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickonmyAccount().click();
		hpo.clickonRegsiter().click();
		
		
				
		registerPageObjects rpo=new registerPageObjects(driver);
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	//	wait.until(ExpectedConditions.visibilityOf(rpo.getfirstname()));
		commonMethods.handleExplicatWait(driver, 2, rpo.getfirstname());
		
		rpo.getfirstname().sendKeys(constants.firstname);
		rpo.getlastname().sendKeys(constants.lastname);
		rpo.getemail().sendKeys(email);
		rpo.gettelephone().sendKeys(constants.telephone);
		rpo.getpassword().sendKeys(constants.password);
		rpo.getpasswordconfirm().sendKeys(constants.password);
		rpo.getSubscribeno().click();
		rpo.getPrivacyPolicy().click();
		rpo.getcont().click();
		
	//	SoftAssert sa=new SoftAssert();
		
	//	String actual=rpo.accoutcreationsuccess().getText();
	//	String Expected=constants.sucessfullActCreation;		
	//	sa.assertEquals(actual, Expected);
			
	//	sa.assertAll();
		commonMethods.handleAssertion(rpo.accoutcreationsuccess().getText(),constants.sucessfullActCreation);

	}
  @Test
	public void verifyregisterationwithinvaliddata() throws IOException {  	
		
		
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickonmyAccount().click();
		hpo.clickonRegsiter().click();
		
		
		registerPageObjects rpo=new registerPageObjects(driver);
		rpo.getcont().click();
		//SoftAssert sa=new SoftAssert();
		
		String firstNameWarningexpected= "First Name must be between 1 and 32 characters!";
		String FirstNameWarningactual= rpo.getfirstnamewarning().getText();
	//	sa.assertEquals(FirstNameWarningactual, firstNameWarningexpected);
		
		commonMethods.handleAssertion(FirstNameWarningactual, firstNameWarningexpected);
		
		String lastNameWarningexpected= "Last Name must be between 1 and 32 characters!";
		String lastNameWarningactual= rpo.getlastnamewarning().getText();
		//sa.assertEquals(lastNameWarningactual, lastNameWarningexpected);
		
		commonMethods.handleAssertion(lastNameWarningactual, lastNameWarningexpected);
		
		String emailwarningexpected= "E-Mail Address does not appear to be valid!";
		String emailwarningactual= rpo.getemailwarning().getText();
		commonMethods.handleAssertion(emailwarningactual, emailwarningexpected);
		
		
		
		String telephonewarningexpected= "Telephone must be between 3 and 32 characters!";
		String telephonewarningactual= rpo.gettelephonewarning().getText();
		commonMethods.handleAssertion(telephonewarningactual, telephonewarningexpected);
		
		String passwordwarningexpected= "Password must be between 4 and 20 characters!";
		String passwordwarningactual= rpo.getpasswordwarning().getText();
		commonMethods.handleAssertion(passwordwarningactual, passwordwarningexpected);
		
		String passwordconfirmwarningexpected= "Password confirmation does not match password!";
		//String passwordconfirmwarningactual= rpo.getpasswordconfirmwarning().getText();
		//sa.assertEquals(passwordconfirmwarningactual, passwordconfirmwarningexpected);
		
		String privacypolicywarningexpected= "Warning: You must agree to the Privacy Policy!";
		String privacypolicywarningactual= rpo.getprivacypolicywarning().getText();
		commonMethods.handleAssertion(privacypolicywarningactual, privacypolicywarningexpected);
		
       
		
		

	}

}
