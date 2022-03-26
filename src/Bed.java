public class Bed{
	protected String id;
	protected Patient patient;
	
	//constructor
	public Bed(String id) { 
		this.id = id;
	}
	//methods
	public String id() { return id;}
	
	public void updateId(String id) { this.id = id;} 
	
	public String toString( ) { // for printing
		return "Bed(id:" + id + ")";
	}
}