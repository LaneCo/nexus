package layouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class SoldPoliciesReport extends Driver{
	
	private String menu;
	private String subMenu;
	private String module;
	private String selectSearch;
	private String selectContract;
	private String contract;
	private String search;
	private String policy;
	
	public SoldPoliciesReport () {
		menu = "t13";
		subMenu = "link13_1";
		module = "ddl_itemOpt";
		selectSearch = "ddl_itemOpt";
		selectContract = "ddl_itemOpt";
		contract = "txt_value";
		search = "inp_search";
		policy = "ItemsGrid_ctl03_HyperLink2";
	}
	
	public WebElement getMenu() {
		driver.switchTo().frame("menu_main");
		return driver.findElement(By.id(menu));
	}

	public WebElement getSubMenu() {
		return driver.findElement(By.id(subMenu));
	}

	public WebElement getModule() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu_inbox");
		return driver.findElement(By.id(module));
	}

	public WebElement getSelectSearch() {
		return driver.findElement(By.id(selectSearch));
	}

	public Select getSelectContract() {
		wait(5000);
		return new Select (driver.findElement(By.id(selectContract)));
	}

	public WebElement getContract() {
		return driver.findElement(By.id(contract));
	}

	public WebElement getSearch() {
		return driver.findElement(By.id(search));
	}

	public WebElement getPolicy() {
		wait(2000);
		return driver.findElement(By.id(policy));
	}

}
