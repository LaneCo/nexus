package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitasMandatory extends utilities.Driver{
	
	private String product;
	private String vehicleType;
	private String personalInformation;
	private String name;
	private String lastName;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone;
	private String vehicleDescriptionType;
	private String year;
	private String make;
	private String model;
	private String vehicleCountry;
	private String vehicleState;
	private String plates;
	private String vehicleId;
	private String paymentTab;
	private String payment;
	private String purchase;
	private String policy;
	
	public QualitasMandatory(){
		
		product = "Mandatory Baja California Liability Only";
		vehicleType = "ddl_mc";
		personalInformation = ".//*[@id='__tbl_form']/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a";
		name = "txt_Nombre";
		lastName = "txt_Apellidos";
		address = "txt_Domicilio";
		city = "txt_Ciudad";
		country = "ddl_Pais";
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		vehicleDescriptionType = "Vehicle Description";
		year = "ddl_VehAnio";
		make = "ddl_VehMarca";
		model = "ddl_VehModelo";
		vehicleCountry = "ddl_VehCountry";
		vehicleState = "ddl_VehState";
		plates = "txt_VehPlacas";
		vehicleId = "txt_VehSerie";
		paymentTab = "Payment";
		payment = "ddl_cc_owner";
		purchase = "btnOK";
		policy = "Label_succesful";
	}
	
	public WebElement getProduct() {
		driver.switchTo().frame("menu_inbox");
		return driver.findElement(By.linkText(product));
	}

	public Select getVehicleType() {
		return new Select(driver.findElement(By.id(vehicleType)));
	}

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
	public WebElement getVehicleDescriptionType() {
		return driver.findElement(By.linkText(vehicleDescriptionType));
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

	public WebElement getVehicleId() {
		return driver.findElement(By.id(vehicleId));
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
