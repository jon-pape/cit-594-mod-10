import java.util.Date;

public class Doctor extends Employee {
	/*public Doctor(String name, Date dob) {
		super(name, dob);
		// TODO Auto-generated constructor stub
	}*/

	public void discharge(Patient patient) {
		Date today = new Date();
		today.getTime();
		patient.dischargeDate(today);
	}
}