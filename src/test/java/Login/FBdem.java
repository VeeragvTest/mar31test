package Login;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBdem {
	
	EdgeDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("user enters the username in the username field")
	public void user_enters_the_username_in_the_username_field(DataTable data) {
	  WebElement ema = driver.findElement(By.id("email"));
	  List<String> l = data.asList();
	  ema.sendKeys(l.get(0));
	 
	}

}
