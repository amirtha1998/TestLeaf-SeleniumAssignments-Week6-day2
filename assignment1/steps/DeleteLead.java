package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	@Given("Click on Phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[@Class='x-tab-strip-inner']/span[text()='Phone']")).click();
	}

	@Given("Enter {string}")
	public void phoneNumber(String ph) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}

	@When("Click on Delete Button")
	public void deleteButton() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);
	}

	String expectedtitle = "My Leads | opentaps CRM";

	@Then("Lead is Deleted")
	public void delete() {
		String title = driver.getTitle();
		Assert.assertEquals(title, expectedtitle);
		System.out.println("Lead is Deleted Successfully");
	}

}
