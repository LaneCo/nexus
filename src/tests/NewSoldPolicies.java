package tests;

import org.testng.annotations.Test;
import layouts.SoldPoliciesReport;
import utilities.Driver;
import utilities.LogSoldPolicies;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class NewSoldPolicies extends Driver {
	
	utilities.Config cfg = new utilities.Config();
	ITestResult result;
	NewLogin login;
	String user;
	String pass;
	String line;
	String policy;

  @BeforeMethod
  public void openBrowser() {
	  
	  String url = cfg.getProperty("url_nexus");
	  user = cfg.getProperty("user_nexus");
	  pass = cfg.getProperty("pass_nexus");
	  policy = cfg.getProperty("policy");
	  driver.navigate().to(url);
	  // Maximize the browser
	  driver.manage().window().maximize();	
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  login = new NewLogin();
  }
  
  @Test (priority = 2, description = "Search policies in the sold policies report")
  public void searchPolicy() throws IOException {
	  //Policy to search
	  login.login(user, pass);
	  SoldPoliciesReport consult = new SoldPoliciesReport();
	  consult.getMenu().click();
	  consult.getSubMenu().click();
	  wait(4000);
	  consult.getModule().click();
	  String Text = consult.getModule().getText();
	  System.out.println(Text); //pruebas
	  consult.getSelectContract().selectByVisibleText("Contract No.");
	  wait(1000);
	  consult.getContract().sendKeys(policy);
	  consult.getSearch().click();
	  String Text2 = consult.getPolicy().getText();
	  System.out.println("Policy: "+policy);
	  System.out.println("Text2 : "+Text2);
	  if (policy.equals(Text2)){
		  line = "La poliza: "+Text2+" se encontro correctamente en el reporte de polizas vendidas";
		  System.out.println(line);
		  LogSoldPolicies.write(line);
	  }else{
		  line = "No se encontro en el reporte de polizas vendidas, la poliza: "+Text2;
		  System.out.println(line);
		  LogSoldPolicies.write(line);
	  }
  }

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  System.out.println("@AfterTest closing driver");
	  wait(3000);
	  driver.quit();
      try
      {
      if(result.getStatus() == ITestResult.SUCCESS)
      {
    	  LogSoldPolicies.write("The test passed");
          System.out.println("passed **********");
      }
      else if(result.getStatus() == ITestResult.FAILURE)
      {
    	  LogSoldPolicies.write("The test failed");
          System.out.println("Failed ***********");
      }

      else if(result.getStatus() == ITestResult.SKIP )
      {
          System.out.println("Skiped***********");
      }
      }
      catch(Exception e)
      {
    	  e.printStackTrace(); 
      }
  }

}
