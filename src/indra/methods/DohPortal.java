package indra.methods;
import indra.model.Employee;
public class DohPortal extends AbstractDohPortal {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Micah Novesteras";
	}
	
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setFirstName("Micah");
		emp.setMidlleName("Santos");
		emp.setLastName("Novesteras");
		emp.setIsContractual(false);
		return emp;
	}
}
