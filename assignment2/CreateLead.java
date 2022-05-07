package week6.day2.assignment2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@Test( /* groups = "createLead" */ )
	public void createLead() {
	driver.findElement(By.id("createLeadForm_companyName1")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_first")).sendKeys("Amirthavalli");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	driver.findElement(By.name("submitButton")).click();

	}
}
