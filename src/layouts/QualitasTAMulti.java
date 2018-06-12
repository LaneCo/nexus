package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class QualitasTAMulti extends utilities.Driver{

	public WebElement selectProduct() {
		//Select the frame where the button is located
		driver.switchTo().frame("menu_inbox");
		return driver.findElement(By.linkText("Qualitas TA Multi"));
		
	  }
	
	public Select selectPackage(){
		
		return new Select(driver.findElement(By.id("ddl_plan")));
		
	  }
	public Select selectVehicles(){
		
		return new Select(driver.findElement(By.id("ddl_maxItems")));
		
	  }
	public Select selectLiability(){
		
		return new Select(driver.findElement(By.id("ddl_tpl")));
		
	  }
	public WebElement inputBrokerFee() {
		 
		 return driver.findElement(By.id("txt_brokerFee"));
		
	  }
	//Personal information tab
	public WebElement personalInformation() {
		 
		return driver.findElement(By.xpath(".//*[@id='aPersonalInfo']")); 
		
	  }
	public WebElement inputName() {
		 
		 return driver.findElement(By.id("txt_Nombre"));
		
	  }
	public WebElement inputLastName() {
		 
		 return driver.findElement(By.id("txt_Apellidos"));
		
	  }
	public WebElement inputAddres() {
		 
		 return driver.findElement(By.id("txt_Domicilio"));
		
	  }
	public WebElement inputCity() {
		 
		 return driver.findElement(By.id("txt_Ciudad"));
		
	  }
	public Select dropdown_country(){
		
		return new Select(driver.findElement(By.id("ddl_Pais")));
		
	  }
	public Select dropdown_state(){
		
		return new Select(driver.findElement(By.id("ddl_Estado")));
		
	  }
	
	public WebElement inputZip() {
		 
		 return driver.findElement(By.id("txt_CP"));
		
	  }
	public WebElement inputPhone() {
		 
		 return driver.findElement(By.id("txt_Tel"));
		
	  }
	public WebElement inputEmail() {
		 
		 return driver.findElement(By.id("txt_email"));
		
	  }
	//Vehicle description tab
	public WebElement vehicleDescription() {
		
		 return driver.findElement(By.linkText("Vehicle Description"));
		
	  }
	//One vehicle
	public Select dropdown_type(){
		
		return new Select(driver.findElement(By.id("ddl_mc")));
		
	  }

	public Select dropdown_year(){
		
		return new Select(driver.findElement(By.id("ddl_VehAnio")));
		
	  }

	public Select select_make(){
		
		return new Select(driver.findElement(By.id("ddl_VehMarca")));
		
	  }
	public Select select_model(){
		
		return new Select(driver.findElement(By.id("ddl_VehModelo")));
		
	  }
	public Select dropdown_veh_country(){
		
		return new Select(driver.findElement(By.id("ddl_VehCountry")));
		
	  }
	public Select dropdown_veh_state(){
		
		return new Select(driver.findElement(By.id("ddl_VehState")));
		
	  }

	public WebElement inputPlates() {
		 
		 return driver.findElement(By.id("txt_VehPlacas"));
		
	  }
	
	public WebElement inputVehicleID() {
		 
		 return driver.findElement(By.id("txt_VehSerie"));
		
	  }
	public WebElement radio_oneVeh() {
		 
		 return driver.findElement(By.id("rbl_isSecondVehicle_1"));
		
	  }
	public WebElement radio_secondVeh() {
		 
		 return driver.findElement(By.id("rbl_isSecondVehicle_0"));
		
	  }
	// Second vehicle
	public Select dropdown_type2(){
		
		return new Select(driver.findElement(By.id("ddl_mc2")));
		
	  }

	public Select dropdown_year2(){
		
		return new Select(driver.findElement(By.id("ddl_VehAnio2")));
		
	  }

	public Select select_make2(){
		
		return new Select(driver.findElement(By.id("ddl_VehMarca2")));
		
	  }
	public Select select_model2(){
		
		return new Select(driver.findElement(By.id("ddl_VehModelo2")));
		
	  }
	public Select dropdown_veh_country2(){
		
		return new Select(driver.findElement(By.id("ddl_VehCountry2")));
		
	  }
	public Select dropdown_veh_state2(){
		
		return new Select(driver.findElement(By.id("ddl_VehState2")));
		
	  }

	public WebElement inputPlates2() {
		 
		 return driver.findElement(By.id("txt_VehPlacas2"));
		
	  }
	
	public WebElement inputVehicleID2() {
		 
		 return driver.findElement(By.id("txt_VehSerie2"));
		
	  }
	public WebElement radio_twoVeh() {
		 
		 return driver.findElement(By.id("rbl_isThirdVehicle_1"));
		
	  }
	public WebElement radio_thirdVeh() {
		 
		 return driver.findElement(By.id("rbl_isThirdVehicle_0"));
		
	  }
	//Third vehicle
	public Select dropdown_type3(){
		
		return new Select(driver.findElement(By.id("ddl_mc3")));
		
	  }

	public Select dropdown_year3(){
		
		return new Select(driver.findElement(By.id("ddl_VehAnio3")));
		
	  }

	public Select select_make3(){
		
		return new Select(driver.findElement(By.id("ddl_VehMarca3")));
		
	  }
	public Select select_model3(){
		
		return new Select(driver.findElement(By.id("ddl_VehModelo3")));
		
	  }
	public Select dropdown_veh_country3(){
		
		return new Select(driver.findElement(By.id("ddl_VehCountry3")));
		
	  }
	public Select dropdown_veh_state3(){
		
		return new Select(driver.findElement(By.id("ddl_VehState3")));
		
	  }

	public WebElement inputPlates3() {
		 
		 return driver.findElement(By.id("txt_VehPlacas3"));
		
	  }
	
	public WebElement inputVehicleID3() {
		 
		 return driver.findElement(By.id("txt_VehSerie3"));
		
	  }
	//Payment tab
	public WebElement inputPayment() {
		 
		 return driver.findElement(By.linkText("Payment"));
		
	  }
	public Select dropdown_payment(){
		
		return new Select(driver.findElement(By.id("ddl_cc_owner")));
		
	  }

	//Complete the purchase
	public WebElement purchase() {
		 
		 return driver.findElement(By.id("btnOK"));
		
	  }
	public void confirmation() {
		
		wait(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	  }
	public WebElement closePolicy(){
		
		return driver.switchTo().activeElement();
		
	}
	public WebElement policy(){
		
		return driver.findElement(By.id("Label_succesful"));
	}
	

}
