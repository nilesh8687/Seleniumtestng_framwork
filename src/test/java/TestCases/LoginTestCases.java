package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObjects;

public class LoginTestCases extends baseClass{
	private static final String enabled = null;

	@Test
	public void VerifyLoginWithvalidData() throws IOException {
		
			
		
		
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickonmyAccount().click();
		
		hpo.clickonlogin().click();
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.enterEmail().sendKeys(email);
		lpo.enterLoginPassword().sendKeys("secure123");
		lpo.clickOnSubmit().click();
		
        //SoftAssert sa=new SoftAssert();
        //String loginactual=lpo.actualresultlogin().getText();
		//String logingexpected= "My Account";
		
		//sa.assertEquals(loginactual, logingexpected);
		
		//sa.assertAll();
		commonMethods.handleAssertion(lpo.actualresultlogin().getText(),"My Account");
		
	}
	
 
	public void VerifyLoginWithinvalidData() throws IOException {
    	
    				
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickonmyAccount().click();
		hpo.clickonlogin().click();
		
	LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.enterEmail().sendKeys("rete@gmail.com");
		lpo.enterLoginPassword().sendKeys("hghgj");
		lpo.clickOnSubmit().click();
		
SoftAssert sa=new SoftAssert();
		
		String logingexpected= "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
		String loginactual=lpo.loginfailmsg().getText();
		sa.assertEquals(loginactual, logingexpected);
		
		sa.assertAll();
	}
}
