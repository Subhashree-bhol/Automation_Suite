package Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	//plugin = {"pretty", "json:target/cucumber-report/cucumber.json"}	
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

	)
public class RunCucumberTest {
}
