
package tests;

import org.testng.annotations.Test;
import layouts.QualitasTADMRT;
import utilities.Driver;
import utilities.LogQualitasTADMRT;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasTADMRT extends Driver{

	utilities.Config cfg = new utilities.Config();
	ITestResult result;
	NewLogin login;
	String user;
	String pass;
	
	@BeforeMethod
	public  void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus");
		user = cfg.getProperty("user_nexus");
		pass = cfg.getProperty("pass_nexus");
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new NewLogin();
	 }

  @Test (priority = 2, description = "Issue QualitasTA DM RT policy")
  	public void createPolicy() throws IOException {
	  login.login(user, pass);
	  QualitasTADMRT newPolicy = new QualitasTADMRT();
	  System.out.println("Issue QualitasTA DM RT policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.getProduct().click();
	  wait(10000);
	  //Policy Data
	  newPolicy.getValue().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.getValue().sendKeys("6200");
	  newPolicy.getBrokerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.getBrokerFee().sendKeys("38");
	  newPolicy.getPersonalInformation().click();
	  //Personal Information
	  newPolicy.getName().sendKeys("Dayana");
	  newPolicy.getLastName().sendKeys("Flores Magon");
	  newPolicy.getAddress().sendKeys("Calle Industrial 448");
	  newPolicy.getCity().sendKeys("Tecate");
	  newPolicy.getCountry().selectByVisibleText("Mexico");
	  newPolicy.getState().selectByVisibleText("HIDALGO");
	  newPolicy.getZip().sendKeys("15300");
	  newPolicy.getPhone().sendKeys("4541652014");
	  newPolicy.getVehicleDescription().click();
	  //Vehicle description
	  newPolicy.getYear().selectByVisibleText("2011");
	  newPolicy.getMake().selectByVisibleText("FORD");
	  newPolicy.getModel().selectByVisibleText("EDGE");
	  newPolicy.getVehicleCountry().selectByVisibleText("Canada");
	  newPolicy.getVehicleState().selectByVisibleText("YUKON");
	  newPolicy.getPlates().sendKeys("5Z1R289");
	  newPolicy.getVehicleID().sendKeys("twswxzriW112234");
	  //Payment
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
	  LogQualitasTADMRT.write(line);
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
    	  LogQualitasTADMRT.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasTADMRT.write("The test failed");
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
