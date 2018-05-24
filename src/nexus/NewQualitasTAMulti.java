
package nexus;

import org.testng.annotations.Test;
import issuers_nexus.QualitasTAMulti;
import tools.Utilities;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasTAMulti extends Utilities{

	tools.Config cfg = new tools.Config();
	
	@BeforeMethod
	public void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus"); 
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	 }

  @Test (priority = 2, description = "Issue QualitasTA Multi policy")
  	public void createPolicy() {
	  Validar_login login = new Validar_login();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);
	  
	  String veh_num = "1"; //enter the number of vehicles
	  QualitasTAMulti newPolicy = new QualitasTAMulti();
	  System.out.println("Issue QualitasTA Multi policy");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.selectProduct().click();
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
	  newPolicy.selectPackage().selectByVisibleText("50 Days Annual");
	  if ( (veh_num).equals("3") )
	  {
		  newPolicy.selectVehicles().selectByVisibleText(veh_num);
	  }
			  /*Select liability
			   *$150,000.00
			   * $300,000.00*/
	  newPolicy.selectLiability().selectByVisibleText("$300,000.00");
	  newPolicy.personalInformation().click();
	  //Personal Information
	  newPolicy.inputName().sendKeys("Ruth");
	  newPolicy.inputLastName().sendKeys("Gonzalez Cabrera");
	  newPolicy.inputAddres().sendKeys("Calle ruiz cortines 987");
	  newPolicy.inputCity().sendKeys("San Luis");
	  newPolicy.dropdown_country().selectByVisibleText("Mexico");
	  newPolicy.dropdown_state().selectByVisibleText("SONORA");
	  newPolicy.inputZip().sendKeys("11200");
	  newPolicy.inputPhone().sendKeys("6861245");
	  newPolicy.vehicleDescription().click();
	  //Vehicle description
	  switch(veh_num){
	  	case "1": 
	  			newPolicy.dropdown_type().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.dropdown_year().selectByVisibleText("2011");
	  			newPolicy.select_make().selectByVisibleText("CHRYSLER");
	  			newPolicy.select_model().selectByVisibleText("300");
	  			newPolicy.dropdown_veh_country().selectByVisibleText("United States of America");
	  			newPolicy.dropdown_veh_state().selectByVisibleText("CONNECTICUT");
	  			newPolicy.inputPlates().sendKeys("5ZR1254");
	  			newPolicy.inputVehicleID().sendKeys("ABstABriW222457");
	  			newPolicy.radio_oneVeh().click();
	  			break;
	  	case "2":
		  		newPolicy.dropdown_type().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.dropdown_year().selectByVisibleText("2011");
	  			newPolicy.select_make().selectByVisibleText("CHRYSLER");
	  			newPolicy.select_model().selectByVisibleText("300");
	  			newPolicy.dropdown_veh_country().selectByVisibleText("United States of America");
	  			newPolicy.dropdown_veh_state().selectByVisibleText("CONNECTICUT");
	  			newPolicy.inputPlates().sendKeys("5ZR1254");
	  			newPolicy.inputVehicleID().sendKeys("testSerie12345");
	  			newPolicy.radio_secondVeh().click();
	  			newPolicy.dropdown_type2().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.dropdown_year2().selectByVisibleText("2011");
	  			newPolicy.select_make2().selectByVisibleText("CHRYSLER");
	  			newPolicy.select_model2().selectByVisibleText("300");
	  			newPolicy.dropdown_veh_country2().selectByVisibleText("United States of America");
	  			newPolicy.dropdown_veh_state2().selectByVisibleText("CONNECTICUT");
	  			newPolicy.inputPlates2().sendKeys("5ZR1254");
	  			newPolicy.inputVehicleID2().sendKeys("testSerie123456");
	  			break;
	  	case "3":
		  		newPolicy.dropdown_type().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.dropdown_year().selectByVisibleText("2011");
	  			newPolicy.select_make().selectByVisibleText("CHRYSLER");
	  			newPolicy.select_model().selectByVisibleText("300");
	  			newPolicy.dropdown_veh_country().selectByVisibleText("United States of America");
	  			newPolicy.dropdown_veh_state().selectByVisibleText("CONNECTICUT");
	  			newPolicy.inputPlates().sendKeys("5ZR1254");
	  			newPolicy.inputVehicleID().sendKeys("testSerie12345");
	  			newPolicy.radio_oneVeh().click();
	  			newPolicy.radio_secondVeh().click();
	  			newPolicy.dropdown_type2().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.dropdown_year2().selectByVisibleText("2011");
	  			newPolicy.select_make2().selectByVisibleText("CHRYSLER");
	  			newPolicy.select_model2().selectByVisibleText("300");
	  			newPolicy.dropdown_veh_country2().selectByVisibleText("United States of America");
	  			newPolicy.dropdown_veh_state2().selectByVisibleText("CONNECTICUT");
	  			newPolicy.inputPlates2().sendKeys("5ZR1254");
	  			newPolicy.inputVehicleID2().sendKeys("ABstABrie123457");
	  			newPolicy.radio_thirdVeh().click();
	  			newPolicy.dropdown_type3().selectByVisibleText("Auto/SUV/Pick Up/Cargo & Passengers Van/Light Truck up to 2.5 ton of capacity");
	  			newPolicy.dropdown_year3().selectByVisibleText("2011");
	  			newPolicy.select_make3().selectByVisibleText("CHRYSLER");
	  			newPolicy.select_model3().selectByVisibleText("300");
	  			newPolicy.dropdown_veh_country3().selectByVisibleText("United States of America");
	  			newPolicy.dropdown_veh_state3().selectByVisibleText("CONNECTICUT");
	  			newPolicy.inputPlates3().sendKeys("5ZR1254");
	  			newPolicy.inputVehicleID3().sendKeys("ABstABrie124457");
	  			break;		  			
	  }
	  
	  //Payment
	  wait(2000);
	  newPolicy.inputPayment().click();
	  newPolicy.dropdown_payment().selectByVisibleText("Agent's Credit Card");
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
