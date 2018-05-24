package issuers_nexus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitasDriversLicense extends tools.Utilities{

	public WebElement selectProduct() {
		//Select the frame where the button is located
		driver.switchTo().frame("menu_inbox");
		return driver.findElement(By.linkText("Qualitas Drivers License"));
		
	  }
	
	public Select selectPackage() {
		 
		 return new Select (driver.findElement(By.id("ddl_package")));
		
	  }
	public Select licenses() {
		 
		 return new Select (driver.findElement(By.id("ddl_noDrvLic")));
		
	  }
	//Personal information tab
	public WebElement personalInformation() {
		 
		 return driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr[3]/td/table/tbody/tr/td/div[1]/ul/li[2]/a"));
		
	  }
	public WebElement inputName() {
		 
		 return driver.findElement(By.id("txt_Nombre"));
		
	  }
	public WebElement inputLastName() {
		 
		 return driver.findElement(By.id("txt_Apellidos"));
		
	  }
	public WebElement inputAddres() {
		 
		 return driver.findElement(By.id("txt_Domicilio"));
		
	  }
	public WebElement inputCity() {
		 
		 return driver.findElement(By.id("txt_Ciudad"));
		
	  }
	public Select dropdown_country(){
		
		return new Select(driver.findElement(By.id("ddl_Pais")));
		
	  }
	public Select dropdown_state(){
		
		return new Select(driver.findElement(By.id("ddl_Estado")));
		
	  }
	
	public WebElement inputZip() {
		 
		 return driver.findElement(By.id("txt_CP"));
		
	  }
	public WebElement inputPhone() {
		 
		 return driver.findElement(By.id("txt_Tel"));
		
	  }
	public WebElement email() {
		 
		 return driver.findElement(By.id("txt_email"));
		
	  }
	//Licenses tab
	public WebElement DriverLicence() {
		
		wait(1000);
		 return driver.findElement(By.linkText("Driver License"));
		
	  }
	
	public WebElement nameLicense1() {
		 
		 return driver.findElement(By.id("txt_adddrv1nm"));
		
	  }
	
	public WebElement addressLicense1() {
		 
		 return driver.findElement(By.id("txt_adddrv1Address"));
		
	  }
	
	public WebElement numberLicense1() {
		 
		 return driver.findElement(By.id("txt_adddrv1dl"));
		
	  }

	//License 2
	public WebElement nameLicense2() {
		 
		 return driver.findElement(By.id("txt_adddrv2nm"));
		
	  }
	
	public WebElement addressLicense2() {
		 
		 return driver.findElement(By.id("txt_adddrv2Address"));
		
	  }
	
	public WebElement numberLicense2() {
		 
		 return driver.findElement(By.id("txt_adddrv2dl"));
		
	  }

	//License 3
	public WebElement nameLicense3() {
		 
		 return driver.findElement(By.id("txt_adddrv3nm"));
		
	  }
	
	public WebElement addressLicense3() {
		 
		 return driver.findElement(By.id("txt_adddrv3Address"));
		
	  }
	
	public WebElement numberLicense3() {
		 
		 return driver.findElement(By.id("txt_adddrv3dl"));
		
	  }

	//Payment tab
	public WebElement inputPayment() {
		 
		 return driver.findElement(By.linkText("Payment"));
		
	  }
	public Select dropdown_payment(){
		
		return new Select(driver.findElement(By.id("ddl_cc_owner")));
		
	  }

	//Complete the purchase
	public WebElement purchase() {
		 
		 return driver.findElement(By.id("btnOK"));
		
	  }
	public void confirmation() {
		
		wait(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	  }
	public WebElement closePolicy(){
		
		return driver.switchTo().activeElement();
		
	}
	public WebElement policy(){
		
		return driver.findElement(By.id("Label_succesful"));
	}
	

}
