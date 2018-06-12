package tests;

import org.testng.annotations.Test;
import layouts.QualitasDriversLicense;
import utilities.Driver;
import utilities.LogQualitasDriversLicense;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewQualitasDriversLicense extends Driver{

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

  @Test (priority = 2, description = "Issue Qualitas Drivers License Policy")
  	public void createPolicy() throws IOException {
	  
	  login.login(user, pass);	  
	  System.out.println("Issue Qualitas Drivers License Policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  QualitasDriversLicense newPolicy = new QualitasDriversLicense();
	  newPolicy.getProduct().click();
	  wait(10000);
	  String licenses = "1"; //Select the number of licences to issue
	  //Policy data
	  //Select the package to be issued or leave the 1rt default
	  newPolicy.getPackages().selectByVisibleText("Liability Only $300,000 CSL"); //Package 1
	  //newPolicy.selectPackage().selectByVisibleText("Liability Only $150,000 CSL"); //Package 2
	  //newPolicy.selectPackage().selectByVisibleText("Liability Only $30,000 CSL"); //Package 3
	  //newPolicy.selectPackage().selectByVisibleText("Liability Only $30,000 CSL"); //Package 4
	  //newPolicy.inputValue().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  System.out.println("selected licenses: "+licenses);
	  newPolicy.getLicenses().selectByVisibleText(licenses);

	  newPolicy.getPersonalInformationTab().click();
	  //Personal Information
	  newPolicy.getName().sendKeys("Natalia");
	  newPolicy.getLastName().sendKeys("Galindo Estrada");
	  newPolicy.getAddress().sendKeys("Calle tercera 338");
	  newPolicy.getCity().sendKeys("Rosarito");
	  newPolicy.getCountry().selectByVisibleText("Mexico");
	  newPolicy.getState().selectByVisibleText("NAYARIT");
	  newPolicy.getZip().sendKeys("33800");
	  newPolicy.getPhone().sendKeys("3692251478");
	  newPolicy.getEmail().sendKeys("test@test.com");
	  wait(2000);
	  newPolicy.getLicenseTab().click();
	  //Enter licenses
	  
	  switch(licenses){
	  	case "1": 	newPolicy.getNameLicense1().sendKeys("conductorUno");;
	  				newPolicy.getAddressLicense1().sendKeys("direccion conductor1");
	  				newPolicy.getNumberLicense1().sendKeys("1288567");
	  				break;
	  	case "2": 	newPolicy.getNameLicense1().sendKeys("conductorUno");;
					newPolicy.getAddressLicense1().sendKeys("direccion conductor1");
					newPolicy.getNumberLicense1().sendKeys("1234567");
					newPolicy.getNameLicense2().sendKeys("conductorDos");;
					newPolicy.getAddressLicense2().sendKeys("direccion conductor2");
					newPolicy.getNumberLicense2().sendKeys("2223554");
					break;	
	  	case "3": 	newPolicy.getNameLicense1().sendKeys("conductorUno");;
					newPolicy.getAddressLicense1().sendKeys("direccion conductor1");
					newPolicy.getNumberLicense1().sendKeys("1234567");
					newPolicy.getNameLicense2().sendKeys("conductorDos");;
					newPolicy.getAddressLicense2().sendKeys("direccion conductor2");
					newPolicy.getNumberLicense2().sendKeys("2223554");
					newPolicy.getNameLicense3().sendKeys("conductorTres");;
					newPolicy.getAddressLicense3().sendKeys("direccion conductor3");
					newPolicy.getNumberLicense3().sendKeys("33453554");
					break;
	  }

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
	  System.out.println("The policy was issued correctly with the number: "+parts[1]);
	  String line = "The policy was issued correctly with the number: "+parts[1];
	  LogQualitasDriversLicense.write(line);
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
    	  LogQualitasDriversLicense.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogQualitasDriversLicense.write("The test failed");
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
