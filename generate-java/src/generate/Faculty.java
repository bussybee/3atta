package generate;

import java.util.ArrayList;

public class Faculty {

	public String name;
	public ArrayList<Institute> institutes;
	public Dean dean;
	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Institute> getInstitutes() {
		return institutes;
	}

	public void setInstitutes(ArrayList<Institute> institutes) {
		this.institutes = institutes;
	}

	public Dean getDean() {
		return dean;
	}

	public void setDean(Dean dean) {
		this.dean = dean;
	}
}