package week3.polymorphismAssignmentW3;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint+" Request is sent");
	}

	public void sendRequest(String endpoint,String requestBody,boolean requestStatus )
	{
		System.out.println(endpoint+" Request is sent");
		System.out.println(requestBody+" Request body is created");
		System.out.println("Request status is "+requestStatus);
	}
	public static void main(String[] args) {
		//Oject crreation of APIClient

		APIClient ap = new APIClient();
		ap.sendRequest("API");
		ap.sendRequest("API","Payment", true);
	}

}
