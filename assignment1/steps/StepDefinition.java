package steps;


import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition extends BaseClass {
	
	@Given("Click on CRM link")
	public void CRM() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@Given("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed)
			System.out.println("HomePage is displayed");
		else
			System.out.println("Home Page is not displayed");
	}

	/*
	 * @But("Error message should be displayed") public void errorMessage() {
	 * 
	 * String text =
	 * driver.findElement(By.xpath("//div[@Id='errorDiv']/p")).getText();
	 * if(text.equalsIgnoreCase("The Following Errors Occurred:"))
	 * System.out.println("Error Message is displayed"); else
	 * System.out.println("Correct credential is passed"); }
	 */

	

}
