package generate;

import java.util.ArrayList;

public class Institute {

	public String name;
	public String address;

	public ArrayList<ResearchEmployee> researchEmployees;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<ResearchEmployee> getResearchEmployees() {
		return researchEmployees;
	}

	public void setResearchEmployees(ArrayList<ResearchEmployee> researchEmployees) {
		this.researchEmployees = researchEmployees;
	}

	public void getStudents() {
		// TODO - implement Institute.getStudents
		throw new UnsupportedOperationException();
	}

}