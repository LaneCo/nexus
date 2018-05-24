
package nexus;

import org.testng.annotations.Test;
import issuers_nexus.QualitasTADMRT;
import tools.Utilities;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasTADMRT extends Utilities{

	tools.Config cfg = new tools.Config();
	
	@BeforeMethod
	public  void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus");	
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	 }

  @Test (priority = 2, description = "Issue QualitasTA DM RT policy")
  	public void createPolicy() {
	  Validar_login login = new Validar_login();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);
	  QualitasTADMRT newPolicy = new QualitasTADMRT();
	  System.out.println("Issue QualitasTA DM RT policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.selectProduct().click();
	  wait(10000);
	  //Policy Data
	  newPolicy.inputValue().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.inputValue().sendKeys("6200");
	  newPolicy.inputBrokerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.inputBrokerFee().sendKeys("38");
	  newPolicy.personalInformation().click();
	  //Personal Information
	  newPolicy.inputName().sendKeys("Dayana");
	  newPolicy.inputLastName().sendKeys("Flores Magon");
	  newPolicy.inputAddres().sendKeys("Calle Industrial 448");
	  newPolicy.inputCity().sendKeys("Tecate");
	  newPolicy.dropdown_country().selectByVisibleText("Mexico");
	  newPolicy.dropdown_state().selectByVisibleText("HIDALGO");
	  newPolicy.inputZip().sendKeys("15300");
	  newPolicy.inputPhone().sendKeys("4541652014");
	  newPolicy.vehicleDescription().click();
	  //Vehicle description
	  newPolicy.dropdown_year().selectByVisibleText("2011");
	  newPolicy.select_make().selectByVisibleText("FORD");
	  newPolicy.select_model().selectByVisibleText("EDGE");
	  newPolicy.dropdown_veh_country().selectByVisibleText("Canada");
	  newPolicy.dropdown_veh_state().selectByVisibleText("YUKON");
	  newPolicy.inputPlates().sendKeys("5Z1R289");
	  newPolicy.inputVehicleID().sendKeys("teswxzriW112234");
	  //Payment
	  newPolicy.inputPayment().click();
	  newPolicy.dropdown_payment().selectByVisibleText("Cash");
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
