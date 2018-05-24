package nexus;

import org.testng.annotations.Test;
import issuers_nexus.Login;
import tools.Utilities;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class Validar_login extends Utilities{
  
  @BeforeTest
  public void beforeTest() {
	  
	    
		driver.navigate().to("http://nexusinsuranceserver/insqa/");
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test (description = "Log in")
  public void login(String user , String password)  {
 
	  Login objLogin = new Login();
	  System.out.println("Log in");
	  objLogin.inputUser().sendKeys(user);
	  objLogin.inputPassword().sendKeys(password);
	  wait(1000);	
	  objLogin.inputUser().sendKeys(Keys.ESCAPE);
	  objLogin.submit().click();
	  wait(1000);  
 }

  @AfterTest (description = "log out")
  public void Logout() {
	 wait(3000);
	  Login logout = new Login();
	  logout.Logout().click();
	  driver.close();
  }

}
