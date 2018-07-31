package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class QualitasTADMRT extends utilities.Driver{
	
	private String product;
	private String value;
	private String brokerFee;
	private String personalInformation;
	private String name;
	private String lastName;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone;
	private String vehicleDescription;
	private String year;
	private String make;
	private String model;
	private String vehicleCountry;
	private String vehicleState;
	private String plates;
	private String vehicleID;
	private String paymentTab;
	private String payment;
	private String purchase;
	private String policy;
	
	public QualitasTADMRT() {
		
		product = "QualitasTA DM RT";
		value = "txt_cta";
		brokerFee = "txt_brokerFee";
		personalInformation = ".//*[@id='__tbl_form']/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a";
		name = "txt_Nombre";
		lastName = "txt_Apellidos";
		address = "txt_Domicilio";
		city = "txt_Ciudad";
		country = "ddl_Pais";
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		vehicleDescription = "Vehicle Description";
		year = "ddl_VehAnio";
		make = "ddl_VehMarca";
		model = "ddl_VehModelo";
		vehicleCountry = "ddl_VehCountry";
		vehicleState = "ddl_VehState";
		plates = "txt_VehPlacas";
		vehicleID = "txt_VehSerie";
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

	public WebElement getValue() {
		return driver.findElement(By.id(value));
	}

	public WebElement getBrokerFee() {
		return driver.findElement(By.id(brokerFee));
	}
	
	//Personal information tab
	public WebElement getPersonalInformation() {
		return driver.findElement(By.xpath(personalInformation));
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
	
	//Vehicle description tab
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

	public Select getVehicleCountry() {
		return new Select(driver.findElement(By.id(vehicleCountry)));
	}

	public Select getVehicleState() {
		return new Select(driver.findElement(By.id(vehicleState)));
	}

	public WebElement getPlates() {
		return driver.findElement(By.id(plates));
	}

	public WebElement getVehicleID() {
		return driver.findElement(By.id(vehicleID));
	}
	//Payment tab
	public WebElement getPaymentTab() {
		return driver.findElement(By.linkText(paymentTab));
	}

	public Select getPayment() {
		return new Select(driver.findElement(By.id(payment)));
	}
	
	//Complete the purchase
	public WebElement getPurchase() {
		return driver.findElement(By.id(purchase));
	}
	
	public void confirmation() {		
		wait(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public WebElement closePolicy(){		
		return driver.switchTo().activeElement();		
	}

	public WebElement getPolicy() {
		return driver.findElement(By.id(policy));
	}

}
