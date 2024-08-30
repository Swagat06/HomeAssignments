package week2.assignmentsW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		//To lunch Url
		driver.get("http://leaftaps.com/opentaps/.");

		driver.manage().window().maximize();

		// To Enter Username and Password
		WebElement usernameFiled = driver.findElement(By.id("username"));
		usernameFiled.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// To Enter on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);

		// To Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// To Click on Leads
		driver.findElement(By.linkText("Leads")).click();

		// To Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swagat");

		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aher");

		//Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");

		//Click the "Create Lead" button
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

		//Verify title displayed correctly
		
		String title = driver.getTitle();
		String expTitle = "View Lead | opentaps CRM";

		if (expTitle.equals(title)){
			System.out.println(title+ "  := Title is displayed correctly");
		}else {
			System.out.println("Title is not displayed correctly");
		}

		driver.close();
	}

}


