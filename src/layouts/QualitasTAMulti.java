package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class QualitasTAMulti extends utilities.Driver{
	
	private String product;
	private String packages;
	private String vehicles;
	private String liability;
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
	private String email;
	private String vehicleDescription;
	private String vehicleType;
	private String year;
	private String make;
	private String model;
	private String vehicleCountry;
	private String vehicleState;
	private String plates;
	private String vehicleID;
	private String justOneVehicle;
	private String secondVehicle;
	private String typeSecondVehicle;
	private String yearSecondVehicle;
	private String makeSecondVehicle;
	private String modelSecondVehicle;
	private String countrySecondVehicle;
	private String stateSecondVehicle;
	private String platesSecondVehicle;
	private String idSecondVehicle;
	private String justTwoVehicle;
	private String thirdVehicle;
	private String typeThirdVehicle;
	private String yearThirdVehicle;
	private String makeThirdVehicle;
	private String modelThirdVehicle;
	private String countryThirdVehicle;
	private String stateThirdVehicle;
	private String platesThirdVehicle;
	private String idThirdVehicle;
	private String paymentTab;
	private String payment;
	private String purchase;
	private String policy;
	
	public QualitasTAMulti() {
		product = "Qualitas TA Multi";
		packages = "ddl_plan" ;
		vehicles = "ddl_maxItems" ;
		liability = "ddl_tpl";
		brokerFee = "txt_brokerFee" ;
		personalInformation = ".//*[@id='aPersonalInfo']";
		name = "txt_Nombre";
		lastName = "txt_Apellidos";
		address = "txt_Domicilio";
		city = "txt_Ciudad";
		country = "ddl_Pais" ;
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		email = "txt_email";
		vehicleDescription = "Vehicle Description" ;
		vehicleType = "ddl_mc";
		year = "ddl_VehAnio";
		make = "ddl_VehMarca";
		model = "ddl_VehModelo";
		vehicleCountry = "ddl_VehCountry" ;
		vehicleState = "ddl_VehState" ;
		plates = "txt_VehPlacas";
		vehicleID = "txt_VehSerie";
		justOneVehicle = "rbl_isSecondVehicle_1";
		secondVehicle = "rbl_isSecondVehicle_0";
		typeSecondVehicle = "ddl_mc2";
		yearSecondVehicle = "ddl_VehAnio2" ;
		makeSecondVehicle = "ddl_VehMarca2";
		modelSecondVehicle = "ddl_VehModelo2";
		countrySecondVehicle = "ddl_VehCountry2";
		stateSecondVehicle = "ddl_VehState2";
		platesSecondVehicle = "txt_VehPlacas2";
		idSecondVehicle = "txt_VehSerie2";
		justTwoVehicle = "rbl_isThirdVehicle_1";
		thirdVehicle = "rbl_isThirdVehicle_0";
		typeThirdVehicle = "ddl_mc3";
		yearThirdVehicle = "ddl_VehAnio3";
		makeThirdVehicle = "ddl_VehMarca3";
		modelThirdVehicle = "ddl_VehModelo3";
		countryThirdVehicle = "ddl_VehCountry3";
		stateThirdVehicle = "ddl_VehState3";
		platesThirdVehicle = "txt_VehPlacas3";
		idThirdVehicle = "txt_VehSerie3";
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


	public Select getPackages() {
		return new Select(driver.findElement(By.id(packages)));
	}


	public Select getVehicles() {
		return new Select(driver.findElement(By.id(vehicles)));
	}


	public Select getLiability() {
		return new Select(driver.findElement(By.id(liability)));
	}


	public WebElement getBrokerFee() {
		return driver.findElement(By.id(brokerFee));
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


	public WebElement getEmail() {
		return driver.findElement(By.id(email));
	}


	public WebElement getVehicleDescription() {
		return driver.findElement(By.linkText(vehicleDescription));
	}


	public Select getVehicleType() {
		return new Select(driver.findElement(By.id(vehicleType)));
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


	public WebElement getJustOneVehicle() {
		return driver.findElement(By.id(justOneVehicle));
	}


	public WebElement getSecondVehicle() {
		return driver.findElement(By.id(secondVehicle));
	}


	public Select getTypeSecondVehicle() {
		return new Select(driver.findElement(By.id(typeSecondVehicle)));
	}


	public Select getYearSecondVehicle() {
		return new Select(driver.findElement(By.id(yearSecondVehicle)));
	}


	public Select getMakeSecondVehicle() {
		return new Select(driver.findElement(By.id(makeSecondVehicle)));
	}


	public Select getModelSecondVehicle() {
		return new Select(driver.findElement(By.id(modelSecondVehicle)));
	}


	public Select getCountrySecondVehicle() {
		return new Select(driver.findElement(By.id(countrySecondVehicle)));
	}


	public Select getStateSecondVehicle() {
		return new Select(driver.findElement(By.id(stateSecondVehicle)));
	}


	public WebElement getPlatesSecondVehicle() {
		return driver.findElement(By.id(platesSecondVehicle));
	}


	public WebElement getIdSecondVehicle() {
		return driver.findElement(By.id(idSecondVehicle));
	}


	public WebElement getJustTwoVehicle() {
		return driver.findElement(By.id(justTwoVehicle));
	}


	public WebElement getThirdVehicle() {
		return driver.findElement(By.id(thirdVehicle));
	}


	public Select getTypeThirdVehicle() {
		return new Select(driver.findElement(By.id(typeThirdVehicle)));
	}


	public Select getYearThirdVehicle() {
		return new Select(driver.findElement(By.id(yearThirdVehicle)));
	}


	public Select getMakeThirdVehicle() {
		return new Select(driver.findElement(By.id(makeThirdVehicle)));
	}


	public Select getModelThirdVehicle() {
		return new Select(driver.findElement(By.id(modelThirdVehicle)));
	}


	public Select getCountryThirdVehicle() {
		return new Select(driver.findElement(By.id(countryThirdVehicle)));
	}


	public Select getStateThirdVehicle() {
		return new Select(driver.findElement(By.id(stateThirdVehicle)));
	}


	public WebElement getPlatesThirdVehicle() {
		return driver.findElement(By.id(platesThirdVehicle));
	}


	public WebElement getIdThirdVehicle() {
		return driver.findElement(By.id(idThirdVehicle));
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
