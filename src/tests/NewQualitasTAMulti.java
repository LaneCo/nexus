
package tests;

import org.testng.annotations.Test;
import layouts.QualitasTAMulti;
import utilities.Driver;
import utilities.LogQualitasTaMulti;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasTAMulti extends Driver{

	utilities.Config cfg = new utilities.Config();
	
	@BeforeMethod
	public void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus"); 
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	 }

  @Test (priority = 2, description = "Issue QualitasTA Multi policy")
  	public void createPolicy() throws IOException {
	  NewLogin login = new NewLogin();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);
	  
	  String veh_num = "2"; //enter the number of vehicles
	  QualitasTAMulti newPolicy = new QualitasTAMulti();
	  System.out.println("Issue QualitasTA Multi policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.getProduct().click();
	  wait(1000);
	  //Policy Data
			  /*Select Plan
			   *30 Days Annual
			   *40 Days Annual
			   *50 Days Annual
			   *365 Days Annual
			   *3 Days Daily
			   *7 Days Daily 
			   *10 Days Daily
			   *15 Days Daily
			   *30 Days Daily*/
	  newPolicy.getPackages().selectByVisibleText("50 Days Annual");
	  if ( (veh_num).equals("3") )
	  {
		  newPolicy.getVehicles().selectByVisibleText(veh_num);
	  }
			  /*Select liability
			   *$150,000.00
			   * $300,000.00*/
	  newPolicy.getLiability().selectByVisibleText("$300,000.00");
	  newPolicy.getPersonalInformation().click();
	  //Personal Information
	  newPolicy.getName().sendKeys("Ruth");
	  newPolicy.getLastName().sendKeys("Gonzalez Cabrera");
	  newPolicy.getAddress().sendKeys("Calle ruiz cortines 987");
	  newPolicy.getCity().sendKeys("San Luis");
	  newPolicy.getCountry().selectByVisibleText("Mexico");
	  newPolicy.getState().selectByVisibleText("SONORA");
	  newPolicy.getZip().sendKeys("11200");
	  newPolicy.getPhone().sendKeys("6861245");
	  newPolicy.getVehicleDescription().click();
	  //Vehicle description
	  switch(veh_num){
	  	case "1": 
	  			newPolicy.getVehicleType().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.getYear().selectByVisibleText("2011");
	  			newPolicy.getMake().selectByVisibleText("CHRYSLER");
	  			newPolicy.getModel().selectByVisibleText("300");
	  			newPolicy.getVehicleCountry().selectByVisibleText("United States of America");
	  			newPolicy.getVehicleState().selectByVisibleText("CONNECTICUT");
	  			newPolicy.getPlates().sendKeys("5ZR1254");
	  			newPolicy.getVehicleID().sendKeys("ABstABriW222457");
	  			newPolicy.getJustOneVehicle().click();
	  			break;
	  	case "2":
		  		newPolicy.getVehicleType().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.getYear().selectByVisibleText("2011");
	  			newPolicy.getMake().selectByVisibleText("CHRYSLER");
	  			newPolicy.getModel().selectByVisibleText("300");
	  			newPolicy.getVehicleCountry().selectByVisibleText("United States of America");
	  			newPolicy.getVehicleState().selectByVisibleText("CONNECTICUT");
	  			newPolicy.getPlates().sendKeys("5ZR1254");
	  			newPolicy.getVehicleID().sendKeys("TESTSERIEAUT003");
	  			newPolicy.getSecondVehicle().click();
	  			newPolicy.getTypeSecondVehicle().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.getYearSecondVehicle().selectByVisibleText("2011");
	  			newPolicy.getMakeSecondVehicle().selectByVisibleText("CHRYSLER");
	  			newPolicy.getModelSecondVehicle().selectByVisibleText("300");
	  			newPolicy.getCountrySecondVehicle().selectByVisibleText("United States of America");
	  			newPolicy.getStateSecondVehicle().selectByVisibleText("CONNECTICUT");
	  			newPolicy.getPlatesSecondVehicle().sendKeys("5ZR1254");
	  			newPolicy.getIdSecondVehicle().sendKeys("TESTSERIEAUT004");
	  			break;
	  	case "3":
		  		newPolicy.getVehicleType().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.getYear().selectByVisibleText("2011");
	  			newPolicy.getMake().selectByVisibleText("CHRYSLER");
	  			newPolicy.getModel().selectByVisibleText("300");
	  			newPolicy.getVehicleCountry().selectByVisibleText("United States of America");
	  			newPolicy.getVehicleState().selectByVisibleText("CONNECTICUT");
	  			newPolicy.getPlates().sendKeys("5ZR1254");
	  			newPolicy.getVehicleID().sendKeys("TESTSERIEAUT001");
	  			newPolicy.getSecondVehicle().click();
	  			newPolicy.getTypeSecondVehicle().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.getYearSecondVehicle().selectByVisibleText("2011");
	  			newPolicy.getMakeSecondVehicle().selectByVisibleText("CHRYSLER");
	  			newPolicy.getModelSecondVehicle().selectByVisibleText("300");
	  			newPolicy.getCountrySecondVehicle().selectByVisibleText("United States of America");
	  			newPolicy.getStateSecondVehicle().selectByVisibleText("CONNECTICUT");
	  			newPolicy.getPlatesSecondVehicle().sendKeys("5ZR1254");
	  			newPolicy.getIdSecondVehicle().sendKeys("testSerie123456");
	  			newPolicy.getThirdVehicle().click();
	  			newPolicy.getTypeThirdVehicle().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.getYearThirdVehicle().selectByVisibleText("2011");
	  			newPolicy.getMakeThirdVehicle().selectByVisibleText("CHRYSLER");
	  			newPolicy.getModelThirdVehicle().selectByVisibleText("300");
	  			newPolicy.getCountryThirdVehicle().selectByVisibleText("United States of America");
	  			newPolicy.getStateThirdVehicle().selectByVisibleText("CONNECTICUT");
	  			newPolicy.getPlatesThirdVehicle().sendKeys("5ZR1254");
	  			newPolicy.getIdThirdVehicle().sendKeys("ABstABrie124457");
	  			break;		  			
	  }
	  
	  //Payment
	  wait(2000);
	  newPolicy.getPaymentTab().click();
	  newPolicy.getPayment().selectByVisibleText("Agent's Credit Card");
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
	  LogQualitasTaMulti.write(line);
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
    	  LogQualitasTaMulti.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasTaMulti.write("The test failed");
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
