package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitasTA extends utilities.Driver{
	
	WebElement product;
	
	WebElement territory;
	WebElement value;
	WebElement brokeerFee;
	WebElement personalInformationTab;
	WebElement name;
	WebElement lastName;
	WebElement address;
	WebElement city;
	Select country;
	Select state;
	WebElement zip;
	WebElement phone;
	WebElement email;
	WebElement vehicleDescriptionTab;
	WebElement vehicleId;
	Select year;
	WebElement make;
	WebElement model;
	Select vehicleCountry;
	Select vehicleState;
	WebElement plates;
	WebElement paymentTab;
	Select payment;
	WebElement purchase;
	WebElement confirmation;
	WebElement closePolicy;
	WebElement policy;
	
	public WebElement getProduct() {
		//Select the frame where the button is located
		driver.switchTo().frame("menu_inbox"); 
		product = driver.findElement(By.linkText("Qualitas TA"));
		return product;
	}
	public WebElement getTerritory() {
		territory = driver.findElement(By.id("rbl_territory_1"));
		return territory;
	}
	public WebElement getValue() {
		value = driver.findElement(By.id("txt_cta"));
		return value;
	}
	public WebElement getBrokeerFee() {
		brokeerFee = driver.findElement(By.id("txt_brokerFee"));
		return brokeerFee;
	}
	public WebElement getPersonalInformationTab() {
		personalInformationTab = driver.findElement(By.xpath(".//*[@id='__tbl_form']/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a"));
		return personalInformationTab;
	}
	public WebElement getName() {
		name = driver.findElement(By.id("txt_Nombre"));
		return name;
	}
	public WebElement getLastName() {
		lastName = driver.findElement(By.id("txt_Apellidos"));
		return lastName;
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
	public WebElement getEmail() {
		email = driver.findElement(By.id("txt_email"));
		return email;
	}
	//Vehicle description tab
	public WebElement getVehicleDescriptionTab() {
		vehicleDescriptionTab = driver.findElement(By.linkText("Vehicle Description"));
		return vehicleDescriptionTab;
	}
	public WebElement getVehicleId() {
		vehicleId = driver.findElement(By.id("txt_VehSerie"));
		return vehicleId;
	}
	public Select getYear() {
		year = new Select(driver.findElement(By.id("ddl_VehAnio")));
		return year;
	}
	public WebElement getMake() {
		make = driver.findElement(By.id("txt_VehMarca"));
		return make;
	}
	public WebElement getModel() {
		model = driver.findElement(By.id("txt_VehModelo"));
		return model;
	}
	public Select getVehicleCountry() {
		vehicleCountry = new Select(driver.findElement(By.id("ddl_VehCountry")));
		return vehicleCountry;
	}
	public Select getVehicleState() {
		vehicleState = new Select(driver.findElement(By.id("ddl_VehState")));
		return vehicleState;
	}
	public WebElement getPlates() {
		plates = driver.findElement(By.id("txt_VehPlacas"));
		return plates;
	}
	//Payment tab
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
