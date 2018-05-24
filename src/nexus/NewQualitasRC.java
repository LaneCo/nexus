package nexus;

import org.testng.annotations.Test;

import issuers_nexus.QualitasRC;
import tools.Utilities;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasRC extends Utilities{

	tools.Config cfg = new tools.Config();
	
  @BeforeClass
  public void beforeClass() {
	 String url = cfg.getProperty("url_nexus"); 
	 driver.navigate().to(url);
	// Maximize the browser
	 driver.manage().window().maximize();
		
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  

  @Test (description = "Issue Qualitas RC Policy")
  public void createPolicy() {
	  Validar_login login = new Validar_login();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);
	  QualitasRC newPolicy = new QualitasRC();	
	  System.out.println("Issue Qualitas RC Policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.selectProduct().click();
	  wait(2000);
	  newPolicy.inputBrokerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.inputBrokerFee().sendKeys("8");
	  wait(2000);
	  newPolicy.select_days().selectByVisibleText("3");
	  wait(2000);
	  newPolicy.insuredData().click();
	  //Personal Information
	  newPolicy.inputInsured().sendKeys("Diana Solorio Texas");
	  newPolicy.inputAddres().sendKeys("Calle 20 Noviembre 338");
	  newPolicy.inputCity().sendKeys("Monterrey");
	  newPolicy.dropdown_country().selectByVisibleText("Mexico");
	  newPolicy.dropdown_state().selectByVisibleText("NUEVO LEON");
	  newPolicy.inputZip().sendKeys("33600");
	  newPolicy.inputPhone().sendKeys("3231569814");
	  newPolicy.inputRfc().sendKeys("ICO8106281T7");
	  wait(2000);
	  newPolicy.vehicleDescription().click();
	  //Vehicle description
	  newPolicy.dropdown_year().selectByVisibleText("2008");
	  newPolicy.select_make().selectByVisibleText("CHEVROLET");
	  newPolicy.select_model().selectByVisibleText("AVEO");
	  newPolicy.dropdown_veh_state().selectByVisibleText("COLIMA");
	  newPolicy.inputPlates().sendKeys("7NTB606");
	  newPolicy.inputVehicleID().sendKeys("testSerWWW12123");
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
