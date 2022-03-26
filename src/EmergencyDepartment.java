import java.util.Queue;

public class EmergencyDepartment{
	public Queue<Patient> patients;
	public Room[] rooms;
	public Doctor oncall;
	public Employee[] employees;
	
	public EmergencyDepartment() {
		patients = null;
		rooms = null;
		oncall = null;
		employees = null;
	}
}
	