package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	@Given("Click on Find Lead")
	public void findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("Enter the Firstname {string}")
	public void frstName(String frstName) {
		driver.findElement(By.xpath("//div[@Class='x-form-item x-tab-item'][2]//input[@name='firstName']"))
				.sendKeys(frstName);
	}

	@Given("Click on Find Leads button")
	public void findLeads() throws InterruptedException {
		driver.findElement(By.xpath("//div[@Class='x-panel-footer x-panel-footer-noborder']//button")).click();
		Thread.sleep(1000);
	}

	@Given("Click on first resulting lead")
	public void firstLead() {
		driver.findElement(By.xpath("//div[@Class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	}

	@Given("Click Edit button")
	public void editbutton() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Change the {string}")
	public void companyChange(String compName) {
		driver.findElement(By.xpath("//input[@Id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@Id='updateLeadForm_companyName']")).sendKeys("Cognizant");
	}

	@When("Click on Update Button")
	public void updateButton() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

	String exptitle = "View Lead | opentaps CRM";

	@Then("Lead is Edited")
	public void editedLead() {
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		System.out.println("Lead is Edited Successfully");
	}
}
