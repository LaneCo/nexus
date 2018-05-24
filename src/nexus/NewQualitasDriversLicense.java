//Policy with brokeer fee,Full coverage, date and actual hour, and cash by payment
package nexus;

import org.testng.annotations.Test;
import issuers_nexus.QualitasDriversLicense;
import tools.Utilities;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasDriversLicense extends Utilities{

	tools.Config cfg = new tools.Config();
	
	@BeforeMethod
	public void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus");	
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	 }

  @Test (priority = 2, description = "Issue Qualitas Drivers License Policy")
  	public void createPolicy() {
	  Validar_login login = new Validar_login();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);
	  QualitasDriversLicense newPolicy = new QualitasDriversLicense();
	  System.out.println("Emitir poliza Qualitas Drivers License");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.selectProduct().click();
	  wait(10000);
	  String licenses = "1"; //Select the number of licences to issue
	  //Policy data
	  //Select the package to be issued or leave the 1rt default
	  newPolicy.selectPackage().selectByVisibleText("Liability Only $300,000 CSL"); //Package 1
	  //newPolicy.selectPackage().selectByVisibleText("Liability Only $150,000 CSL"); //Package 2
	  //newPolicy.selectPackage().selectByVisibleText("Liability Only $30,000 CSL"); //Package 3
	  //newPolicy.selectPackage().selectByVisibleText("Liability Only $30,000 CSL"); //Package 4
	  //newPolicy.inputValue().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  System.out.println("selected licenses: "+licenses);
	  newPolicy.licenses().selectByVisibleText(licenses);

	  newPolicy.personalInformation().click();
	  //Personal Information
	  newPolicy.inputName().sendKeys("Natalia");
	  newPolicy.inputLastName().sendKeys("Galindo Estrada");
	  newPolicy.inputAddres().sendKeys("Calle tercera 338");
	  newPolicy.inputCity().sendKeys("Rosarito");
	  newPolicy.dropdown_country().selectByVisibleText("Mexico");
	  newPolicy.dropdown_state().selectByVisibleText("NAYARIT");
	  newPolicy.inputZip().sendKeys("33800");
	  newPolicy.inputPhone().sendKeys("3692251478");
	  newPolicy.email().sendKeys("test@test.com");
	  wait(2000);
	  newPolicy.DriverLicence().click();
	  //Enter licenses
	  
	  switch(licenses){
	  	case "1": 	newPolicy.nameLicense1().sendKeys("conductorUno");;
	  				newPolicy.addressLicense1().sendKeys("direccion conductor1");
	  				newPolicy.numberLicense1().sendKeys("1288567");
	  				break;
	  	case "2": 	newPolicy.nameLicense1().sendKeys("conductorUno");;
					newPolicy.addressLicense1().sendKeys("direccion conductor1");
					newPolicy.numberLicense1().sendKeys("1234567");
					newPolicy.nameLicense2().sendKeys("conductorDos");;
					newPolicy.addressLicense2().sendKeys("direccion conductor2");
					newPolicy.numberLicense2().sendKeys("2223554");
					break;	
	  	case "3": 	newPolicy.nameLicense1().sendKeys("conductorUno");;
					newPolicy.addressLicense1().sendKeys("direccion conductor1");
					newPolicy.numberLicense1().sendKeys("1234567");
					newPolicy.nameLicense2().sendKeys("conductorDos");;
					newPolicy.addressLicense2().sendKeys("direccion conductor2");
					newPolicy.numberLicense2().sendKeys("2223554");
					newPolicy.nameLicense3().sendKeys("conductorTres");;
					newPolicy.addressLicense3().sendKeys("direccion conductor3");
					newPolicy.numberLicense3().sendKeys("33453554");
					break;
	  }

	  //Payment
	  newPolicy.inputPayment().click();
	  newPolicy.dropdown_payment().selectByVisibleText("Client's Credit Card");
	  //Make the purchase
	  newPolicy.purchase().click();
	  //Confirm the purchase
	  newPolicy.confirmation();
	  wait(3000);
	  newPolicy.closePolicy().click();
	  wait(2000);
	  String close = Keys.chord(Keys.ALT,Keys.F4);
	  newPolicy.closePolicy().sendKeys(close);
	  //Get the policy number issued
	  String Text = newPolicy.policy().getText();
	  System.out.println(Text);
	  String[] parts = Text.split(":");
	  System.out.println("The policy was issued correctly with the number: "+parts[1]);
	  wait(1500);
	  System.out.println("Closing session...");
	  login.Logout();
	  
  }
  
  	@AfterTest
  public static void closeDriver(){
  
  	System.out.println("@AfterTest closing driver");
  	wait(3000);
  	System.out.println("close");
  	driver.quit();
  }

}
