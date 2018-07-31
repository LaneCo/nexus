package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitasTA extends utilities.Driver{
	
	private String product;
	private String territory;
	private String value;
	private String brokeerFee;
	private String personalInformationTab;
	private String name;
	private String lastName;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone;
	private String email;
	private String vehicleDescriptionTab;
	private String vehicleId;
	private String year;
	private String make;
	private String model;
	private String vehicleCountry;
	private String vehicleState;
	private String plates;
	private String paymentTab;
	private String payment;
	private String purchase;
	private String policy;
	
	public QualitasTA() {
		product = "Qualitas TA";
		territory = "rbl_territory_1";
		value = "txt_cta";
		brokeerFee = "txt_brokerFee";
		personalInformationTab = ".//*[@id='__tbl_form']/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a";
		name = "txt_Nombre";
		lastName = "txt_Apellidos";
		address = "txt_Domicilio";
		city = "txt_Ciudad";
		country = "ddl_Pais";
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		email = "txt_email";
		vehicleDescriptionTab = "Vehicle Description";
		vehicleId = "txt_VehSerie";
		year = "ddl_VehAnio";
		make = "txt_VehMarca";
		model = "txt_VehModelo";
		vehicleCountry = "ddl_VehCountry";
		vehicleState = "ddl_VehState";
		plates = "txt_VehPlacas";
		paymentTab = "Payment";
		payment = "ddl_cc_owner";
		purchase = "btnOK";
		policy = "Label_succesful";
	}
	
	public WebElement getProduct() {
		//Select the frame where the button is located
		driver.switchTo().frame("menu_inbox"); 
		return driver.findElement(By.linkText(product));
	}
	
	public WebElement getTerritory() {
		return driver.findElement(By.id(territory));
	}
	
	public WebElement getValue() {
		return driver.findElement(By.id(value));
	}
	
	public WebElement getBrokeerFee() {
		return driver.findElement(By.id(brokeerFee));
	}
	
	public WebElement getPersonalInformationTab() {
		return driver.findElement(By.xpath(personalInformationTab));
	}
	
	public WebElement getName() {
		return driver.findElement(By.id(name));
	}
	
	public WebElement getLastName() {
		return driver.findElement(By.id(lastName));
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
	
	public WebElement getEmail() {
		return driver.findElement(By.id(email));
	}
	
	//Vehicle description tab
	public WebElement getVehicleDescriptionTab() {
		return driver.findElement(By.linkText(vehicleDescriptionTab));
	}
	
	public WebElement getVehicleId() {
		return driver.findElement(By.id(vehicleId));
	}
	
	public Select getYear() {
		return new Select(driver.findElement(By.id(year)));
	}
	
	public WebElement getMake() {
		return driver.findElement(By.id(make));
	}
	
	public WebElement getModel() {
		return driver.findElement(By.id(model));
	}
	
	public Select getVehicleCountry() {
		return new Select(driver.findElement(By.id(vehicleCountry)));
	}
	
	public Select getVehicleState() {
		return new Select(driver.findElement(By.id(vehicleState)));
	}
	
	public WebElement getPlates() {
		return driver.findElement(By.id(plates));
	}
	
	//Payment tab
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
