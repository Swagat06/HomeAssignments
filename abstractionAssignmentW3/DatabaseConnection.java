package week3.abstractionAssignmentW3;

public interface DatabaseConnection {
	
	//Abstract Methods
	public void  connect();
	
	public void  disconnect();
	
	public void  executeUpdate();
	
	
}
