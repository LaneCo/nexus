
package nexus;

import org.testng.annotations.Test;
import issuers_nexus.QualitasTA;
import tools.Utilities;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasTA extends Utilities{

	tools.Config cfg = new tools.Config();
	
	@BeforeMethod
	public void OpenBrowser() {
		
		String url = cfg.getProperty("url_nexus");	
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 }

  @Test (priority = 2, description = "Issue Qualitas TA policy")
  	public void createPolicy() {

	  Validar_login login = new Validar_login();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);	
	  QualitasTA newPolicy = new QualitasTA();
	  System.out.println("Emitir poliza Qualitas TA");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.selectProduct().click();
	  wait(10000);
	  //Policy Data
	  newPolicy.inputValue().sendKeys("15300");
	  newPolicy.inputBrokerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.inputBrokerFee().sendKeys("40");
	  newPolicy.personalInformation().click();
	  //Personal Information
	  newPolicy.inputName().sendKeys("Alonso");
	  newPolicy.inputLastName().sendKeys("Cervantes");
	  newPolicy.inputAddres().sendKeys("Calle Girasoles 775, fracc. Principal");
	  newPolicy.inputCity().sendKeys("Tijuana");
	  newPolicy.dropdown_country().selectByVisibleText("Mexico");
	  newPolicy.dropdown_state().selectByVisibleText("AGUASCALIENTES");
	  newPolicy.inputZip().sendKeys("12345");
	  newPolicy.inputPhone().sendKeys("6641234567");
	  newPolicy.inputEmail().sendKeys("ccortez@arkusnexus.com");
	  newPolicy.vehicleDescription().click();
	  //vehicle description
	  newPolicy.inputVehicleID().sendKeys("serUXAWWG5443");
	  newPolicy.dropdown_year().selectByVisibleText("2012");
	  newPolicy.inputMake().sendKeys("Nissan");
	  newPolicy.inputModel().sendKeys("Sentra");
	  newPolicy.dropdown_veh_country().selectByVisibleText("Canada");
	  newPolicy.dropdown_veh_state().selectByVisibleText("ALBERTA");
	  newPolicy.inputPlates().sendKeys("AHT36T8");
	  //Payment
	  newPolicy.inputPayment().click();
	  newPolicy.dropdown_payment().selectByVisibleText("Cash");
	  //make the purchase
	  newPolicy.purchase().click();
	  //confirm the purchase
	  newPolicy.confirmation();
	  wait(3000);
	  newPolicy.closePolicy().click();
	  wait(2000);
	  String close = Keys.chord(Keys.ALT,Keys.F4);
	  newPolicy.closePolicy().sendKeys(close);
	  //Obtain the policy number issued
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
