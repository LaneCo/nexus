
package tests;

import org.testng.annotations.Test;
import layouts.QualitasMandatory;
import utilities.Driver;
import utilities.LogQualitasMandatory;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasMandatory extends Driver{
	
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

  @Test (priority = 2, description = "Issue Qualitas Qualitas Mandatory BC Liability Only policy")
  	public void createPolicy() throws IOException {
	  
	  login.login(user, pass);
	  
	  System.out.println("Issue Qualitas Qualitas Mandatory BC Liability Only policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  QualitasMandatory newPolicy = new QualitasMandatory();
	  newPolicy.getProduct().click();
	  wait(10000);
	  //Policy Data
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
	  newPolicy.getVehicleDescriptionType().click();
	  //Vehicle description
	  newPolicy.getYear().selectByVisibleText("2011");
	  newPolicy.getMake().selectByVisibleText("FORD");
	  newPolicy.getModel().selectByVisibleText("EDGE");
	  newPolicy.getVehicleCountry().selectByVisibleText("Canada");
	  newPolicy.getVehicleState().selectByVisibleText("YUKON");
	  newPolicy.getPlates().sendKeys("5Z1R289");
	  newPolicy.getVehicleId().sendKeys("testTYiW12ww121220");
	  //Payment
	  newPolicy.getPaymentTab().click();
	  newPolicy.getPayment().selectByVisibleText("Cash");
	  //Make the purchase
	  newPolicy.getPurchase().click();
	  //Confirm the purchase
	  newPolicy.confirmation();;
	  wait(3000);
	  newPolicy.getClosePolicy().click();
	  wait(2000);
	  String close = Keys.chord(Keys.ALT,Keys.F4);
	  newPolicy.getClosePolicy().sendKeys(close);
	  //Get the policy number issued
	  String Text = newPolicy.getPolicy().getText();
	  System.out.println(Text);
	  String[] parts = Text.split(":");
	  System.out.println("The policy was issued correctly with the number: "+parts[1]);
	  String line = "The policy was issued correctly with the number: "+parts[1];
	  LogQualitasMandatory.write(line);
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
    	  LogQualitasMandatory.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasMandatory.write("The test failed");
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
