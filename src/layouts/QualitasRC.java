package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class QualitasRC extends utilities.Driver{
	
	WebElement product;
	WebElement brokerFee;
	Select days;
	WebElement insuredDataTab;
	WebElement insured;
	WebElement address;
	WebElement city;
	Select country;
	Select state;
	WebElement zip;
	WebElement phone;
	WebElement rfc;
	WebElement vehicleDescription;
	Select year;
	Select make;
	Select model;
	Select stateVehicle;
	WebElement plates;
	WebElement vehicleId;
	WebElement paymentTab;
	Select payment;
	WebElement purchase;
	WebElement closePolicy;
	WebElement policy;
	
	public QualitasRC(){
		
		/*driver.switchTo().frame("menu_inbox");
		product = driver.findElement(By.id("btn_link"));
		brokerFee = driver.findElement(By.xpath(".//*[@id='tbl_imgLinks']/tbody/tr[1]/td/a"));
		days = new Select(driver.findElement(By.id("ddl_days")));
		insuredDataTab = driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/div[1]/ul/li[2]/a"));
		insured = driver.findElement(By.id("txt_Nombre"));
		address = driver.findElement(By.id("txt_Domicilio"));
		city = driver.findElement(By.id("txt_Ciudad"));
		country = new Select(driver.findElement(By.id("ddl_Pais")));
		state = new Select(driver.findElement(By.id("ddl_Estado")));
		zip = driver.findElement(By.id("txt_CP"));
		phone = driver.findElement(By.id("txt_Tel"));
		rfc = driver.findElement(By.id("txt_rfc"));
		vehicleDescription = driver.findElement(By.linkText("Vehicle Description"));
		year = new Select(driver.findElement(By.id("ddl_VehAnio")));
		make = new Select(driver.findElement(By.id("ddl_VehMarca")));
		model = new Select(driver.findElement(By.id("ddl_VehModelo")));
		state = new Select(driver.findElement(By.id("ddl_VehState")));
		plates = driver.findElement(By.id("txt_VehPlacas"));
		vehicleId = driver.findElement(By.id("txt_VehSerie"));
		paymentTab = driver.findElement(By.linkText("Payment"));
		payment = new Select(driver.findElement(By.id("ddl_cc_owner")));
		purchase = driver.findElement(By.id("btnOK"));
		closePolicy = driver.switchTo().activeElement();
		policy = driver.findElement(By.id("Label_succesful"));*/
		
	}
	public WebElement getProduct() {
		driver.switchTo().frame("menu_inbox");
		product = driver.findElement(By.id("btn_link"));
		return product;
	}
	
	public WebElement getBrokerFee() {
		brokerFee = driver.findElement(By.xpath(".//*[@id='txt_brokerFee']"));
		return brokerFee;
	}
	
	public Select getDays() {
		days = new Select(driver.findElement(By.id("ddl_days")));
		return days;
	}
	
	public WebElement getInsuredDataTab() {
		insuredDataTab = driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/div[1]/ul/li[2]/a"));
		return insuredDataTab;
	}
	
	public WebElement getInsured() {
		insured = driver.findElement(By.id("txt_Nombre"));
		return insured;
	}
	
	public WebElement getAddress() {
		address = driver.findElement(By.id("txt_Domicilio"));
		return address;
	}
	
	public WebElement getCity() {
		city = driver.findElement(By.id("txt_Ciudad"));
		return city;
	}
	
	public Select getCountry() {
		country = new Select(driver.findElement(By.id("ddl_Pais")));
		return country;
	}
	
	public Select getState() {
		state = new Select(driver.findElement(By.id("ddl_Estado")));
		return state;
	}
	
	public WebElement getZip() {
		zip = driver.findElement(By.id("txt_CP"));
		return zip;
	}
	
	public WebElement getPhone() {
		phone = driver.findElement(By.id("txt_Tel"));
		return phone;
	}
	
	public WebElement getRfc() {
		rfc = driver.findElement(By.id("txt_rfc"));
		return rfc;
	}
	
	public WebElement getVehicleDescription() {
		vehicleDescription = driver.findElement(By.linkText("Vehicle Description"));
		return vehicleDescription;
	}
	
	public Select getYear() {
		year = new Select(driver.findElement(By.id("ddl_VehAnio")));
		return year;
	}
	
	public Select getMake() {
		make = new Select(driver.findElement(By.id("ddl_VehMarca")));
		return make;
	}
	
	public Select getModel() {
		model = new Select(driver.findElement(By.id("ddl_VehModelo")));
		return model;
	}
	
	public Select getStateVehicle() {
		stateVehicle = new Select(driver.findElement(By.id("ddl_VehState")));
		return stateVehicle;
	}
	
	public WebElement getPlates() {
		plates = driver.findElement(By.id("txt_VehPlacas"));
		return plates;
	}
	
	public WebElement getVehicleId() {
		vehicleId = driver.findElement(By.id("txt_VehSerie"));
		return vehicleId;
	}
	
	public WebElement getPaymentTab() {
		paymentTab = driver.findElement(By.linkText("Payment"));
		return paymentTab;
	}
	
	public Select getPayment() {
		payment = new Select(driver.findElement(By.id("ddl_cc_owner")));
		return payment;
	}
	
	public WebElement getPurchase() {
		purchase = driver.findElement(By.id("btnOK"));
		return purchase;
	}
	
	public void confirmation() {
		
		wait(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	public WebElement getClosePolicy() {
		closePolicy = driver.switchTo().activeElement();
		return closePolicy;
	}
	
	public WebElement getPolicy() {
		policy = driver.findElement(By.id("Label_succesful"));
		return policy;
	}
	
}
