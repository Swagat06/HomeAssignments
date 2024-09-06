package week3.listAssignmentW3;

		import java.time.Duration;
		import java.util.List;
		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class Ajio {

			String searchBox = "bags";
			String gender = "Men";
			String category = "Fashion Bags";

			ChromeDriver driver = new ChromeDriver();
			public  void launchBrowser() {
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				// Launch the URL https://www.ajio.com/
				driver.get("https://www.ajio.com/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			public void uiOperations() throws InterruptedException {
				// In the search box, type as "bags" and press enter
				WebElement srchBox = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
				srchBox.sendKeys(searchBox, Keys.ENTER);
				
				// To the left of the screen under "Gender" click on "Men"			
				WebElement gnder = driver.findElement(By.xpath("//label[contains(text(),'"+gender+"')]"));
				gnder.click();
				
				Thread.sleep(3000);
				// Under "Category" click "Fashion Bags"
				WebElement ctgry = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
				ctgry.click();
				
				Thread.sleep(3000);
				// Print the count of the items found.
				WebElement itemsfound = driver.findElement(By.xpath("//div[contains(@aria-label,\"Items Found\")]/strong"));
				String founditems = itemsfound.getText();
				System.out.println("Total Number of Bags Found = "+founditems);
				
				// Get the list of brand of the products displayed in the page and print the list.
				List<WebElement> brands = driver.findElements(By.xpath("//div[@class=\"brand\"]/strong"));
				for(WebElement brand : brands) {
					String availableBrand = brand.getText();
					System.out.println(availableBrand);
				}
				// Get the list of names of the bags and print it
				List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class=\"nameCls\"]"));
				for(WebElement bagName : bagNames) {
					String bagsName = bagName.getText();
					System.out.println(bagsName);
				}
			}
			
			public static void main(String[] args) throws InterruptedException {
				Ajio aj = new Ajio();
				aj.launchBrowser();
				aj.uiOperations();
				
			}
           

	}


