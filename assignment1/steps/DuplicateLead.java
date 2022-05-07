package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DuplicateLead extends BaseClass{
	@Given("Click on DuplicateLead Button")
	public void duplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	String exptitle = "View Lead | opentaps CRM";

	@Then("Lead is Duplicated")
	public void dupLead() {
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		System.out.println("Lead is Duplicated Successfully");
	}
}
