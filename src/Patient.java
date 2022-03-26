import java.util.Date;

public class Patient extends Person {
	
	//constructor
	/*public Patient(String name, Date dob) {
		super(name, dob);
		// TODO Auto-generated constructor stub
	}*/
	
	//variables
	public String id;
	public Date arrivalDate;
	public Date dischargeDate;
	public String status;
	
	//methods
	public void arrivalDate(Date arrival) {
		this.arrivalDate = arrival;
	}
	
	public void dischargeDate(Date discharge) {
		this.dischargeDate = discharge;
	}
	

}