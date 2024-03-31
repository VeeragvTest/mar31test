package Login.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"./src/test/resources/Featurelogin/datadem.feature"},
		glue="Login",   //Package name
		publish= true,   //For report create
		plugin= {"pretty",
				"html:target/output.html",
				"junit:target/output.xml",
				"json:target/output.html"},
		monochrome=true //remove unwanted symbols from the console
		//dryRun=true
		//tags="@datas"
		
		)

public class Runnerdemo {

}
