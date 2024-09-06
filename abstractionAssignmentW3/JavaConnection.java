package week3.abstractionAssignmentW3;

public class JavaConnection implements DatabaseConnection {

	// Abstract methods are implemented
	@Override
	public void connect() {

		System.out.println("VPN is Connected");

	}

	@Override
	public void disconnect() {

		System.out.println("VPN is Disconnected");	
	}

	@Override
	public void executeUpdate() {

		System.out.println("VPN Config are Updated");
	}
	public static void main(String[] args) 
	{
       //Object creation for JavaConnection class
		JavaConnection jc= new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}



}
