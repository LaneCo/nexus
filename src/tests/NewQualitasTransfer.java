
package tests;

import org.testng.annotations.Test;
import layouts.QualitasTransfer;
import utilities.Driver;
import utilities.LogQualitasTransfer;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasTransfer extends Driver{

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

  @Test (priority = 2, description = "Emitir poliza Qualitas Transfer")
  	public void createPolicy() throws IOException {
	  login.login(user, pass);
	  
	  String person_type = "Moral"; //Type of person
	  QualitasTransfer newPolicy = new QualitasTransfer();
	  System.out.println("Emitir poliza Qualitas Transfer");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.getProduct().click();
	  wait(1000);
	  //Policy Data
			  /*Select Plan
			   *Annual Package 1
			   *Annual Package 2
			   *Annual Package 3
			   *Annual Package 4*/
	  newPolicy.getPackages().selectByVisibleText("Annual Package 4");
	  newPolicy.getBrokeerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.getBrokeerFee().sendKeys("20");
	  newPolicy.getVehicleType().selectByVisibleText("Tractocamion"); //Tractocamion , Rabon , Ligero (Panel)
	  	
	  newPolicy.getPersonalInformationTab().click();
	  //Personal Information
	  if ( (person_type).equals("Moral") )
	  {
		  newPolicy.getCompany().click();
		  newPolicy.getName().sendKeys("Coca Cola SA de CV");
		  newPolicy.getAddress().sendKeys("Calle primera 36-A col. Insurgentes");
		  newPolicy.getCity().sendKeys("DF");
		  newPolicy.getCountry().selectByVisibleText("Mexico");
		  newPolicy.getState().selectByVisibleText("DISTRITO FEDERAL");
		  newPolicy.getZip().sendKeys("22800");
	  }else{
		  newPolicy.getName().sendKeys("Minerva");
		  newPolicy.getLastName().sendKeys("Estrada Camarena");
		  newPolicy.getCalendar().click(); //select Calendar
		  newPolicy.getYearBirthdate().selectByVisibleText("1980"); //birth year
		  newPolicy.getMonthBirthdate().selectByVisibleText("March"); //birth month
		  newPolicy.getDayBirthdate().click(); //birth day
		  newPolicy.getAddress().sendKeys("Calle tercera 338");
		  newPolicy.getCity().sendKeys("Sonoita");
		  newPolicy.getCountry().selectByVisibleText("Mexico");
		  newPolicy.getState().selectByVisibleText("SONORA");
		  newPolicy.getZip().sendKeys("12345");
		  newPolicy.getPhone().sendKeys("6861245");
	  }

	  newPolicy.getVehicleDescriptionTab().click();
	  //Vehicle description
	  newPolicy.getVehicleYear().selectByVisibleText("2001");
	  newPolicy.getMake().sendKeys("Ford"); 
	  newPolicy.getModel().sendKeys("Focus");
	  newPolicy.getVehicleCountry().selectByVisibleText("United States of America");
	  newPolicy.getVehicleState().selectByVisibleText("CONNECTICUT");
	  newPolicy.getPlates().sendKeys("5ZR1254");
	  newPolicy.getVehicleId().sendKeys("TESTSERIEAUT004");
	  
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
	  LogQualitasTransfer.write(line);
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
    	  LogQualitasTransfer.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasTransfer.write("The test failed");
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
