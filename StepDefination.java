package Feature;

import org.openqa.selenium.By;

import com.main.MainMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefination extends MainMethod {

	@Given("I intialize {string} browser")
	public void i_intialize_browser(String browser) {
		browsers(browser);
	}

	@Given("i browse to url {string}")
	public void i_browse_to_url(String url) {
		driver.navigate().to(url);
	}

	@Then("i click on xpath {string}")
	public void i_click_on_xpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	@And("user waits for {int} sec")
	public void user_waits_for_sec(int value) throws InterruptedException {
		Thread.sleep(value * 1000);
	}

}
