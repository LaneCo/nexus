
package tests;

import org.testng.annotations.Test;
import layouts.QualitasTA;
import utilities.Driver;
import utilities.LogQualitasTA;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasTA extends Driver{

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

  @Test (priority = 2, description = "Issue Qualitas TA policy")
  	public void createPolicy() throws IOException {
	  login.login(user, pass);	
	  
	  System.out.println("Emitir poliza Qualitas TA");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  QualitasTA newPolicy = new QualitasTA();
	  wait(2000);
	  
	  newPolicy.getProduct().click();
	  wait(10000);
	  //Policy Data
	  newPolicy.getValue().sendKeys("15300");
	  newPolicy.getBrokeerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.getBrokeerFee().sendKeys("40");
	  newPolicy.getPersonalInformationTab().click();
	  //Personal Information
	  newPolicy.getName().sendKeys("Alonso");
	  newPolicy.getLastName().sendKeys("Cervantes");
	  newPolicy.getAddress().sendKeys("Calle Girasoles 775, fracc. Principal");
	  newPolicy.getCity().sendKeys("Tijuana");
	  newPolicy.getCountry().selectByVisibleText("Mexico");
	  newPolicy.getState().selectByVisibleText("AGUASCALIENTES");
	  newPolicy.getZip().sendKeys("12345");
	  newPolicy.getPhone().sendKeys("6641234567");
	  newPolicy.getEmail().sendKeys("ccortez@arkusnexus.com");
	  newPolicy.getVehicleDescriptionTab().click();
	  //vehicle description
	  newPolicy.getVehicleId().sendKeys("Seriee02AL");
	  newPolicy.getYear().selectByVisibleText("2012");
	  newPolicy.getMake().sendKeys("Nissan");
	  newPolicy.getModel().sendKeys("Sentra");
	  newPolicy.getVehicleCountry().selectByVisibleText("Canada");
	  newPolicy.getVehicleState().selectByVisibleText("ALBERTA");
	  newPolicy.getPlates().sendKeys("AHT36T8");
	  //Payment
	  newPolicy.getPaymentTab().click();
	  newPolicy.getPayment().selectByVisibleText("Cash");
	  //make the purchase
	  newPolicy.getPurchase().click();
	  //confirm the purchase
	  newPolicy.confirmation();
	  wait(3000);
	  newPolicy.getClosePolicy().click();
	  wait(2000);
	  String close = Keys.chord(Keys.ALT,Keys.F4);
	  newPolicy.getClosePolicy().sendKeys(close);
	  //Obtain the policy number issued
	  String Text = newPolicy.getPolicy().getText();
	  System.out.println(Text);
	  String[] parts = Text.split(":");
	  System.out.println("The policy was issued correctly with the number: "+parts[1]);
	  String line = "The policy was issued correctly with the number: "+parts[1];
	  LogQualitasTA.write(line);
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
    	  LogQualitasTA.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasTA.write("The test failed");
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
