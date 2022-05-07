package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	


	@Given("Click on Leads")
	public void clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@Given("Click on CreateLead")
	public void clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Given("Enter Company name as {string}")
	public void companyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}

	@Given("Enter FirstName as {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}

	@Given("Enter LastName {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}

	@When("Click on Create Button")
	public void createButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	String exptitle="View Lead | opentaps CRM";
	@Then("Lead is Created")
	public void leadIsCreated() {
		String title = driver.getTitle();
		/*if (title.contains("View"))
			System.out.println("Lead is created successfully");*/
		Assert.assertEquals(title, exptitle);
			System.out.println("Lead is Created");
	}
}
