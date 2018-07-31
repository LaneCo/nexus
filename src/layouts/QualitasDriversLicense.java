package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitasDriversLicense extends utilities.Driver{
	private String product;
	private String packages;
	private String licenses;
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
	private String licenseTab;
	private String nameLicense1;
	private String addressLicense1;
	private String numberLicense1;
	private String nameLicense2;
	private String addressLicense2;
	private String numberLicense2;
	private String nameLicense3;
	private String addressLicense3;
	private String numberLicense3;
	private String paymentTab;
	private String payment;
	private String purchase;
	private String policy;
	
	public QualitasDriversLicense() {
		
		product = "Qualitas Drivers License";
		packages = "ddl_package";
		licenses = "ddl_noDrvLic";
		personalInformationTab = ".//*[@id='Form1']/table/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a";
		name = "txt_Nombre";
		lastName = "txt_Apellidos";
		city = "txt_Ciudad";
		address = "txt_Domicilio";
		country = "ddl_Pais";
		state = "ddl_Estado";
		zip = "txt_CP";
		phone = "txt_Tel";
		email = "txt_email";
		licenseTab = "Driver License";
		nameLicense1 = "txt_adddrv1nm";
		addressLicense1 = "txt_adddrv1Address";
		numberLicense1 = "txt_adddrv1dl";
		nameLicense2 = "txt_adddrv2nm";
		addressLicense2 = "txt_adddrv2Address";
		numberLicense2 = "txt_adddrv2dl";
		nameLicense3 = "txt_adddrv3nm";
		addressLicense3 = "txt_adddrv3Address";
		numberLicense3 = "txt_adddrv3dl";
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
		return new Select (driver.findElement(By.id(packages)));
	}

	public Select getLicenses() {
		return (new Select (driver.findElement(By.id(licenses))));
	}
	//Personal information tab
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
		return (new Select(driver.findElement(By.id(country))));
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
	//Licenses tab
	public WebElement getLicenseTab() {
		wait(1000);
		return driver.findElement(By.linkText(licenseTab));
	}

	public WebElement getNameLicense1() {
		return driver.findElement(By.id(nameLicense1));
	}

	public WebElement getAddressLicense1() {
		return driver.findElement(By.id(addressLicense1));
	}

	public WebElement getNumberLicense1() {
		return driver.findElement(By.id(numberLicense1));
	}
	//License 2
	public WebElement getNameLicense2() {
		return driver.findElement(By.id(nameLicense2));
	}

	public WebElement getAddressLicense2() {
		return driver.findElement(By.id(addressLicense2));
	}

	public WebElement getNumberLicense2() {
		return driver.findElement(By.id(numberLicense2));
	}

	public WebElement getNameLicense3() {
		return driver.findElement(By.id(nameLicense3));
	}
	//License 3
	public WebElement getAddressLicense3() {
		return driver.findElement(By.id(addressLicense3));
	}

	public WebElement getNumberLicense3() {
		return driver.findElement(By.id(numberLicense3));
	}

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

	public WebElement getClosePolicy() {
		return driver.switchTo().activeElement();
	}

	public WebElement getPolicy() {
		return driver.findElement(By.id(policy));
	}

}
