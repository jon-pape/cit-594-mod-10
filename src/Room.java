public class Room{
	public String number;
	public Bed[] beds;
	
	//constructor
	public Room(String number) { 
		this.number = number;
		this.beds = null;
	}
	
	//methods
	/*public String number() { return number;}
	
	public void updateNumber(String number) { this.number = number;} 
	
	public String toString( ) { // for printing
		return "Room(number:" + number + ")";
	}*/
}