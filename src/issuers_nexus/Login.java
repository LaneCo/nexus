package issuers_nexus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Login extends tools.Utilities {

	
	public WebElement  inputUser() {
		 
		 return driver.findElement(By.id("user"));
		
	  }
	public WebElement  inputPassword() {
		 
		 return driver.findElement(By.id("pass"));
		
	  }
	public WebElement submit(){
		
		return driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img"));
	}
	
	public WebElement Logout() {
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu_title"); 
		return driver.findElement(By.id("btnSignOut"));
		
	  }

}
