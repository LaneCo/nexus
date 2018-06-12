
package tests;

import org.testng.annotations.Test;

import layouts.QualitasTransfer;
import utilities.Driver;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasTransfer extends Driver{

	utilities.Config cfg = new utilities.Config();
	
	@BeforeMethod
	public void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus"); 
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 }

  @Test (priority = 2, description = "Emitir poliza Qualitas Transfer")
  	public void createPolicy() {
	  NewLogin login = new NewLogin();
	  String user = cfg.getProperty("user_nexus");
	  String pass = cfg.getProperty("pass_nexus");
	  login.login(user, pass);
	  
	  String person_type = "Moral"; //Type of person
	  QualitasTransfer newPolicy = new QualitasTransfer();
	  System.out.println("Emitir poliza Qualitas Transfer");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wait(2000);
	  newPolicy.selectProduct().click();
	  wait(1000);
	  //Policy Data
			  /*Select Plan
			   *Annual Package 1
			   *Annual Package 2
			   *Annual Package 3
			   *Annual Package 4*/
	  newPolicy.selectPackage().selectByVisibleText("Annual Package 4");
	  newPolicy.inputBrokerFee().sendKeys(Keys.chord(Keys.CONTROL, "a"), "");
	  newPolicy.inputBrokerFee().sendKeys("20");
	  newPolicy.selectType().selectByVisibleText("Tractocamion"); //Tractocamion , Rabon , Ligero (Panel)
	  	
	  newPolicy.personalInformation().click();
	  //Personal Information
	  if ( (person_type).equals("Moral") )
	  {
		  newPolicy.select_personM().click();
		  newPolicy.inputName().sendKeys("Coca Cola SA de CV");
		  newPolicy.inputAddres().sendKeys("Calle primera 36-A col. Insurgentes");
		  newPolicy.inputCity().sendKeys("DF");
		  newPolicy.dropdown_country().selectByVisibleText("Mexico");
		  newPolicy.dropdown_state().selectByVisibleText("DISTRITO FEDERAL");
		  newPolicy.inputZip().sendKeys("22800");
	  }else{
		  newPolicy.inputName().sendKeys("Minerva");
		  newPolicy.inputLastName().sendKeys("Estrada Camarena");
		  newPolicy.calendar().click(); //select Calendar
		  newPolicy.year_birthdate().selectByVisibleText("1980"); //birth year
		  newPolicy.month_birthdate().selectByVisibleText("March"); //birth month
		  newPolicy.day_birthdate().click(); //birth day
		  newPolicy.inputAddres().sendKeys("Calle tercera 338");
		  newPolicy.inputCity().sendKeys("Sonoita");
		  newPolicy.dropdown_country().selectByVisibleText("Mexico");
		  newPolicy.dropdown_state().selectByVisibleText("SONORA");
		  newPolicy.inputZip().sendKeys("12345");
		  newPolicy.inputPhone().sendKeys("6861245");
	  }

	  newPolicy.vehicleDescription().click();
	  //Vehicle description
	  newPolicy.dropdown_year().selectByVisibleText("2001");
	  newPolicy.make().sendKeys("Ford"); 
	  newPolicy.model().sendKeys("Focus");
	  newPolicy.dropdown_veh_country().selectByVisibleText("United States of America");
	  newPolicy.dropdown_veh_state().selectByVisibleText("CONNECTICUT");
	  newPolicy.inputPlates().sendKeys("5ZR1254");
	  newPolicy.inputVehicleID().sendKeys("testABWWHYC543");
	  
	  //Payment
	  wait(2000);
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
