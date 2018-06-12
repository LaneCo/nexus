package tests;

import org.testng.annotations.Test;
import layouts.Login;
import utilities.Driver;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

public class NewLogin extends Driver{
  
	Login objLogin = new Login();
	utilities.Config cfg = new utilities.Config();
	
  @BeforeTest
  public void beforeTest() {
	  
	  	String url = cfg.getProperty("url_nexus");
	  	System.out.println("url: "+url);
		driver.navigate().to(url);
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
  }
  
  @Test (description = "Log in")
  public void login(String user , String password)  {
 	  System.out.println("Log in");
	  objLogin.getUserName().sendKeys(user);
	  objLogin.getPassword().sendKeys(password);	  
	  wait(1000);	
	  objLogin.getUserName().sendKeys(Keys.ESCAPE);
	  objLogin.getLogin().click();
	  wait(1000);  
 }

  @AfterTest (description = "log out")
  public void Logout() {
	 wait(3000);
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("menu_title");
	  objLogin.Logout().click();
	  driver.close();
  }

}
