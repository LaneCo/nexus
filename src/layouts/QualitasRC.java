package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class QualitasRC extends utilities.Driver{
		
	private String product;
	private String brokerFee;
	private String days;
	private String insuredDataTab;
	private String insured;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone;
	private String rfc;
	private String vehicleDescription;
	private String year;
	private String make;
	private String model;
	private String stateVehicle;
	private String plates;
	private String vehicleId;
	private String paymentTab;
	private String payment;
	private String purchase;
	private String policy;
	
	public QualitasRC(){
		
		product = "btn_link";
		brokerFee = "txt_brokerFee";
		days = "ddl_days";
		insuredDataTab = ".//*[@id='Form1']/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/div[1]/ul/li[2]/a";
		insured = "txt_Nombre";
		address = "txt_Domicilio";
		city = "txt_Ciudad";
		country = "ddl_Pais";
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		rfc = "txt_rfc";
		vehicleDescription = "Vehicle Description";
		year = "ddl_VehAnio";
		make = "ddl_VehMarca";
		model = "ddl_VehModelo";
		stateVehicle = "ddl_VehState";
		plates = "txt_VehPlacas";
		vehicleId = "txt_VehSerie";
		paymentTab = "Payment";
		payment = "ddl_cc_owner";
		purchase = "btnOK";
		policy = "Label_succesful";
		
	}
	
	public WebElement getProduct() {
		driver.switchTo().frame("menu_inbox");
		return driver.findElement(By.id(product));
	}
	
	public WebElement getBrokerFee() {
		return driver.findElement(By.id(brokerFee));
	}
	
	public Select getDays() {
		return (new Select(driver.findElement(By.id(days))));
		 
	}
	
	public WebElement getInsuredDataTab() {
		return driver.findElement(By.xpath(insuredDataTab));
	}
	
	public WebElement getInsured() {
		return driver.findElement(By.id(insured));
	}
	
	public WebElement getAddress() {
		return driver.findElement(By.id(address));
	}
	
	public WebElement getCity() {
		return driver.findElement(By.id(city));
	}
	
	public Select getCountry() {
		return new Select(driver.findElement(By.id(country)));
	}
	
	public Select getState() {
		return new Select(driver.findElement(By.id(state)));
	}
	
	public WebElement getZip() {
		return driver.findElement(By.id(zip));
	}
	
	public WebElement getPhone() {
		return driver.findElement(By.id(phone));
	}
	
	public WebElement getRfc() {
		return driver.findElement(By.id(rfc));
	}
	
	public WebElement getVehicleDescription() {
		return driver.findElement(By.linkText(vehicleDescription));
	}
	
	public Select getYear() {
		return new Select(driver.findElement(By.id(year)));
	}
	
	public Select getMake() {
		return new Select(driver.findElement(By.id(make)));
	}
	
	public Select getModel() {
		return new Select(driver.findElement(By.id(model)));
	}
	
	public Select getStateVehicle() {
		return new Select(driver.findElement(By.id(stateVehicle)));
	}
	
	public WebElement getPlates() {
		return driver.findElement(By.id(plates));
	}
	
	public WebElement getVehicleId() {
		return driver.findElement(By.id(vehicleId));
	}
	
	public WebElement getPaymentTab() {
		return driver.findElement(By.linkText(paymentTab));
	}
	
	public Select getPayment() {
		return new Select(driver.findElement(By.id(payment)));
	}
	
	public WebElement getPurchase() {
		return driver.findElement(By.id(purchase));
	}
	
	public void confirmation() {
		
		wait(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	public WebElement getClosePolicy() {
		return driver.switchTo().activeElement();
	}
	
	public WebElement getPolicy() {
		return driver.findElement(By.id(policy));
	}
	
}
