package week3.inheritanceAssignmentW3;

public class LoginTestData extends TestData {

	//first method
	public void enterUsername() 
	{
		System.out.println("Enter Username");
	}
	//Second method
		public void enterPassword()  
		{
			System.out.println("Enter password");
		}
	//Main method
		public static void main(String[] args) {
			
			LoginTestData ln = new LoginTestData();
			ln.enterCredentials();
			ln.navigateToHomePage();
			ln.enterUsername();
			ln.enterPassword();
		}
}
