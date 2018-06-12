package layouts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitasDriversLicense extends utilities.Driver{
	WebElement product;
	Select packages;
	Select licenses;
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
	WebElement licenseTab;
	WebElement nameLicense1;
	WebElement addressLicense1;
	WebElement numberLicense1;
	WebElement nameLicense2;
	WebElement addressLicense2;
	WebElement numberLicense2;
	WebElement nameLicense3;
	WebElement addressLicense3;
	WebElement numberLicense3;
	WebElement paymentTab;
	Select payment;
	WebElement purchase;
	WebElement closePolicy;
	WebElement policy;
	
	
	public WebElement getProduct() {
		//Select the frame where the button is located
		driver.switchTo().frame("menu_inbox");
		product = driver.findElement(By.linkText("Qualitas Drivers License"));
		return product;
	}

	public Select getPackages() {
		packages =  new Select (driver.findElement(By.id("ddl_package")));
		return packages;
	}

	public Select getLicenses() {
		licenses = new Select (driver.findElement(By.id("ddl_noDrvLic")));
		return licenses;
	}
	//Personal information tab
	public WebElement getPersonalInformationTab() {
		personalInformationTab = driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a"));
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
	//Licenses tab
	public WebElement getLicenseTab() {
		wait(1000);
		licenseTab = driver.findElement(By.linkText("Driver License"));
		return licenseTab;
	}

	public WebElement getNameLicense1() {
		nameLicense1 = driver.findElement(By.id("txt_adddrv1nm"));
		return nameLicense1;
	}

	public WebElement getAddressLicense1() {
		addressLicense1 = driver.findElement(By.id("txt_adddrv1Address"));
		return addressLicense1;
	}

	public WebElement getNumberLicense1() {
		numberLicense1 = driver.findElement(By.id("txt_adddrv1dl"));
		return numberLicense1;
	}
	//License 2
	public WebElement getNameLicense2() {
		nameLicense2 = driver.findElement(By.id("txt_adddrv2nm"));
		return nameLicense2;
	}

	public WebElement getAddressLicense2() {
		addressLicense2 = driver.findElement(By.id("txt_adddrv2Address"));
		return addressLicense2;
	}

	public WebElement getNumberLicense2() {
		numberLicense2 = driver.findElement(By.id("txt_adddrv2dl"));
		return numberLicense2;
	}

	public WebElement getNameLicense3() {
		nameLicense3 = driver.findElement(By.id("txt_adddrv3nm"));
		return nameLicense3;
	}
	//License 3
	public WebElement getAddressLicense3() {
		addressLicense3 = driver.findElement(By.id("txt_adddrv3Address"));
		return addressLicense3;
	}

	public WebElement getNumberLicense3() {
		numberLicense3 = driver.findElement(By.id("txt_adddrv3dl"));
		return numberLicense3;
	}

	public WebElement getPaymentTab() {
		paymentTab = driver.findElement(By.linkText("Payment"));
		return paymentTab;
	}

	public Select getPayment() {
		payment = new Select(driver.findElement(By.id("ddl_cc_owner")));
		return payment;
	}
	//Complete the purchase
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
