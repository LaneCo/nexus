
package tests;

import org.testng.annotations.Test;
import layouts.QualitasTransferInsurance;
import utilities.Driver;
import utilities.LogQualitasTransferInsurance;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasTransferInsurance extends Driver{

	utilities.Config cfg = new utilities.Config();
	ITestResult result;
	NewLogin login;
	String user;
	String pass;
	
	@BeforeMethod
	public void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus");
		user = cfg.getProperty("user_nexus");
		pass = cfg.getProperty("pass_nexus");
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new NewLogin();

	 }

	@Test (priority = 2, description = "Issue Qualitas Transfer Insurance policy")
  	public void createPolicy() throws IOException {

		login.login(user, pass);
		  
		QualitasTransferInsurance newPolicy = new QualitasTransferInsurance();
		System.out.println("Issue Qualitas Transfer Insurance policy");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait(2000);
		newPolicy.getProduct().click();
		wait(1000);	
		newPolicy.getPersonalInformationTab().click();
		//Personal Information
		newPolicy.getName().sendKeys("Mariana");
		newPolicy.getLastname().sendKeys("Atondo Lopez");
		newPolicy.getAddress().sendKeys("Calle girasoles 76 col. bustamante");
		newPolicy.getCity().sendKeys("Obregon");
		newPolicy.getCountry().selectByVisibleText("Mexico");
		newPolicy.getState().selectByVisibleText("SONORA");
		newPolicy.getZip().sendKeys("33000");
		newPolicy.getPhone().sendKeys("013361251444");
		newPolicy.getEmail().sendKeys("ramon@test.com");
		newPolicy.getVehicleDescriptionTab().click();
		//Vehicle description
		newPolicy.getVehicleYear().selectByVisibleText("2004");
		newPolicy.getMake().selectByVisibleText("FORD"); 
		newPolicy.getModel().selectByVisibleText("FUSION");
		newPolicy.getVehicleCountry().selectByVisibleText("United States of America");
		newPolicy.getVehicleState().selectByVisibleText("ALASKA");
		newPolicy.getPlates().sendKeys("5ZR1233");
		newPolicy.getVehicleId().sendKeys("TESTSERIEAUT005");
	  
		//Payment
		wait(2000);
		newPolicy.getPaymentTab().click();
		newPolicy.getPayment().selectByVisibleText("Cash");
		//Make the purchase
		newPolicy.getPurchase().click();
		//Confirm the purchase
		newPolicy.confirmation();
		wait(3000);
		newPolicy.closePolicy().click();
		wait(2000);
		String close = Keys.chord(Keys.ALT,Keys.F4);
		newPolicy.closePolicy().sendKeys(close);
		//Get the policy number issued
		String Text = newPolicy.getPolicy().getText();
		System.out.println(Text);
		String[] parts = Text.split(":");
		System.out.println("The policy was issued correctly with the number: "+parts[1]);
		String line = "The policy was issued correctly with the number: "+parts[1];
		LogQualitasTransferInsurance.write(line);
		wait(1500);
		login.Logout();
  }
  
	@AfterMethod
	  public void afterMethod(ITestResult result)
	  {
		  System.out.println("@AfterTest closing driver");
		  wait(3000);
		  driver.quit();
	      try
	      {
	      if(result.getStatus() == ITestResult.SUCCESS)
	      {
	    	  LogQualitasTransferInsurance.write("The test passed");
	          System.out.println("passed **********");
	      }
	      else if(result.getStatus() == ITestResult.FAILURE)
	      {
	    	  LogQualitasTransferInsurance.write("The test failed");
	          System.out.println("Failed ***********");
	      }

	      else if(result.getStatus() == ITestResult.SKIP )
	      {
	          System.out.println("Skiped***********");
	      }
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace(); 
	      }
	  }

}
