package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver=new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shivashankari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("abhi");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("testlocal");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("this is description");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");

	WebElement eleDropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd=new Select(eleDropdown);
	dd.selectByVisibleText("NewYork");

	driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);
		
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("duplicatetest");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shivaduplicatetest");
	driver.findElement(By.name("submitButton")).click();
	
	title=driver.getTitle();
	System.out.println(title);
		

	

}


}