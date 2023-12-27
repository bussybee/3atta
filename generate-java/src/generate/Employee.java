package generate;

public class Employee {

	public String name;
	public int ssNo;
	public String email;
	public int numberOfEmployers;

	public Employee(String name, int ssNo, String email, int numberOfEmployers) {
		this.name = name;
		this.ssNo = ssNo;
		this.email = email;
		this.numberOfEmployers = numberOfEmployers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsNo() {
		return ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberOfEmployers() {
		return numberOfEmployers;
	}

	public void setNumberOfEmployers(int numberOfEmployers) {
		this.numberOfEmployers = numberOfEmployers;
	}

	public void getSalary() {
		// TODO - implement Employee.getSalary
		throw new UnsupportedOperationException();
	}

}