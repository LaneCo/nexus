package layouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Login extends utilities.Driver {

	WebElement userName;
	WebElement password;
	WebElement login;
	
	public Login () {
		
		userName = driver.findElement(By.id("user"));
		password = driver.findElement(By.id("pass"));
		login = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img"));
	}
	
	
	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}

	public WebElement Logout() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu_title"); 
		return driver.findElement(By.id("btnSignOut"));

	  }
}
