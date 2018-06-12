package tests;

import org.testng.annotations.Test;
import layouts.QualitasRC;
import utilities.Driver;
import utilities.LogQualitasRC;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasRC extends Driver{

	utilities.Config cfg = new utilities.Config();
	ITestResult result;
	NewLogin login;
	String user;
	String pass;	
	
@BeforeMethod
  public void beforeClass(){
	 String url = cfg.getProperty("url_nexus");
	 System.out.println("url: "+url);
	 user = cfg.getProperty("user_nexus");
	 //System.out.println("user: "+user);
	 pass = cfg.getProperty("pass_nexus");
	 //System.out.println("password: "+pass);
	 driver.navigate().to(url);
	 // Maximize the browser
	 driver.manage().window().maximize();	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 login = new NewLogin();
  }
  

  @Test (description = "Issue Qualitas RC Policy")
  public void createPolicy() throws IOException {

	  login.login(user, pass);
	  
	  System.out.println("Issue Qualitas RC Policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  QualitasRC newPolicy = new QualitasRC();
	  newPolicy.getProduct().click();
	  wait(2000);
	  //Policy Data
	  
	  newPolicy.getBrokerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.getBrokerFee().sendKeys("8");
	  wait(2000);
	  newPolicy.getDays().selectByVisibleText("2");
	  wait(2000);
	  newPolicy.getInsuredDataTab().click();
	  //Personal Information
	  newPolicy.getInsured().sendKeys("Diana Solorio Texas");
	  newPolicy.getAddress().sendKeys("Calle 20 Noviembre 338");
	  newPolicy.getCity().sendKeys("Monterrey");
	  newPolicy.getCountry().selectByVisibleText("Mexico");
	  newPolicy.getState().selectByVisibleText("NUEVO LEON");
	  newPolicy.getZip().sendKeys("33600");
	  newPolicy.getPhone().sendKeys("3231569814");
	  newPolicy.getRfc().sendKeys("ICO8106281T7");
	  wait(2000);
	  newPolicy.getVehicleDescription().click();
	  //Vehicle description
	  newPolicy.getYear().selectByVisibleText("2008");
	  newPolicy.getMake().selectByVisibleText("CHEVROLET");
	  newPolicy.getModel().selectByVisibleText("AVEO");
	  newPolicy.getStateVehicle().selectByVisibleText("COLIMA");
	  newPolicy.getPlates().sendKeys("7NTB606");
	  newPolicy.getVehicleId().sendKeys("testSW2rsWWs2123");
	  //Payment
	  newPolicy.getPaymentTab().click();
	  newPolicy.getPayment().selectByVisibleText("Client's Credit Card");
	  //Make the purchase
	  newPolicy.getPurchase().click();
	  //Confirm the purchase
	  newPolicy.confirmation();
	  wait(3000);
	  newPolicy.getClosePolicy().click();
	  wait(2000);
	  String close = Keys.chord(Keys.ALT,Keys.F4);
	  newPolicy.getClosePolicy().sendKeys(close);
	  //Get the policy number issued
	  String Text = newPolicy.getPolicy().getText();
	  System.out.println(Text);
	  String[] parts = Text.split(":");
	  String line = "The policy was issued correctly with the number: "+parts[1];
	  LogQualitasRC.write(line);
	  System.out.println("The policy was issued correctly with the number: "+parts[1]);
	  wait(1000);
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

    	  LogQualitasRC.write("The test passed");
          System.out.println("passed **********");
      }

      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasRC.write("The test failed");
          System.out.println("Failed ***********");

      }

       else if(result.getStatus() == ITestResult.SKIP ){

          System.out.println("Skiped***********");

      }
      }
     catch(Exception e)
     {
       e.printStackTrace();
     }
      
  }

}
