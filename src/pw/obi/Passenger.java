package pw.obi;

public class Passenger {

	private String id;
	
	public Passenger(String id)
	{
		this.id = id;			
	}
	
	public void changeId(String newId)
	{
		this.id = newId;
	}
	
	public String getName()
	{
		return id;			
	}
	
	
}
