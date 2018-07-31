package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class QualitasTransferInsurance extends utilities.Driver{

	private String product;
	private String personalInformationTab;
	private String name;
	private String lastname;
	private String calendar;
	private String yearBirthdate;
	private String monthBirthdate;
	private String dayBirthdate;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone;
	private String email;
	private String vehicleDescriptionTab;
	private String vehicleYear;
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
	
	public QualitasTransferInsurance () {
		
		product = "Qualitas Transfer Insurance";
		personalInformationTab = ".//*[@id='__tbl_form']/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a";
		name = "txt_Nombre";
		lastname = "txt_Apellidos";
		calendar = "StartIcon4";
		yearBirthdate = ".//*[@id='calYears']";
		monthBirthdate = "calMonths";
		dayBirthdate = ".//*[@id='MonthTable']/tbody/tr[6]/td[1]";
		address = "txt_Domicilio";
		city = "txt_Ciudad";
		country = "ddl_Pais";
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		email = "txt_email";
		vehicleDescriptionTab = "Vehicle Description";
		vehicleYear = "ddl_VehAnio";
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

	public WebElement getPersonalInformationTab() {
		return driver.findElement(By.xpath(personalInformationTab));
	}

	public WebElement getName() {
		return driver.findElement(By.id(name));
	}

	public WebElement getLastname() {
		return driver.findElement(By.id(lastname));
	}

	public WebElement getCalendar() {
		return driver.findElement(By.id(calendar));
	}

	public Select getYearBirthdate() {
		return new Select(driver.findElement(By.xpath(yearBirthdate)));
	}

	public Select getMonthBirthdate() {
		return new Select(driver.findElement(By.id(monthBirthdate)));
	}

	public WebElement getDayBirthdate() {
		return driver.findElement(By.xpath(dayBirthdate));
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

	public WebElement getVehicleDescriptionTab() {
		return driver.findElement(By.linkText(vehicleDescriptionTab));
	}

	public Select getVehicleYear() {
		return new Select(driver.findElement(By.id(vehicleYear)));
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
	
	public WebElement closePolicy(){
		return driver.switchTo().activeElement();
	}

	public WebElement getPolicy() {
		return driver.findElement(By.id(policy));
	}
}
