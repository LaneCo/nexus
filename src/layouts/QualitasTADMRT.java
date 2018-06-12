package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class QualitasTADMRT extends utilities.Driver{

	public WebElement selectProduct() {
		//Select the frame where the button is located
		driver.switchTo().frame("menu_inbox");
		return driver.findElement(By.linkText("QualitasTA DM RT"));
		
	  }
	
	public WebElement inputValue() {
		 
		 return driver.findElement(By.id("txt_cta"));
		
	  }
	public WebElement inputBrokerFee() {
		 
		 return driver.findElement(By.id("txt_brokerFee"));
		
	  }
	//Personal information tab
	public WebElement personalInformation() {
		 
		 return driver.findElement(By.xpath(".//*[@id='__tbl_form']/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a"));
		
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
	//Vehicle description tab
	public WebElement vehicleDescription() {
		
		 return driver.findElement(By.linkText("Vehicle Description"));
		
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
