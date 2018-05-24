
package nexus;

import org.testng.annotations.Test;
import issuers_nexus.QualitasTransferInsurance;
import tools.Utilities;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewQualitasTransferInsurance extends Utilities{

	tools.Config cfg = new tools.Config();
	
	@BeforeMethod
	public void OpenBrowser() {
	   
		String url = cfg.getProperty("url_nexus"); 
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 }

	@Test (priority = 2, description = "Issue Qualitas Transfer Insurance policy")
  	public void createPolicy() {
	
		Validar_login login = new Validar_login();
		String user = cfg.getProperty("user_nexus");
		String pass = cfg.getProperty("pass_nexus");
		login.login(user, pass);
		  
		QualitasTransferInsurance newPolicy = new QualitasTransferInsurance();
		System.out.println("Issue Qualitas Transfer Insurance policy");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait(2000);
		newPolicy.selectProduct().click();
		wait(1000);	
		newPolicy.personalInformation().click();
		//Personal Information
		newPolicy.inputName().sendKeys("Mariana");
		newPolicy.inputLastName().sendKeys("Atondo Lopez");
		newPolicy.inputAddres().sendKeys("Calle girasoles 76 col. bustamante");
		newPolicy.inputCity().sendKeys("Obregon");
		newPolicy.dropdown_country().selectByVisibleText("Mexico");
		newPolicy.dropdown_state().selectByVisibleText("SONORA");
		newPolicy.inputZip().sendKeys("33000");
		newPolicy.inputPhone().sendKeys("013361251444");
		newPolicy.inputEmail().sendKeys("ramon@test.com");
		newPolicy.vehicleDescription().click();
		//Vehicle description
		newPolicy.dropdown_year().selectByVisibleText("2004");
		newPolicy.make().selectByVisibleText("FORD"); 
		newPolicy.model().selectByVisibleText("FUSION");
		newPolicy.dropdown_veh_country().selectByVisibleText("United States of America");
		newPolicy.dropdown_veh_state().selectByVisibleText("ALASKA");
		newPolicy.inputPlates().sendKeys("5ZR1233");
		newPolicy.inputVehicleID().sendKeys("teABCD123WWTGYs");
	  
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
