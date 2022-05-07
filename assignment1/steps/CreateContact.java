package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;

public class CreateContact extends BaseClass{
	@Given("Click on Contacts")
	public void clickContact() {
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	@Given("Click on Create Contact")
	public void createContact() {
		driver.findElement(By.linkText("Create Contact")).click();
	}

	@Given("Enter FirstName {string}")
	public void firstname(String frstName) {
		driver.findElement(By.id("firstNameField")).sendKeys(frstName);
	}
	
	@Given("Enter LastName as {string}")
	public void lastname(String lastName) {
		driver.findElement(By.id("lastNameField")).sendKeys(lastName);

	}
	
	
	@Given("Enter department name {string}")
	public void departmentName(String dName) {
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys(dName);
	}

	@Given("Enter the {string}")
	public void description(String desc) {
		driver.findElement(By.id("createContactForm_description")).sendKeys(desc);
	}

	@Given("Enter email {string}")
	public void email(String email) {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
	}

	String expecttitle = "View Contact | opentaps CRM";

	@Given("Created Contact successfully")
	public void createdContact() {
		String title = driver.getTitle();
		Assert.assertEquals(title, expecttitle);
		System.out.println("Contact Created Successfully");
	}

}
