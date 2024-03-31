package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	
	EdgeDriver driver;
	
	@Before(order=0)
	public void setup()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	

	@Given("user should be on login page")
	public void driverstart() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("user pass the values for {string} and {string}")
	public void user_pass_the_values_for_and(String user, String pass) {
		WebElement usernam = driver.findElement(By.name("username"));
		usernam.sendKeys(user);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(pass);
	    
	}

	@When("clicking login button")
	public void clicking_login_button() {
	    WebElement cli = driver.findElement(By.xpath("//button[text()=' Login ']"));
	    cli.click();
	}

	@Then("user landed on home page")
	public void user_landed_on_home_page() {
	    WebElement dash = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	    boolean d = dash.isDisplayed();
	    Assert.assertTrue(d);
	}
	
	@After(order=2)
	public void teardown()
	{
		driver.close();
	}
	
	@After(order=1)
	public void teardown1()
	{
		driver.close();
	}
	

}
