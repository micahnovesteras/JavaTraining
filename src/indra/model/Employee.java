package indra.model;

public class Employee {
	private String firstName;
	private String midlleName;
	private String lastName;
	private boolean isContractual;
	private String status; // status is Regular if isContractual is false


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidlleName() {
		return midlleName;
	}

	public void setMidlleName(String midlleName) {
		this.midlleName = midlleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getIsContractual() {
		return isContractual;
	}

	public void setIsContractual(boolean isContractual) {
		this.isContractual = isContractual;
	}

	public String getStatus() {
		status = isContractual? "Contractual" : "Regular";
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmployeeFullName() {
		String fullName = firstName.concat(" ").concat(midlleName).concat(" ").concat(lastName);
		return fullName;
	}
}
